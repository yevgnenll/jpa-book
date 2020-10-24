package me.yevgnenll.jpa.enhanced.compound

import javax.persistence.*

@Entity
class Child (
  @Id
  var id: String,
  @ManyToOne
  @JoinColumns(
    *[
    JoinColumn(name = "parent_id1", referencedColumnName = "parent_id1"),
    JoinColumn(name = "parent_id2", referencedColumnName = "parent_id2")
  ])
  var parent: Parent
)
