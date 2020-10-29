package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.JpaSampleApplication
import me.yevgnenll.jpa.vtype.Address
import me.yevgnenll.jpa.vtype.collection.Member
import javax.persistence.EntityManager

fun main() {
  JpaSampleApplication.jpa {
    run {
      insertCollection(it)
    }
  }
}

fun insertCollection(em: EntityManager) {
  var addressHistory: MutableList<Address> = ArrayList()
  addressHistory.add(Address("서대문구", "통일로", "123-456"))
  addressHistory.add(Address("평창군", "용편면", "123-456"))

  var food: MutableSet<String> = HashSet()
  food.add("라면")
  food.add("단백질")
  food.add("참치")
  var member = Member(favoriteFood = food, addressHistory = addressHistory)

  em.persist(member)
}


