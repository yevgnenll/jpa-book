package me.yevgnenll.jpa.entity

class Album(
  id: Int,
  name: String,
  price: Int,
  val artist: String,
):Item(id, name, price)
