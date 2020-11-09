package com.eomcs.basic.test;

import java.util.ArrayList;

public class Test2 {

  public static void main(String[] args) {
    ArrayList<K1> list = new ArrayList<>();
    list.add(new K1()); // 0
    list.add(new K2()); // 1

    K1 obj = list.get(0); // K1 의 인스턴스 주소
    obj.m(); // K1.m()
    obj.x(); // k1.x();

    // obj2 안에 저장된 것은 실제 K2 클래스의 인스턴스 이다.
    K1 obj2 = list.get(1); // K2 의 인스턴스 주소
    obj2.m(); // K2.m()
    obj2.x(); // K1.x()
  }

}
