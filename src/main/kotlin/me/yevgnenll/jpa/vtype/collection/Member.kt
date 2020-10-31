package me.yevgnenll.jpa.vtype.collection

import me.yevgnenll.jpa.vtype.Address
import javax.persistence.*

@Entity(name = "c_member")
class Member(
        @Id @GeneratedValue
        var id: Long? = null,

        @ElementCollection
        @CollectionTable(name = "favorite_food", joinColumns = [JoinColumn(name = "member_id")])
        @Column(name = "food_name")
        var favoriteFood: MutableSet<String>,

        @ElementCollection
        @CollectionTable(name = "address_history", joinColumns = [JoinColumn(name = "member_id")])
        var addressHistory: MutableList<Address>
)
