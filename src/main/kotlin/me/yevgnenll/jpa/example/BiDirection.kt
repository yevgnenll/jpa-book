package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.JpaSampleApplication
import me.yevgnenll.jpa.entity.Member
import me.yevgnenll.jpa.entity.Team
import javax.persistence.EntityManager

fun main() {
  JpaSampleApplication.jpa { run { testSave(it) } }
  JpaSampleApplication.jpa { run { biDirection(it) } }
}

fun biDirection(em: EntityManager) {
  var team = em.find(Team::class.java, "team1")
  var members: List<Member> = team.members!!

  for (member in members) {
    println(member)
  }
}
