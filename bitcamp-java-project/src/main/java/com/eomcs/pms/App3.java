package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    String project = keyInput.nextLine();

    System.out.print("번호? ");
    String no = keyInput.nextLine();

    System.out.print("내용? ");
    String content = keyInput.nextLine();

    System.out.print("완료일? ");
    String completedDate = keyInput.nextLine();

    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    String state = keyInput.nextLine();

    System.out.print("담당자? ");
    String worker = keyInput.nextLine();

    keyInput.close();

    System.out.println("--------------------");
    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %s\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", completedDate);
    System.out.print("상태: ");
    if (state.equals("0")) {
      System.out.println("신규");
    } else if (state.equals("1")) {
      System.out.println("진행중");
    } else {
      System.out.println("완료");
    }
    System.out.printf("담당자: %s\n", worker);
  }
}









