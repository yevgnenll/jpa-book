package me.yevgnenll.jpa.vtype

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class PhoneServiceProvider (
  @Id
  var name: String
)
