package com.eomcs.pms.handler;

// 사용자가 입력한 명령을 처리하기 위해 호출하는 메서드의 규칙을 정의한다.
public interface Command {
  void execute();
}
