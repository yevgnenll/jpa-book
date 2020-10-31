package me.yevgnenll.jpa.enhanced.mappedsuper

import java.time.LocalDateTime
import javax.persistence.AttributeOverride
import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "mapped_super_member")
@AttributeOverride(name = "id", column = Column(name = "member_id"))
class Member(
        id: Long,
        name: String,
        createdAt: LocalDateTime,
        var email: String
) : BaseEntity(id, name, createdAt)
