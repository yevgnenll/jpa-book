package me.yevgnenll.jpa.entity

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("M")
class Movie (
  id: Int,
  name: String,
  price: Int,
  val director:String,
  val actor:String
):Item(id, name, price)
