package me.yevgnenll.jpa.vtype

import javax.persistence.Embeddable

@Embeddable
class Zipcode(
        var zip: String,
        var plusFour: String
)
