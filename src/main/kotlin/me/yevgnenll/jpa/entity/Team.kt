package me.yevgnenll.jpa.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Team (
  @Id
  var id:Long? = null,
  var name:String? =null
)
