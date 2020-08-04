// call by value vs. call by reference
package com.eomcs.basic.ex07;

public class Exam0310 {

  static class Person {
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {
    int a = 200;

    m1(a); // call by value

    System.out.println(a);

    a = 300;

    m1(a);

    System.out.println(a);

    int[] arr = new int[3];
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;

    m2(arr); // call by reference

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println("-----------------------");

    Person p;
    p = new Person();

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);

    m3(p); // call by reference

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
  }

  static void m3(Person p) {
    p.name = "홍길동";
    p.age = 20;
    p.working = true;
  }

  static void m1(int a) {
    a = 100;
    System.out.println("===>" + a);
  }

  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;
  }



}









