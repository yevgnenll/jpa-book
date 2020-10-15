package me.yevgnenll.jpa

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.EntityTransaction
import javax.persistence.Persistence

class JpaSampleApplication {
  companion object {
    fun jpa(callback:(EntityManager) -> Unit) {
      var emf: EntityManagerFactory = Persistence.createEntityManagerFactory("jpabook")
      var em:EntityManager = emf.createEntityManager();
      var tx:EntityTransaction = em.transaction;

      try {
        tx.begin()
        callback(em)
        tx.commit()
      } catch (ex:Exception) {
        tx.rollback()
      } finally {
        em.close()
      }
      emf.close()
    }
  }
}

