package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    class Task {
      int no;
      String content;
      Date completedDate;
      String state;
      String worker;
    }

    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    final int LENGTH = 100;

    String project;

    Task[] tasks = new Task[LENGTH];

    int count = 0;

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    project = keyInput.nextLine();

    for (int i = 0; i < LENGTH; i++) {
      count++;

      Task t = new Task();

      System.out.print("번호? ");
      String str = keyInput.nextLine();
      t.no = Integer.parseInt(str);

      System.out.print("내용? ");
      t.content = keyInput.nextLine();

      System.out.print("완료일? ");
      t.completedDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      t.state = keyInput.nextLine();

      System.out.print("담당자? ");
      t.worker = keyInput.nextLine();

      tasks[i] = t;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;

      System.out.println();
    }

    keyInput.close();

    System.out.println("--------------------");

    System.out.printf("[%s]\n", project);

    for (int i = 0; i < count; i++) {
      Task t = tasks[i];
      String stateTitle;
      switch (t.state) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
        default:
          stateTitle = "완료";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          t.no, t.content, t.completedDate, stateTitle, t.worker);
    }
  }
}






