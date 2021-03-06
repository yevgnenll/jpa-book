package me.yevgnenll.jpa.enhanced.compound

import javax.persistence.*

@Entity
class Child(
        @EmbeddedId
        var id: ChildId,
        @MapsId("parentId")
        @ManyToOne
        @JoinColumn(name = "parent_id")
        var parent: Parent
)
