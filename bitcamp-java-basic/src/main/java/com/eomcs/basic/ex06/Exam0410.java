// 반복문 for
package com.eomcs.basic.ex06;

public class Exam0410 {
  public static void main(String[] args) {
    // for(변수선언 및 초기화; 조건; 증감문) 문장;
    // for(변수선언 및 초기화; 조건; 증감문) {문장; 문장; ...}
    for (int i = 1, j = 2; i <= 10; i += 2, j += 2) {
      System.out.printf("=> %d, %d\n", i, j);
    }


  }
}
