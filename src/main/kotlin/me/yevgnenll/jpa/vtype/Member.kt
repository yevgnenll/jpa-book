package me.yevgnenll.jpa.vtype

import java.util.*
import javax.persistence.*

@Entity
class Member (
  @Id @GeneratedValue
  var id: Long,
  var name: String,
  @Temporal(TemporalType.DATE)
  var startDate: Date,
  @Temporal(TemporalType.DATE)
  var endDate: Date,

  var city: String,
  var street: String,
  var zipCode: String
)
