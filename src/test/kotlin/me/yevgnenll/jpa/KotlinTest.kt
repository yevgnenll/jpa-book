package me.yevgnenll.jpa

import me.yevgnenll.jpa.entity.Member
import org.junit.Assert.*;
import me.yevgnenll.jpa.entity.Team
import org.junit.Test

class KotlinTest {
  @Test
  fun `되는가`() {
    assertEquals(10 * 10, 100)
    var team: Team = Team("team1", "팀1")
    var member: Member = Member("id", "josh")
  }

}
