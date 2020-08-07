package com.eomcs.oop.ex03_t;

public class Exam0420 {

  static class SmartPhone {

    int volume;
    int bright;
    int contrast;

    // 다음과 같이 기본 생성자를 직접 정의할 수 있다.
    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨!");
    }
  }

  public static void main(String[] args) {
    SmartPhone obj1 = new SmartPhone();
  }
}
