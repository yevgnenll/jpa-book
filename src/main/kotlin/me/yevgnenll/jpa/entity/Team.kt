package me.yevgnenll.jpa.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Team(
  @Id
  @Column(name = "team_id")
  var id:String,
  @Column(name = "name")
  var name:String,
) {
  @OneToMany(mappedBy = "team")
  var members: List<Member>? = ArrayList()
}
