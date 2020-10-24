package me.yevgnenll.jpa.entity

class Movie (
  id: Int,
  name: String,
  price: Int,
  val director:String,
  val actor:String
):Item(id, name, price)
