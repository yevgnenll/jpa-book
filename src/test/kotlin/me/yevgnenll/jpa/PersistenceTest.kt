package me.yevgnenll.jpa

import me.yevgnenll.jpa.entity.Member
import org.junit.Test

import org.junit.Assert.*

class PersistenceTest {

  @Test
  fun `동일한 id는 contrain violation이 뜬다`() {

    JpaSampleApplication.jpa {
      var member = Member("member1000", "josh")
      it.persist(member)
    }
    JpaSampleApplication.jpa {
      var member = it.find(Member::class.java, "member1000")
      it.detach(member)
      println(member.id)
      member.id = null
      it.persist(member)
      var size = it.createQuery("select m from Member m").resultList.size
      println(size)
      assertEquals(size, 2)
    }

  }
}
