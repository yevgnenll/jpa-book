package me.yevgnenll.jpa.enhanced.fk

import javax.persistence.*

@Entity(name = "fk_child")
class Child (
  @Id @GeneratedValue
  @Column(name = "child_id")
  var id: Long,
  var name: String,

  @ManyToOne(cascade = [CascadeType.REFRESH])
  @JoinColumn(name = "parent_id")
  var parent: Parent
)
