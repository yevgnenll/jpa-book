package me.yevgnenll.jpa.entity

import javax.persistence.*

@Entity
data class Member (
  @Id
  @Column(name = "member_id")
  var id:String?,
  var username:String,
  @ManyToOne
  @JoinColumn(name = "team_id")
  var team:Team?
) {
  var number:Long? = null
}
