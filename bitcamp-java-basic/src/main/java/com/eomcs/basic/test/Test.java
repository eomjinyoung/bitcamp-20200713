package com.eomcs.basic.test;

import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    ArrayList<A> list = new ArrayList<>();
    list.add(new X()); // 0
    list.add(new Y()); // 1
    list.add(new Z()); // 2

    A obj = list.get(0); // X 의 인스턴스 주소

    // 객체 주소를 가지고 메서드를 호출할 때
    // => 그 메서드가 변수 선언에 지정되어 있는 타입의 메서드가 맞는지 검사
    // => 해당 타입의 메서드가 맞다면,
    // => 그 인스턴스가 실제 어떤 클래스의 인스턴스인지 알아낸다.
    // => 알아낸 클래스의 메서드를 호출한다.
    obj.m();

  }

}
