package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 III
//
public class Exam0460 {
  public static void main(String[] args) {
    // 한 개의 정수 값에 여러 개의 정보를 저장하기
    // => 비트의 1 또는 0을 이용하여 정보를 표현할 수 있다.
    //
    // 개발자가 프로그래밍 가능한 언어를 int 값으로 표현해 보자!
    final int JAVA          = 0x0001; // 0000 0000 0000 0001
    final int C             = 0x0002; // 0000 0000 0000 0010
    final int CPP           = 0x0004; // 0000 0000 0000 0100
    final int PYTHON        = 0x0008; // 0000 0000 0000 1000
    final int PHP           = 0x0010; // 0000 0000 0001 0000
    final int KOTLIN        = 0x0020; // 0000 0000 0010 0000
    final int GROOVY        = 0x0040; // 0000 0000 0100 0000
    final int JAVASCRIPT    = 0x0080; // 0000 0000 1000 0000
    final int TYPESCRIPT    = 0x0100; // 0000 0001 0000 0000
    final int GO            = 0x0200; // 0000 0010 0000 0000
    final int SQL           = 0x0300; // 0000 0100 0000 0000
    final int R             = 0x4000; // 0000 1000 0000 0000

    // Java와 C, C++, JavaScript를 할 줄 아는 개발자의 정보를 설정하라!
    int d1 = JAVA | C | CPP | JAVASCRIPT; // 0000 0000 1000 0111
    int d2 = 0x0087;

    System.out.println(d1);
    System.out.println(d2);
  }
}
