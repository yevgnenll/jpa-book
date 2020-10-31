package me.yevgnenll.jpa.enhanced.link

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "link_child")
class Child(
        @Id @GeneratedValue
        @Column(name = "child_id")
        var id: Long,
        var name: String
)
