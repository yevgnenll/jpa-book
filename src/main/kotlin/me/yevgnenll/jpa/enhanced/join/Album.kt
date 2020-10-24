package me.yevgnenll.jpa.enhanced.join

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("A")
class Album (
  id: Int,
  name: String,
  price: Int,
  val artist: String,
): Item(id, name, price)
