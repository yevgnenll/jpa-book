package me.yevgnenll.jpa.enhanced.link

import javax.persistence.*

@Entity(name = "link_parent")
class Parent(
        @Id
        @GeneratedValue
        @Column(name = "parent_id")
        var id: Long,
        var name: String,
) {
  @ManyToMany
  @JoinTable(
          name = "parent_child",
          joinColumns = [JoinColumn(name = "parent_id")],
          inverseJoinColumns = [JoinColumn(name = "child_id")]
  )
  var child: MutableList<Child> = mutableListOf()
}
