package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    final int LENGTH = 100;

    String project;

    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] completedDate = new Date[LENGTH];
    String[] state = new String[LENGTH];
    String[] worker = new String[LENGTH];

    int count = 0;

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    project = keyInput.nextLine();

    for (int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("번호? ");
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str);

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      completedDate[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      state[i] = keyInput.nextLine();

      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();

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
      String stateTitle;
      switch (state[i]) {
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
          no[i], content[i], completedDate[i], stateTitle, worker[i]);
    }
  }
}






