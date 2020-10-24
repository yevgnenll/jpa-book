package me.yevgnenll.jpa.enhanced.fk

import javax.persistence.*

@Entity(name = "fk-grandchild")
class GrandChild (
  @Id @GeneratedValue
  @Column(name = "grandchild_id")
  var id: Long,
  var name: String,

  @ManyToOne
  @JoinColumn(name = "child_id")
  var child: Child
)
