package com.eomcs.util;

public class Calculator {

  // result 변수는 각 계산 마다 개별적으로 관리해야 한다.
  // => non-static 변수로 선언하라!
  // => non-static 변수는 new 연산자를 통해서만 만들 수 있다.
  // => non-static 변수는 Heap 영역에 생성된다.
  //
  public int result = 0;

  // non-static 메서드(인스턴스 메서드)는
  // 인스턴스 주소를 받는 this 라는 빌트인 변수가 있다
  public void plus(int value) {
    this.result += value;
  }

  public void minus(int value) {
    this.result -= value;
  }

  public void multiple(int value) {
    this.result *= value;
  }

  public void divide(int value) {
    this.result /= value;
  }
}
