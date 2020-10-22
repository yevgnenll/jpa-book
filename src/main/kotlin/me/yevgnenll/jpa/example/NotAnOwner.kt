package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.JpaSampleApplication
import me.yevgnenll.jpa.entity.Member
import me.yevgnenll.jpa.entity.Team
import javax.persistence.EntityManager

fun main() {
  JpaSampleApplication.jpa { run { testSaveNotOwner(it) }}
}

fun notOwnerSave(em: EntityManager) {
  var team = Team("team100", "팀100")
  em.persist(team)
  team.members = mutableListOf(Member("member100", "멤버100"),
    Member("member101", "멤버101"))
}

fun testSaveNotOwner(em: EntityManager) {
  var member1 = Member("member1", "회원1")
  em.persist(member1)
  var member2 = Member("member2", "회원2")
  em.persist(member2)

  var team = Team("team1", "팀1")
  team.members = mutableListOf(member1, member2)

  em.persist(team)
}
