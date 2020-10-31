package me.yevgnenll.jpa.enhanced.compound

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class GrandChildId(
        var childId: ChildId, // @MapsId 로 mapping 되어야 한다.
        @Column(name = "grandchild_id")
        var id: String
) : Serializable
