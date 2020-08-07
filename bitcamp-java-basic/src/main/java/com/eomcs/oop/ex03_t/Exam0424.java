package com.eomcs.oop.ex03_t;

class SmartPhone {

  int volume;
  int bright;
  int contrast;

  private SmartPhone() {
    System.out.println("SmartPhone() 생성자 호출됨!");
  }

  public SmartPhone(int volume) {
    System.out.println("SmartPhone(int) 생성자 호출됨!");
    this.volume = volume;
    this.bright = 50;
    this.contrast = 50;
  }
}

public class Exam0424 {


  public static void main(String[] args) {
    // private 으로 접근을 제한한 경우 다른 클래스가 생성자를 지정할 수 없다.
    //SmartPhone obj1 = new SmartPhone();
    SmartPhone obj2 = new SmartPhone(50);
  }
}















