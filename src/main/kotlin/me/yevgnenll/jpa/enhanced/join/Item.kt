package me.yevgnenll.jpa.enhanced.join

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
data class Item (
  @Id
  @GeneratedValue
  @Column(name = "item_id")
  var id:Int,
  var name:String,
  var price:Int
)



