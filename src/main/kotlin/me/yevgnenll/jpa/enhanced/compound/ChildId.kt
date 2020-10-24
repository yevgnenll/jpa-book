package me.yevgnenll.jpa.enhanced.compound

import lombok.EqualsAndHashCode
import lombok.NoArgsConstructor
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
class ChildId (
  var parentId: String,
  @Column(name = "child_id")
  var id: String
)
