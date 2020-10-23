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

    JpaSampleApplication.jpa {
      run {
        var member = it.find(Member::class.java, "member1")
        var member2 = it.find(Member::class.java, "member2")
        var member1 = it.find(Member::class.java, "member1")
        assertEquals(member.id, "member1")
        assertNotEquals(member1, member2)
        assertEquals(member, member1)
        assertTrue(member == member1)
      }
    }
  }

  @Test
  fun `entity 변경이 일어난다`() {
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member = em.find(Member::class.java, "member1")
        assertEquals(member.number, null)
        member.number = 1010
      }
    }
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member = em.find(Member::class.java, "member1")
        assertEquals(member.number, 1010)
      }
    }
  }

  @Test
  fun `준영속 상태 entity 는 DB에 저장되지 않는다`() {
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member:Member = Member("member100", "john")
        em.persist(member)
        em.detach(member)
      }
    }
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var member = em.find(Member::class.java, "member100")
        assertNull(member)
      }
    }
  }

  @Test
  fun `merge 는 준영속 상태의 entity를 영속 상태로 복귀시킨다`() {
    var member = Member("member200", "sena")

    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        em.persist(member)
      }
    }
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var sena = em.find(Member::class.java, "member200")
        assertTrue(em.contains(sena))
        sena.number = 1024
      }
    }

    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        em.flush()
        var mergedMember:Member = em.merge(member)
        var list = em.createQuery("select m from Member m").resultList
        println(list.size)
        assertTrue(em.contains(mergedMember))
        assertEquals(member.number, null)
        assertFalse(em.contains(member)) // 둘의 객체 상태가 다르다
        println(mergedMember)
        println(member)
      }
    }
    JpaSampleApplication.jpa { em: EntityManager ->
      run {
        var sena = em.find(Member::class.java, "member200")
//        assertEquals(sena.number, 1024)
      }
    }
  }

}

