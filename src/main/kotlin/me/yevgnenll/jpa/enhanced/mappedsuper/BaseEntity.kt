package me.yevgnenll.jpa.enhanced.mappedsuper

import java.time.LocalDateTime
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
data class BaseEntity(
        @Id
        @GeneratedValue
        var id: Long,
        var name: String,
        var createdAt: LocalDateTime
)
