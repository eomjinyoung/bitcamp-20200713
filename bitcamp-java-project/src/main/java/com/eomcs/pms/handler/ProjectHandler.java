package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {
  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }
  static final int LENGTH = 100;
  static Project[] list = new Project[LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[프로젝트 등록]");

    Project p = new Project();

    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");

    while (true) {
      String name = Prompt.inputString("만든이?(취소: 빈 문자열) ");

      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (MemberHandler.findByName(name) != null) {
        p.owner = name;
        break;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder names = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원?(완료: 빈 문자열) ");

      if (name.length() == 0) {
        break;
      } else if (MemberHandler.findByName(name) != null) {
        if (names.length() > 0) {
          names.append(",");
        }
        names.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    p.members = names.toString();

    list[size++] = p;
  }

  public static void list() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < size; i++) {
      Project p = list[i];
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner, p.members);
    }
  }
}
