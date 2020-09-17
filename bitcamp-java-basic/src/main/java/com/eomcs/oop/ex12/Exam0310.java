// 아규먼트에 람다(lambda) 활용
package com.eomcs.oop.ex12;
public class Exam0310 {
  static interface Player {
    void play();
  }
  static void testPlayer(Player p) {
    p.play();
  }
  public static void main(String[] args) {
    // 람다
   
    testPlayer(() -> System.out.println("실행....."));

  }
}


