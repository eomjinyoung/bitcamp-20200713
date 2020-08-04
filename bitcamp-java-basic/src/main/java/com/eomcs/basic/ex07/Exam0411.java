package com.eomcs.basic.ex07;

//# 메서드 : JVM 메모리
//
public class Exam0411 {

  public static void main(String[] args) {
    int a = 100;
    System.out.println("main() >> " + a);
    m1(a);
    System.out.println(a + " << main()");
  }

  static void m1(int a) {
    a += 100;
    System.out.println("m1() >> " + a);
    m2(a);
    System.out.println(a + " << m1()");
  }

  static void m2(int a) {
    a += 100;
    System.out.println("m2() >> " + a);
    m3(a);
    System.out.println(a + " << m2()");
  }

  static void m3(int a) {
    a += 100;
    System.out.println("m3(): " + a);
  }
}






