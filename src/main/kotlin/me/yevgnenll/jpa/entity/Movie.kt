package me.yevgnenll.jpa.entity

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.PrimaryKeyJoinColumn

@Entity
@DiscriminatorValue("M")
@PrimaryKeyJoinColumn(name = "book_id")
class Movie (
  id: Int,
  name: String,
  price: Int,
  val director:String,
  val actor:String
):Item(id, name, price)
