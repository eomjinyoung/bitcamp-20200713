package com.eomcs.basic;

public class Test1 {

  public static void main(String[] args) {
    m1();
  }

  static void m1() {
    System.out.println("m1()==>");
    m2();
    System.out.println("<==m1()");
  }

  static void m2() {
    System.out.println("m2()==>");
    m3();
    System.out.println("<==m2()");
  }

  static void m3() {
    System.out.println("m2()==>");
    System.out.println("<==m2()");
  }

}
