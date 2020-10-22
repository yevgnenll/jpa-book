package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.JpaSampleApplication
import me.yevgnenll.jpa.entity.Member
import me.yevgnenll.jpa.entity.Team
import javax.persistence.EntityManager

fun main(args:Array<String>) {
  JpaSampleApplication.jpa { run { testSave(it) } }
  JpaSampleApplication.jpa { run { testSelect(it) } }
  JpaSampleApplication.jpa { run { jpqlSelect(it) } }
}

fun jpqlSelect(em:EntityManager) {
  var jpql:String = "select m from Member m join m.team t where t.name=:teamName"
  var results = em.createQuery(jpql, Member::class.java)
    .setParameter("teamName", "팀1")
    .resultList
  for (member in results) {
    println("member id: ${member.id} 이름: ${member.username}")
  }
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
