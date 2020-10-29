package me.yevgnenll.jpa.vtype

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Address (
  @Column(name = "city")
  var city: String,
  var street: String,
  var zipCode: String
)
