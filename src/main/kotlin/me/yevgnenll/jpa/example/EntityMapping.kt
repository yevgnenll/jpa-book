package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.entity.Member
import me.yevgnenll.jpa.entity.Team

fun main(args: Array<String>) {
  val team = Team("team1", "팀1",)
  var member1 = Member("member1", "회원1", team)
  var member2 = Member("member2", "회원2", team)

  member1.team = team
  member2.team = team

  var findTeam = member1.team!!
}
