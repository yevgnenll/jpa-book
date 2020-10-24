package me.yevgnenll.jpa.enhanced.compound

import lombok.EqualsAndHashCode
import lombok.NoArgsConstructor
import java.io.Serializable

@EqualsAndHashCode
@NoArgsConstructor
class ParentId (
  var id1: String,
  var id2: String
): Serializable
