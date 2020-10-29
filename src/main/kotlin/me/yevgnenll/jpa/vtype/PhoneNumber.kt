package me.yevgnenll.jpa.vtype

import javax.persistence.Embeddable
import javax.persistence.ManyToOne

@Embeddable
class PhoneNumber (
  var areaCode: String,
  var localNumber: String,
  @ManyToOne
  var provider: PhoneServiceProvider
)
