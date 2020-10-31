package me.yevgnenll.jpa.enhanced.compound

import lombok.EqualsAndHashCode
import lombok.NoArgsConstructor
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@EqualsAndHashCode
@NoArgsConstructor
@Embeddable
class ParentId(
        @Column
        var id1: String,
        @Column
        var id2: String
) : Serializable
