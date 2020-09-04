package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.List;
import com.eomcs.util.Prompt;

public class BoardHandler {

  // 데이터 목록을 다루는 객체를 교체하기 쉽도록 인터페이스 타입으로 필드를 변경한다.
  List<Board> boardList;

  // 기존의 AbstractList 타입 보다는 List 인터페이스가 더 많은 종류의 객체를 받을 수 있다.
  public BoardHandler(List<Board> list) {
    this.boardList = list;
  }

  public void add() {
    System.out.println("[게시물 등록]");

    Board board = new Board();
    board.setNo(Prompt.inputInt("번호? "));
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));
    board.setWriter(Prompt.inputString("작성자? "));
    board.setRegisteredDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    boardList.add(board);

    System.out.println("게시글을 등록하였습니다.");
  }

  public void list() {
    System.out.println("[게시물 목록]");

    //Board[] boards = new Board[boardList.size()];
    //boardList.toArray(boards);
    Board[] boards = boardList.toArray(new Board[] {});

    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          board.getNo(),
          board.getTitle(),
          board.getWriter(),
          board.getRegisteredDate(),
          board.getViewCount());
    }
  }

  public void detail () {
    System.out.println("[게시글 상세조회]");
    int no = Prompt.inputInt("번호? ");
    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
    } else {
      board.setViewCount(board.getViewCount() + 1);

      System.out.printf("제목: %s\n", board.getTitle());
      System.out.printf("내용: %s\n", board.getContent());
      System.out.printf("등록일: %s\n", board.getRegisteredDate());
      System.out.printf("조회수: %s\n", board.getViewCount());
    }
  }

  public void update() {
    System.out.println("[게시글 변경]");
    int no = Prompt.inputInt("번호? ");
    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
    } else {
      String originValue = board.getTitle();
      String promptTitle = String.format("제목(%s)? ", originValue);
      String title = Prompt.inputString(promptTitle);

      String content = Prompt.inputString(
          String.format("내용(%s)? ", board.getContent()));
      String writer = Prompt.inputString(
          String.format("작성자(%s)? ", board.getWriter()));

      String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
      if (response.equalsIgnoreCase("y")) {
        board.setTitle(title);
        board.setContent(content);
        board.setWriter(writer);
        System.out.println("게시글을 변경하였습니다.");
      } else {
        System.out.println("게시글 변경을 취소하였습니다.");
      }
    }
  }

  public void delete() {
    System.out.println("[게시글 삭제]");
    int no = Prompt.inputInt("번호? ");
    int index = indexOf(no);
    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
    } else {
      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
      if (response.equalsIgnoreCase("y")) {
        boardList.remove(index);
        System.out.println("게시글을 삭제하였습니다.");
      } else {
        System.out.println("게시글 삭제를 취소하였습니다.");
      }
    }
  }

  private int indexOf(int no) {
    for (int i = 0; i < boardList.size(); i++) {
      Board board = boardList.get(i);
      if (board.getNo() == no) {
        return i;
      }
    }
    return -1;
  }

  private Board findByNo(int no) {
    for (int i = 0; i < boardList.size(); i++) {
      Board board = boardList.get(i);
      if (board.getNo() == no) {
        return board;
      }
    }
    return null;
  }

}








