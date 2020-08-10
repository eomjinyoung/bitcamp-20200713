package com.eomcs.oop.ex04;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("ABC가각");

    // 인스턴스 메서드
    // - non-static 메서드
    // - 인스턴스 주소를 가지고 호출해야 한다.
    // - this 라는 내장 변수가 있다.
    // - 특정 인스턴스의 변수를 다루는 메서드

    char c1 = s1.charAt(1);
    System.out.println(c1);

    char c2 = s2.charAt(1);
    System.out.println(c2);

    System.out.println(s1.compareTo(s2));

    System.out.println(s1.contains("ll"));
    System.out.println(s2.contains("ll"));
    System.out.println(s1.equals(s2));

    System.out.println("--------------------");
    byte[] bytes = s2.getBytes(); // JVM(UTF-16) ===> OS기본문자표(linux/unix: UTF-8, windows: MS949)
    // "ABC가각"
    // - Linux/Unix: 41 42 43 ea b0 80 ea b0 81
    // - Windows: 41 42 43 b0 a1 b0 a2

    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff));
    }

    System.out.println("--------------------");
    bytes = s2.getBytes("ms949"); // JVM(UTF-16) ===> 지정한문자표(ms949)
    // "ABC가각"
    // - Windows: 41 42 43 b0 a1 b0 a2

    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff));
    }

    System.out.println("-----------------------");

    String s3 = String.format("%s님 방가방가!", "홍길동");
    System.out.println(s3);

    String s4 = String.join(",", "홍길동", "임꺽정", "유관순");
    System.out.println(s4);

    String s5 = String.valueOf(true);
    String s6 = String.valueOf(100);
    String s7 = String.valueOf(3.14f);
    System.out.printf("%s %s %s\n", s5, s6, s7);
  }
}





