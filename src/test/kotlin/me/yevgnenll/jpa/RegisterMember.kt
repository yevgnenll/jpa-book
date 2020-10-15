package me.yevgnenll.jpa

import me.yevgnenll.jpa.entity.Member
import org.junit.Test
import org.junit.Assert.*
import javax.persistence.EntityManager

class RegisterMember {

  @Test
  fun `member를 등록한다`() {
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member = Member("member1", "josh")
        var member2 = Member("member2", "bodguy")
        em.persist(member)
        em.persist(member2)
      }
    }

    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member = em.find(Member::class.java, "member1")
        var member2 = em.find(Member::class.java, "member2")
        var member1 = em.find(Member::class.java, "member1")
        assertEquals(member.id, "member1")
        assertNotEquals(member1, member2)
        assertEquals(member, member1)
        assertTrue(member == member1)
      }
    }
  }
}

