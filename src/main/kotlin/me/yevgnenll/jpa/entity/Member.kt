package me.yevgnenll.jpa.entity

import javax.persistence.Id

data class Member (
  @Id
  var id:String?,
  var username:String
) {
  var team:Team? = null
  var number:Long? = null
}
