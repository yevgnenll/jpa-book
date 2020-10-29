package me.yevgnenll.jpa.vtype

import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded

@Embeddable
class Address (
  @Column(name = "city")
  var city: String,
  var street: String,
  @Embedded
  var zipcode: Zipcode
)
