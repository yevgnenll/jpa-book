package me.yevgnenll.jpa

import me.yevgnenll.jpa.entity.Member
import me.yevgnenll.jpa.entity.Team
import org.junit.Assert.assertEquals
import org.junit.Test

class RelationTest {

  @Test
  fun `순수한객체 양방향`() {
    var team = Team("team1", "팀1")
    var member1 = Member("member1", "회원1")
    var member2 = Member("member2", "회원2")

    member1.team = team
    member2.team = team

    var members = team.members
    println("size: ${members.size}")
  }

  @Test
  fun `순수한객체 양방향 2`() {
    var team = Team("team1", "팀1")

    var member1 = Member("member1", "회원1")
    member1.team = team

    var member2 = Member("member2", "회원2")
    member2.team = team

    team.members = mutableListOf(member1, member2)

    var members = team.members
    println("size: ${members.size}")
  }

  @Test
  fun `orm 양방향`() {
    JpaSampleApplication.jpa { run {
      var team = Team("team1", "팀1")
      it.persist(team)

      var member1 = Member("member1", "회원1")
      member1.team = team
      it.persist(member1)

      var member2 = Member("member2", "회원2")
      member2.team = team
      it.persist(member2)

      team.members = mutableListOf(member1, member2)
    } }
  }

  @Test
  fun `양방향 리팩토링 setTeam 함수를 사용해 member의 팀이 변경된다면, 이전 팀의 멤버 size 는 감소해야 한다`() {
    JpaSampleApplication.jpa { run {
      var team = Team("team1", "팀1")
      it.persist(team)

      var member1 = Member("member1", "회원1")
      member1.team = team
      it.persist(member1)

      var member2 = Member("member2", "회원2")
      member2.team = team
      it.persist(member2)

      team.members = mutableListOf(member1, member2)
      var team2 = Team("team2", "팀2")
      it.persist(team2)

      member2.team = team2
      assertEquals(team.members.size, 1)
    } }
  }

}
