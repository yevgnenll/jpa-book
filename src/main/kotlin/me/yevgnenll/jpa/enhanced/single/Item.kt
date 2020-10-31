package me.yevgnenll.jpa.enhanced.single

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
class Item(
        @Id
        @GeneratedValue
        @Column(name = "item_id")
        var id: Long,
        var name: String,
        var price: Int
)

@Entity
@DiscriminatorValue("A")
class Album(
        id: Long,
        name: String,
        price: Int,
        var artist: String
) : Item(id, name, price)
