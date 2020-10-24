package me.yevgnenll.jpa.enhanced.onetoone

import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@NoArgsConstructor
class Board (
  var title: String
) {
  @Id @GeneratedValue
  @Column(name = "board_id")
  var id: Long? = null
  @OneToOne(mappedBy = "board")
  var boardDetail: BoardDetail? = null
}
