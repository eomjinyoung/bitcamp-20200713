package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0210 {

  public static void main(String[] args) {
    // 연산자 우선순위를 고려하지 말고 나온 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = 9
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    // 식1과 식2를 동시에 계산하려면 result 변수를 두 개 준비해야 한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    // 현재 버전에서는 식1과 식2를 차례대로 계산해야 한다.
    c1.plus(2); // 식1) 0 + 2
    c2.plus(3); // 식2) 0 + 3
    c1.plus(3); // 식1) 0 + 2 + 3
    c2.multiple(2); // 식2) 0 + 3 * 2
    c1.minus(1); // 식1) 0 + 2 + 3 - 1
    c2.plus(7); // 식2) 0 + 3 * 2 + 7
    c1.multiple(7); // 식1) 0 + 2 + 3 - 1 * 7
    c2.minus(5); // 식2) 0 + 3 * 2 + 7 / 4 - 5
    c1.divide(3); // 식1) 0 + 2 + 3 - 1 * 7 / 3
    c2.divide(4); // 식2) 0 + 3 * 2 + 7 / 4

    printResult(c1.result);
    printResult(c2.result);

  }

  static void printResult(int value) {
    System.out.println("**********************");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("**********************");
  }
}








