package me.yevgnenll.jpa

import me.yevgnenll.jpa.entity.Member
import org.junit.Test
import javax.persistence.EntityManager
import org.junit.Assert.*

class RegisterMember {

  @Test
  fun `member를 등록한다`() {
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member = Member("member1", "josh")
        em.persist(member)
      }
    }

    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member:Member = em.find(Member::class.java, "member1")
        assertEquals(member.id, "member1")
      }
    }
  }
}

