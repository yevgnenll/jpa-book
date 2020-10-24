package me.yevgnenll.jpa.enhanced.compound

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass

@Entity
@IdClass(ParentId::class)
class Parent (
  @Id
  @Column(name = "parent_id1")
  var id1:String,

  @Id
  @Column(name = "parent_id2")
  var id2:String
)
