package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 명령 프롬프트를 출력한다
// 2) 명령어를 입력 받아 출력한다
public class App {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    // 회원
    final int LENGTH = 5;
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] now = new Date[LENGTH];
    long currentMillis = 0;
    int count = 0;

    // 프로젝트
    final int PLENGTH = 100;
    int[] pno = new int[PLENGTH];
    String[] ptitle = new String[PLENGTH];
    String[] pcontent = new String[PLENGTH];
    Date[] pstartDate = new Date[PLENGTH];
    Date[] pendDate = new Date[PLENGTH];
    String[] powner = new String[PLENGTH];
    String[] pmembers = new String[PLENGTH];
    int pcount = 0;

    // 작업
    final int TLENGTH = 100;
    int[] tno = new int[TLENGTH];
    String[] tcontent = new String[TLENGTH];
    Date[] tcompletedDate = new Date[TLENGTH];
    String[] tstate = new String[TLENGTH];
    String[] tworker = new String[TLENGTH];
    int tcount = 0;

    loop:
      while (true) {
        System.out.print("명령> ");
        String command = keyInput.nextLine();

        switch (command.toLowerCase()) {
          case "/member/add":
            System.out.println("[회원 등록]");

            System.out.print("번호? ");
            no[count] = keyInput.nextInt();
            keyInput.nextLine();

            System.out.print("이름? ");
            name[count] = keyInput.nextLine();

            System.out.print("이메일? ");
            email[count] = keyInput.nextLine();

            System.out.print("암호? ");
            password[count] = keyInput.nextLine();

            System.out.print("사진? ");
            photo[count] = keyInput.nextLine();

            System.out.print("전화? ");
            tel[count] = keyInput.nextLine();

            currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
            now[count] = new Date(currentMillis);

            count++;
            break;
          case "/member/list":
            System.out.println("[회원 목록]");

            for (int i = 0; i < count; i++) {
              System.out.printf("%d, %s, %s, %s, %s\n",
                  no[i], name[i], email[i], tel[i], now[i].toString());
            }
            break;
          case "/project/add":
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
            break;
          case "/project/list":
            System.out.println("[프로젝트 목록]");

            for (int i = 0; i < pcount; i++) {
              System.out.printf("%d, %s, %s, %s, %s\n",
                  pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
            }
            break;
          case "/task/add":
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
            break;
          case "/task/list":
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
}









