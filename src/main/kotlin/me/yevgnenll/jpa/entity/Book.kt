package me.yevgnenll.jpa.entity

class Book (
  id: Int,
  name: String,
  price: Int,
  val author:String,
  val isbn:String
):Item(id, name, price)
