package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score4;

public class Exam0119 {

  public static void main(String[] args) {

    Score4 s1 = new Score4("홍길동", 100, 90, 87);
    Score4 s2 = new Score4("임꺽정", 90, 100, 100);

    printScore(s1);

    System.out.println("--------------");

    printScore(s2);

    s1.kor = 50;
    s1.compute();

    System.out.println("--------------");

    printScore(s1);
  }

  static void printScore(Score4 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);

  }
}



