package com.eomcs.basic.ex03;

//# 문자 리터럴 III
public class Exam0430 {
  public static void main(String[] args) {
    System.out.println(0x0041);
    System.out.println(0x41);
    System.out.println((char)0x41);
    System.out.println('A');
    System.out.println((int)'A');
    System.out.println('A' + 1);
    System.out.println((char)('A' + 1));
    System.out.println("--------------------");

    for (int i = 'A'; i <= 'z'; i++) {
      System.out.println((char)i);
    }
  }
}

