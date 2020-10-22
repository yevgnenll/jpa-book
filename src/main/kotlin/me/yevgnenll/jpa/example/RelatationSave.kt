package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.JpaSampleApplication
import me.yevgnenll.jpa.entity.Member
import me.yevgnenll.jpa.entity.Team
import javax.persistence.EntityManager

fun main(args:Array<String>) {
  JpaSampleApplication.jpa { run { testSave(it) } }
  JpaSampleApplication.jpa { run { testSelect(it) } }
}

fun testSelect(em:EntityManager) {
  var member = em.find(Member::class.java, "member1")
  var team:Team? = member.team
  println("팀 이름: $team")
}

fun testSave(em:EntityManager) {
  var team = Team("team1", "팀1")
  em.persist(team)

  var member1 = Member("member1", "멤버1")
  member1.team = team
  em.persist(member1)

  var member2 = Member("member2", "멤버2", team)
  em.persist(member2)
}
