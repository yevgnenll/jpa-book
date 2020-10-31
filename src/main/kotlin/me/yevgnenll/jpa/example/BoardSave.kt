package me.yevgnenll.jpa.example

import me.yevgnenll.jpa.JpaSampleApplication
import me.yevgnenll.jpa.enhanced.onetoone.Board
import me.yevgnenll.jpa.enhanced.onetoone.BoardDetail
import javax.persistence.EntityManager

fun main() {
  JpaSampleApplication.jpa {
    run { save(it) }
  }
}

fun save(em: EntityManager) {
  var board = Board("제목")
  em.persist(board)
  em.flush()
  var boardDetail = BoardDetail(board = board, content = "내용이 이렇고 저렇고")
  em.persist(boardDetail)
  board.boardDetail = boardDetail
}
