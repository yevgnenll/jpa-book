package me.yevgnenll.jpa

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.EntityTransaction
import javax.persistence.Persistence

class JpaSampleApplication {
  companion object {
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("jpabook")
    fun jpa(callback: (EntityManager) -> Unit) {
      var em: EntityManager = emf.createEntityManager();
      var tx: EntityTransaction = em.transaction;

      try {
        tx.begin()
        callback(em)
        tx.commit()
      } catch (ex: Exception) {

        tx.rollback()
      } finally {
        em.close()
      }
    }

    fun close() {
      emf.close()
    }
  }
}

