package me.yevgnenll.jpa.entity

import org.hibernate.annotations.DynamicUpdate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@DynamicUpdate
data class Member (
  @Id
  val id:String?,
  var username:String
) {
  var number:Int? = null
  fun getOrder():String {
    return "order"
  }
}
