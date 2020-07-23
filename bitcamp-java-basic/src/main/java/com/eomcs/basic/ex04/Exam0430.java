package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {

    char c;

    c = 0;
    c = 65535;
    //c = -1;
    //c = 65536;

    c = 65;
    c = 0x42;
    c = 0b01000011;
    System.out.println(c);

    short s = 65;
    System.out.println(s);

    c = '헐'; // '' 연산자는 문자의 유니코드 값을 리턴한다.
    System.out.println(c);

    int i = '헐';
    i = c;
    System.out.println(i);

    // 문자 코드는 정수 값이다.
    for (int x = 65; x < 80; x++) {
      System.out.println((char)x);
    }

    boolean b1, b2;
    b1 = true;
    b2 = false;

    System.out.println(b1);
    System.out.println(b2);

    // 논리 값은 정수로 다룰 수 없다.
    //i = b1;
    //i = b2;
    //b1 = 1;

    byte b; // 1바이트 정수 값을 담을 메모리를 확보하고
    // 그 메모리의 이름을 b라고 하라.
    b = 12; // b라는 이름의 메모리에 12를 저장하라.
    b = 38; // b라는 이름의 메모리에 38일 저장하라.

    System.out.println(b); // b메모리에 저장된 값을 출력하라.


  }
}
