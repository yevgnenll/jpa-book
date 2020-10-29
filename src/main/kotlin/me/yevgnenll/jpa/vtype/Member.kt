package me.yevgnenll.jpa.vtype

import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "v_member")
class Member (
  @Id @GeneratedValue
  var id: Long,
  var name: String,

  @Embedded
  var period: Period,
  @Embedded
  var address: Address,
  @Embedded
  var phoneNumber: PhoneNumber
)
