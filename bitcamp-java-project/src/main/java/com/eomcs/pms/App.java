package com.eomcs.pms;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Iterator;
import com.eomcs.util.LinkedList;
import com.eomcs.util.List;
import com.eomcs.util.Prompt;
import com.eomcs.util.Queue;
import com.eomcs.util.Stack;

public class App {

  public static void main(String[] args) {

    List<Board> boardList = new ArrayList<>();
    BoardHandler boardHandler = new BoardHandler(boardList);

    List<Member> memberList = new ArrayList<>();
    MemberHandler memberHandler = new MemberHandler(memberList);

    List<Project> projectList = new LinkedList<>();
    ProjectHandler projectHandler = new ProjectHandler(projectList, memberHandler);

    List<Task> taskList = new ArrayList<>();
    TaskHandler taskHandler = new TaskHandler(taskList, memberHandler);

    Stack<String> commandList = new Stack<>();
    Queue<String> commandList2 = new Queue<>();

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        // 명령어를 보관한다.
        commandList.push(command);
        commandList2.offer(command);

        switch (command) {
          case "/member/add": memberHandler.add(); break;
          case "/member/list": memberHandler.list(); break;
          case "/member/detail": memberHandler.detail(); break;
          case "/project/add": projectHandler.add(); break;
          case "/project/list": projectHandler.list(); break;
          case "/project/detail": projectHandler.detail(); break;
          case "/task/add": taskHandler.add(); break;
          case "/task/list": taskHandler.list(); break;
          case "/task/detail": taskHandler.detail(); break;
          case "/board/add": boardHandler.add(); break;
          case "/board/list": boardHandler.list(); break;
          case "/board/detail": boardHandler.detail(); break;
          case "/board/update": boardHandler.update(); break;
          case "/board/delete": boardHandler.delete(); break;
          case "history": printCommandHistory(commandList); break;
          case "history2": printCommandHistory2(commandList2); break;
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

  private static void printCommandHistory2(Queue<String> commandList2) {
    try {
      Iterator<String> iterator = commandList2.iterator();
      int count = 1;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());

        if ((count++ % 5) == 0) {
          String response = Prompt.inputString(":");
          if (response.equalsIgnoreCase("q")) {
            break;
          }
        }
      }
    } catch (Exception e) {
      System.out.println("history2 명령 처리 중 오류 발생!");
    }
  }

  private static void printCommandHistory(Stack<String> commandList) {
    try {
      Iterator<String> iterator = commandList.iterator();
      int count = 1;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());

        if ((count++ % 5) == 0) {
          String response = Prompt.inputString(":");
          if (response.equalsIgnoreCase("q")) {
            break;
          }
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
}





