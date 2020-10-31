package me.yevgnenll.jpa.vtype

import javax.persistence.*

@Entity(name = "v_member")
class Member(
        @Id @GeneratedValue
        var id: Long,
        var name: String,

        @Embedded
        var period: Period,
        @Embedded
        var homeAddress: Address,

        @Embedded
        @AttributeOverrides(value = [
          AttributeOverride(name = "city", column = Column(name = "company_city")),
          AttributeOverride(name = "street", column = Column(name = "company_street")),
          AttributeOverride(name = "zipcode", column = Column(name = "company_zipcode"))
        ])
        var companyAddress: Address,
        @Embedded
        var phoneNumber: PhoneNumber
)
