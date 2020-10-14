package me.yevgnenll.jpa.entity

data class Member (
  val id:String?,
  val team:Team,
  val username:String
) {
  fun getOrder():String {
    return "order"
  }
}

data class Team (
  var id:Long? = null,
  var name:String? =null
)
