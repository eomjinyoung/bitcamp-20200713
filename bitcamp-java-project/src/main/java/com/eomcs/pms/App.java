package com.eomcs.pms;

import java.sql.Date;

public class App {

  // 회원 데이터


  // 프로젝트 데이터
  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }
  static final int PLENGTH = 100;
  static Project[] projects = new Project[PLENGTH];
  static int psize = 0;

  // 작업 데이터
  static class Task {
    int no;
    String content;
    Date deadline;
    String owner;
    int status;
  }
  static final int TLENGTH = 100;
  static Task[] tasks = new Task[TLENGTH];
  static int tsize = 0;

  public static void main(String[] args) {

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
          case "/member/add":
            MemberHandler.addMember();
            break;
          case "/member/list":
            MemberHandler.listMember();
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
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

  Prompt.close();
  }



  static void addProject() {
    System.out.println("[프로젝트 등록]");

    Project p = new Project();

    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");
    p.owner = Prompt.inputString("만든이? ");
    p.members = Prompt.inputString("팀원? ");

    projects[psize++] = p;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < psize; i++) {
      Project p = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");

    Task t = new Task();

    t.no = Prompt.inputInt("번호? ");
    t.content = Prompt.inputString("내용? ");
    t.deadline = Prompt.inputDate("마감일? ");
    t.status = Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    t.owner = Prompt.inputString("담당자? ");

    tasks[tsize++] = t;
  }

  static void listTask() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tsize; i++) {
      Task t = tasks[i];
      String stateLabel = null;
      switch (t.status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          t.no, t.content, t.deadline, stateLabel, t.owner);
    }
  }


}
