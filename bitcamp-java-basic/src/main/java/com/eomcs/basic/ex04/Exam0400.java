// 변수의 종류
package com.eomcs.basic.ex04;

public class Exam0400 {
  public static void main(String[] args) {
    // 정수
    byte b;
    short s;
    int i;
    long l;

    // 부동소수점
    float f;
    double d;

    // 문자
    char c;

    // 논리
    boolean bool;


    // 레러런스
    String str;

    // 변수의 메모리 크기
    // 정수 리터럴은 기본이 4바이트이다.
    // 원래 작은 메모리에 저장할 수 없지만,
    // 오른쪽의 값이 4바이트 정수 리터럴일 경우
    // 메모리에 그 리터럴을 저장할 수 있다면 허락한다.
    b = -128;
    b = 127;

    //b = -129;
    //b = 128;

    // 4바이트 리터럴 끼리의 연산 결과는 리터럴로 취급한다.
    b = 20 * 3;

    b = 120 + 7;
    //b = 120 + 8;

    byte b2 = 20;
    //b = 100 + b2;

    s = -32768;
    s = 32767;
    //s = -32769;
    //s = 32768;

    i = -21_0000_0000;
    i = 21_0000_0000;
    //i = -22_0000_0000;
    //i = 22_0000_0000;

    l = -922_0000_0000_0000_0000L;
    l = 922_0000_0000_0000_0000L;
    //l = -932_0000_0000_0000_0000L;
    //l = 932_0000_0000_0000_0000L;

    b = 100;
    s = 100;
    i = 100;

    //b = 100L;
    //s = 100L;
    //i = 100L;

    byte b3;
    b3 = b;
    //b3 = s;
    //b3 = i;
    //b3 = l;

    short s2;
    s2 = b;
    s2 = s;
    //s2 = i;
    //s2 = l;

    int i2;
    i2 = b;
    i2 = s;
    i2 = i;
    //i2 = l;

    long l2;
    l2 = b;
    l2 = s;
    l2 = i;
    l2 = l;

    s = -32768;
    s = 32767;
    char c2;
    //c2 = -32768;
    c2 = 0;
    c2 = 65535;
    //c2 = 65536;

    //c2 = s;
    //s = c2;

    f = 999.9999f;
    f = 9.999999f;
    f = 999999.9f;

    // 부동소수점은 7자리까지의 숫자만
    // 유효하다.
    // 그 이상의 자릿수인 경우 값이 잘린다.
    // 또는 반올림 처리 된다.
    // 주의!
    // - 유효자릿수를 넘어간다고 오류가 발생하지는 않는다.
    f = 999.99993f;
    System.out.println(f);

    float f1 = 1.234567f;
    float f2 = 92345.22f;
    float f3 = f1 + f2; // float + float = float = 12346.45xx
    double dx = f1 + f2; // dx = 12346.45xx
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(dx);

    // 두 부동소수점을 연산한 결과가
    // 7자리를 넘어 갈 것 같으면
    // 처음부터 double을 사용하라.
    double d1 = 1.234567;
    double d2 = 92345.22;
    double d3 = d1 + d2; // 12346.454567
    System.out.println("==>");
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);

    d = 799999299.99999997;
    System.out.println(d);

    //f = 2345678912.123456;
    f = 2345678912.123456f;
    // 2345678912.123456f
    // => 8바이트 값을 4바이트로 만든다.
    // => 4바이트를 넘어가는 값은 자른다.
    // => 따라서 f에 들어가는 값은 이미 잘린 값이다.
    System.out.println(f);

    d = 234.5678;
    System.out.println(d);

    f = 234.5678f;
    System.out.println(f);

    d = 234.5678f;
    System.out.println(d);

    d = f;
    System.out.println(d);

  }
}
