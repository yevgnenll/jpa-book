package me.yevgnenll.jpa.vtype

import java.util.*
import javax.persistence.Embeddable
import javax.persistence.Temporal
import javax.persistence.TemporalType

@Embeddable
class Period (
  @Temporal(TemporalType.DATE)
  var startDate: Date,
  @Temporal(TemporalType.DATE)
  var endDate: Date
) {
  fun isWork(date: Date): Boolean {
    return date.after(startDate) && date.before(endDate)
  }
}
