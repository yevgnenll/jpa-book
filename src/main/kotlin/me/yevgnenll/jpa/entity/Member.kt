package me.yevgnenll.jpa.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Member (
  @Id
  val id:String?,
  val username:String
) {
  fun getOrder():String {
    return "order"
  }
}
