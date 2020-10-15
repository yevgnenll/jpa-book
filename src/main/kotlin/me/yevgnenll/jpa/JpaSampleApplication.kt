package me.yevgnenll.jpa

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.EntityTransaction
import javax.persistence.Persistence

// 이거 AOP 로 빼면 좋을거 같은데?
fun main(args:Array<String>) {
  var emf: EntityManagerFactory = Persistence.createEntityManagerFactory("jpabook")
  var em:EntityManager = emf.createEntityManager();
  var tx:EntityTransaction = em.transaction;

  try {
    tx.begin()
    logic(em)
    tx.commit()
  } catch (ex:Exception) {
    tx.rollback()
  } finally {
    em.close()
  }
  emf.close()
}
fun logic(em:EntityManager) {

}
