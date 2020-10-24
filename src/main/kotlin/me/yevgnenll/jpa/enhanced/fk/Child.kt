package me.yevgnenll.jpa.enhanced.fk

import javax.persistence.*

@Entity(name = "fk-child")
class Child (
  @Id @GeneratedValue
  @Column(name = "child_id")
  var id: Long,
  var name: String,

  @ManyToOne
  @JoinColumn(name = "parent_id")
  var parent: Parent
)
