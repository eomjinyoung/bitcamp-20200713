package com.eomcs.basic.ex07;

public class Exam0415 {

  public static void main(String[] args) throws Exception {

    int result = 1;
    int n = 5;

    for (int i = 2; i <= n; i++) {
      result *= i;
    }

    System.out.println(result);

    System.out.println("----------------------------");

    result = factorial(5);
    // result = 5 * factorial(4)
    // result = 5 * 4 * factorial(3)
    // result = 5 * 4 * 3 * factorial(2)
    // result = 5 * 4 * 3 * 2 * factorial(1)
    // result = 5 * 4 * 3 * 2 * 1

    System.out.println(result);
  }

  static int factorial(int n) {
    return n * factorial(n - 1);
  }

}






