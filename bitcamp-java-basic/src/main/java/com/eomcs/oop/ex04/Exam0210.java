package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

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

    System.out.println(Math.abs(-100));
    System.out.println(Math.ceil(-3.28));
    System.out.println(Math.floor(-3.28));
    System.out.println(Math.round(3.14));
    System.out.println(Math.round(3.54));
    System.out.println(Math.pow(2, 7));

    Date d1 = new Date();

    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDate());
    System.out.println(d1.getDay());

    long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
    System.out.println(millis);

    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDate());

    long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDate());

    System.out.println("--------------------------");
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(1)); // year
    System.out.println(cal.get(2) + 1); // month
    System.out.println(cal.get(5)); // date
    System.out.println(cal.get(7)); // 요일(1 ~ 7)
    System.out.println(cal.get(4)); // 해당 월의 몇 번째 주
    System.out.println(cal.get(10)); // 12 hour
    System.out.println(cal.get(11)); // 24 hour
    System.out.println(cal.get(12)); // minute
    System.out.println(cal.get(13)); // second

    System.out.println(cal.get(Calendar.YEAR)); // year
    System.out.println(cal.get(Calendar.MONTH) + 1); // month
    System.out.println(cal.get(Calendar.DATE)); // date
    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일(1 ~ 7)
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); // 해당 월의 몇 번째 주
    System.out.println(cal.get(Calendar.HOUR)); // 12 hour
    System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24 hour
    System.out.println(cal.get(Calendar.MINUTE)); // minute
    System.out.println(cal.get(Calendar.SECOND)); // second

    // int -> Integer, byte -> Byte, short -> Short, long -> Long
    // float -> Float, double -> Double, char -> Character
    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i1 == i2);

    Integer i3 = Integer.valueOf(100);
    Integer i4 = Integer.valueOf(100);

    System.out.println(i3.toString());
    System.out.println(i4.toString());
    System.out.println(i3 == i4);

    Integer ii1 = Integer.valueOf(100);
    Integer ii2 = Integer.valueOf(200);
    Integer ii3 = Integer.valueOf(300);
    System.out.println(ii2.compareTo(ii1));
  }
}





