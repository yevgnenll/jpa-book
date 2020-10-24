package me.yevgnenll.jpa.enhanced.compound

import javax.persistence.*

@Entity
class GrandChild (
  @EmbeddedId
  var id: GrandChildId,
  @MapsId("childId")
  @ManyToOne
  @JoinColumns(
    *[
    JoinColumn(name = "parent_id"),
    JoinColumn(name = "child_id")
  ])
  var child: Child,
  var name: String
)
