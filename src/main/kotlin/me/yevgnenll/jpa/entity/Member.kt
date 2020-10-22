package me.yevgnenll.jpa.entity

import javax.persistence.*

@Entity
data class Member (
  @Id
  @Column(name = "member_id")
  var id:String?,
  var username:String,
) {
  constructor(id: String, username: String, team:Team):this(id, username) {
    this.id = id
    this.username = username
    this.team = team
  }
  @ManyToOne
  @JoinColumn(name = "team_id")
  var team:Team? = null
  var number:Int? = null
}
