package me.yevgnenll.jpa.enhanced.join

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("B")
class Book(
        id: Int,
        name: String,
        price: Int,
        val author: String,
        val isbn: String
) : Item(id, name, price)
