package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyInput = new Scanner(System.in);

  // 회원
  static final int LENGTH = 5;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] now = new Date[LENGTH];
  static long currentMillis = 0;
  static int count = 0;

  // 프로젝트
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];
  static int pcount = 0;

  // 작업
  static final int TLENGTH = 100;
  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tcompletedDate = new Date[TLENGTH];
  static String[] tstate = new String[TLENGTH];
  static String[] tworker = new String[TLENGTH];
  static int tcount = 0;

  public static void main(String[] args) {

    loop:
      while (true) {
        String command = prompt("명령> ");

        switch (command.toLowerCase()) {
          case "/member/add":
            addMember(); // addMember()에 따로 빼낸 코드를 실행하라.
            // 이것을 메서드 호출이라 한다.
            break;
          case "/member/list":
            listMember();
            break;
          case "/project/add":
            addProject();
            break;
          case "/project/list":
            listProject();
            break;
          case "/task/add":
            addTask();
            break;
          case "/task/list":
            listTask();
            break;
          case "exit":
          case "quit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println();
      }

  keyInput.close();

  System.out.println("종료!");
  }


  static void addMember() {
    System.out.println("[회원 등록]");

    no[count] = Integer.parseInt(prompt("번호? "));
    name[count] = prompt("이름? ");
    email[count] = prompt("이메일? ");
    password[count] = prompt("암호? ");
    photo[count] = prompt("사진? ");
    tel[count] = prompt("전화? ");

    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
    now[count] = new Date(currentMillis);

    count++;
  }

  static void listMember() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], name[i], email[i], tel[i], now[i].toString());
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    System.out.print("번호? ");
    pno[pcount] = keyInput.nextInt();
    keyInput.nextLine();

    System.out.print("프로젝트명? ");
    ptitle[pcount] = keyInput.nextLine();

    System.out.print("내용? ");
    pcontent[pcount] = keyInput.nextLine();

    System.out.print("시작일? ");
    pstartDate[pcount] = java.sql.Date.valueOf(keyInput.nextLine());

    System.out.print("종료일? ");
    pendDate[pcount] = java.sql.Date.valueOf(keyInput.nextLine());

    System.out.print("만든이? ");
    powner[pcount] = keyInput.nextLine();

    System.out.print("팀원? ");
    pmembers[pcount] = keyInput.nextLine();

    pcount++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");

    System.out.print("번호? ");
    String str = keyInput.nextLine();
    tno[tcount] = Integer.parseInt(str);

    System.out.print("내용? ");
    tcontent[tcount] = keyInput.nextLine();

    System.out.print("완료일? ");
    tcompletedDate[tcount] = java.sql.Date.valueOf(keyInput.nextLine());

    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    tstate[tcount] = keyInput.nextLine();

    System.out.print("담당자? ");
    tworker[tcount] = keyInput.nextLine();

    tcount++;
  }

  static void listTask() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tcount; i++) {
      String stateTitle;
      switch (tstate[i]) {
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
          tno[i], tcontent[i], tcompletedDate[i], stateTitle, tworker[i]);
    }
  }

  static String prompt(String title) {
    System.out.print(title);
    String input = keyInput.nextLine();
    return input;
  }
}









