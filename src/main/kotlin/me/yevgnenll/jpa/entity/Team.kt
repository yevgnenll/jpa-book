package me.yevgnenll.jpa.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Team(
  @Id
  @Column(name = "team_id")
  var id:String,
  var name:String,
)
