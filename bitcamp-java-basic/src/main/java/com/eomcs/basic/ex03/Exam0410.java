package com.eomcs.basic.ex03;

//# 문자 리터럴
public class Exam0410 {
  public static void main(String[] args) {
    //
    //
    System.out.println('A'); // 0x0041
    System.out.println('가'); // 0xac00
    System.out.println('\u0041'); // 유니코드 값을 직접 지정
    System.out.println('\u4eba');

    // 그냥 숫자를 주면 println()은 일반 정수값으로 취급한다.
    System.out.println(0x41);
    System.out.println(65);
  }
}

