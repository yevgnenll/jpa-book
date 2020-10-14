package me.yevgnenll.jpa.entity

open class Item {
  var id:Int?=null
  var name:String?=null
  var price:Int?=null
}

class Album (
  val artist:String
):Item()

class Movie (
  val director:String,
  val actor:String
):Item()

class Book(
  val author:String,
  val isbn:String
):Item()
