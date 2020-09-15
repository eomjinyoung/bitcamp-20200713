package com.eomcs.pms.domain;

import java.sql.Date;

public class Board {
  private int no;
  private String title;
  private String content;
  private String writer;
  private Date registeredDate;
  private int viewCount;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  // Board 객체의 데이터를 CSV 문자열로 바꾸는 일을 한다.
  // => 기존 코드를 가져와서 메서드로 정의한다.
  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s,%d\n", 
        this.getNo(),
        this.getTitle(),
        this.getContent(),
        this.getWriter(),
        this.getRegisteredDate().toString(),
        this.getViewCount());
  }

  // Board 객체를 생성하는 팩토리 메서드의 역할을 한다.
  // => 기존 코드를 별도의 메서드로 추출한다.(리팩토링: extract method)
  public static Board valueOfCsv(String csv) {
    // CSV 문자열을 콤마(,)로 나눈다.
    String[] values = csv.split(",");

    // 레코드 데이터를 저장할 객체를 준비
    Board board = new Board();

    // 레코드의 각 필드 값을 객체의 필드에 저장한다.
    board.setNo(Integer.parseInt(values[0]));
    board.setTitle(values[1]); // "20" ==> int
    board.setContent(values[2]);
    board.setWriter(values[3]);
    board.setRegisteredDate(Date.valueOf(values[4])); // "yyyy-MM-dd" ==> java.sql.Date
    board.setViewCount(Integer.parseInt(values[5]));

    return board;
  }
}