package com.eomcs.oop.ex03_t;

public class Exam0110 {
  public static void main(String[] args) {
    // instance field = non-static variable
    class A {
      int v1;
      boolean v2;
    }

    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);
  }
}
