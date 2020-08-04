package com.eomcs.basic.ex07;

public class Exam0210 {
  public static void main(String[] args) {

    m1();

    // m1(100);
    //int r = m1();

    m2("홍길동");
    //m2();
    //m2(100);
    //int r = m2("홍길동");

    String message = m3();
    System.out.println(message);


    message = m3();
    System.out.println(message);

    m3();

    //int result = m3();
    //message = m3(100);

    message = m4("홍길동");
    System.out.println(message);

    message = m5("홍길동", 20, false);
    System.out.println(message);

    m6("홍길동", 100, 90, 80);
    m7("홍길동", new int[] {100, 90, 80, 70, 60});
    m7("홍길동", new int[] {100, 90});
    m7("홍길동", new int[] {100});
    m7("홍길동", new int[] {});

    System.out.println("------------------------");

    m8("홍길동", 100, 90, 80, 70, 60);
    m8("홍길동", 100, 90);
    m8("홍길동", 100);
    m8("홍길동");
    //int aver = m6("홍길동");

    m10(new int[] {100, 90, 80}, new String[] {"국어", "영어", "수학"}, "홍길동");

    // 2 + 3 + 7 + 4 = ?

    //    int sum = 0;
    //    sum = plus(2, 3);
    //    sum = plus(sum, 7);
    //    sum = plus(sum, 4);

    System.out.println(plus(plus(plus(2, 3), 7), 4));

  }

  static void m1() {
    System.out.println("Hello!");
  }

  static void m2(String name) {
    System.out.println(name + "님 반갑습니다!");
  }

  static String m3() {
    return "안녕!";
  }

  static String m4(String name) {
    return name + "님 반갑습니다.^^";
  }

  static String m5(String name, int age, boolean working) {
    return age + "살 " + name + "님은 현재 재직상태가 " + working + "입니다.";
  }

  static void m6(String name, int a, int b, int c) {
    int sum = a + b + c;
    int aver = sum / 3;
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }

  static void m7(String name, int[] scores) {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if (scores.length > 0) {
      aver = sum / scores.length;
    }
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }

  static void m8(String name, int... scores) {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if (scores.length > 0) {
      aver = sum / scores.length;
    }
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }

  // 가변 파라미터는 무조건 맨 끝에 와야 한다.
  //  static void m9(int... scores, String name) {
  //  }

  //  가변 파라미터는 여러 개 선언할 수 없다.
  //  static void m9(int... scores, int... scores2) {
  //    // m9(100, 90, 80);
  //  }

  // 가변 파라미터 중간에 다른 타입의 변수가 오더라도
  // 가변 파라미터를 한개 초과하여 둘 수 없다.
  //  static void m9(String... titles, String name, int... scores2) {
  //    // m9("국어", "수학", "홍길동", 100, 90);
  //  }

  static void m10(int[] scores, String[] titles, String name) {
    if (scores.length != titles.length) {
      System.out.println("과목 수와 점수의 개수가 다릅니다.");
      return;
    }

    System.out.println(name + "님 점수!");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s = %d 점\n", titles[i], scores[i]);
    }
  }

  static int plus(int a, int b) {
    return a + b;
  }
}




