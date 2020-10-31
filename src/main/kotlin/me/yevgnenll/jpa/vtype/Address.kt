package me.yevgnenll.jpa.vtype

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class Address(
        @Column(name = "city")
        var city: String,
        val street: String,
        val zipcode: String
)
