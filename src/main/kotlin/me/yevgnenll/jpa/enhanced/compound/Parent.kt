package me.yevgnenll.jpa.enhanced.compound

import javax.persistence.*

@Entity
class Parent(
        @Id @Column(name = "parent_id")
        var id: String,
        var name: String
)
