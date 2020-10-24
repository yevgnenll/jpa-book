package me.yevgnenll.jpa.enhanced.onetoone

import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@NoArgsConstructor
class BoardDetail (
  @Id
  var boardId: Long,
  @MapsId
  @OneToOne
  @JoinColumn(name = "board_id")
  var board: Board,
  var content: String
)
