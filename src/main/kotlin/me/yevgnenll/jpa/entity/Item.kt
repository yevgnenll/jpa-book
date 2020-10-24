package me.yevgnenll.jpa.entity

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id

open class Item (
  @Id
  @GeneratedValue
  @Column(name = "item_id")
  var id:Int,
  var name:String,
  var price:Int
)



