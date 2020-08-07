package com.eomcs.oop.ex03_t;

public class Exam0423 {

  static class SmartPhone {

    int volume;
    int bright;
    int contrast;

    // 파라미터가 다른 생성자를 여러 개 정의할 수 있다.
    public SmartPhone() {
      // this(...) <== 다른 생성자를 호출한다.
      // 다른 생성자를 호출할 때는 반드시 첫 문장이어야 한다.
      this(50, 50, 50);
      System.out.println("SmartPhone() 생성자 호출됨!");
    }

    public SmartPhone(int volume) {
      System.out.println("SmartPhone(int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = 50;
      this.contrast = 50;
    }

    public SmartPhone(int volume, int bright) {
      System.out.println("SmartPhone(int, int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = 50;
    }

    public SmartPhone(int volume, int bright, int contrast) {
      System.out.println("SmartPhone(int, int, int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = contrast;
    }

    void m1() {
      // 일반 메서드에서 생성자를 임의로 호출할 수 없다.
      //this();
    }
  }

  public static void main(String[] args) {
    // 인스턴스를 생성할 때 생성자에 던지는 값에 따라
    // 자동으로 호출될 생성자가 결정된다.
    SmartPhone obj1 = new SmartPhone();

    // 레퍼런스로 생성자를 임의로 호출할 수 없다.
    // 생성자 호출은 new 명령을 실행할 때만 오직 지정할 수 있다.
    //obj1.SmartPhone();
  }
}















