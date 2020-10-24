package me.yevgnenll.jpa.enhanced.compound

import javax.persistence.*

@Entity
class Parent (
  @EmbeddedId
  var id: ParentId,
  var name: String
)
