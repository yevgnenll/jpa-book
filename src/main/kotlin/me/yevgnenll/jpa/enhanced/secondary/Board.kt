package me.yevgnenll.jpa.enhanced.secondary

import javax.persistence.*

@Entity(name = "sec_board")
@Table
class Board (
  @Id @GeneratedValue
  @Column
  var id: Long,
  var title: String,
  @Column(table ="board_detail")
  var content: String
)
