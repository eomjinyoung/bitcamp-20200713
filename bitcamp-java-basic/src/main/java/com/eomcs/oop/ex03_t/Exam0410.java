package com.eomcs.oop.ex03_t;

public class Exam0410 {

  static class SmartPhone {

    int volume;
    int bright;
    int contrast;

    void playMusic() {
      // 음악을 출력한다.
    }

    // 생성자(constructor)란?
    // - 인스턴스를 만든 후 사용하기 전에 적절한 값으로 초기화시킬 필요가 있다.
    // - (제품을 만든 후에 제품을 사용하기 전에
    //    제품이 구동되는데 문제가 없도록 기본 값으로 설정되어야 한다.)
    // - 그래서 인스턴스를 사용하기 전에 적절한 값으로 초기화시키기 위해
    //   자동으로 호출되는 메서드를 도입하게 되었다.
    // - 이것이 '생성자'다!
    //
    // 생성자 문법
    // - 클래스명(파라미터, ...) {}
    // - 생성자를 선언할 때는 리턴 타입을 지정하지 않는다.
    //
    // 모든 클래스는 반드시 한 개 이상의 생성자를 가져야 한다.
    // - 개발자가 생성자를 작성하지 않으면
    //   컴파일러가 기본 생성자를 자동으로 추가한다.
    // 기본생성자(default constructor)?
    // - 파라미터가 없는 생성자
    // - public으로 공개된다.
    //   예) public 클래스명() {}
    //
    // 이 클래스에 생성자를 정의하지 않으면 다음과 같이 기본 생성자가 추가된다.
    // public SmartPhone() {}
    //
  }

  public static void main(String[] args) {
    // 인스턴스를 생성할 때 반드시 호출될 생성자를 지정해야 한다.
    // 안하면 문법 오류이다.
    // => new 클래스명(생성자에 넘겨 줄 값);
    // => 예) new A(); <-- 생성자에 파라미터가 없기 때문에 값을 넘겨주지 않는다.
    //    예) new A(100); <-- 생성자의 파라미터가 int 이기 때문에 정수 값을 넘긴다.
    //
    //new A; // 컴파일 오류!
    //

    // 다음과 같이 호출될 생성자를 지정하지 않으면 문법 오류이다.
    // SmartPhone obj1 = new SmartPhone; // 컴파일 오류!

    // 다음과 같이 존재하지 않는 생성자를 지정하면 문법 오류이다.
    //SmartPhone obj1 = new SmartPhone(100); // int 파라미터를 가지는 생성자가 없다.

    // 다음과 같이 기본 생성자를 지정할 수 있다.
    SmartPhone obj1 = new SmartPhone(); // 파라미터가 없는 생성자
    obj1.playMusic();

    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.contrast);
  }
}
