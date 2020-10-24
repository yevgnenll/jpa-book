package me.yevgnenll.jpa.enhanced.fk

import javax.persistence.*

@Entity(name = "fk-parent")
class Parent (
  @Id @GeneratedValue
  @Column(name = "parent_id")
  var id: Long,
  var name: String
)
