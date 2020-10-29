package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.vtype.Address
import me.yevgnenll.jpa.vtype.User

fun main() {
  eqAndId()
}

fun eqAndId() {
  var a = Address("서울시", "서초구", "방배동")
  var b = Address("서울시", "서초구", "방배동")
  println("a, b ==: ${a === b}, a.equals(b): ${a.equals(b)}")
}

fun referenceTest() {
  var address = Address("서대문구", "통일로", "12345")
  var user = User("seungkwon", address)

  address.city = "수지구"
  var user2 = User("michael", address)

  println("user: ${user.homeAddress.city} user2: ${user2.homeAddress.city}")
}
