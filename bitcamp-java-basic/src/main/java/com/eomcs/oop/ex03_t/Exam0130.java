package com.eomcs.oop.ex03_t;

public class Exam0130 {
  // static field = class variable
  static class A {
    static int v1;
    static boolean v2;
  }

  public static void main(String[] args) {

    A obj1 = new A();
    A obj2 = new A();

    // 레퍼런스.변수명 = 100;
    // - 레퍼런스 다음에 지정한 변수가 인스턴스 변수가 아니라
    //   클래스 변수라면 컴파일러가 컴파일하는 과정에 정확하게
    //   클래스 변수를 가리키도록 기계어로 바꾼다.
    // - 즉 개발자가 레퍼런스를 통해 클래스 변수를 지정하더라도
    //   컴파일러가 클래스 변수로 인식하여 클래스 변수를 사용하는 코드로 변환한다.
    obj1.v1 = 100; // => A.v1 = 100;
    obj2.v1 = 200; // => A.v1 = 200;

    A.v1 = 300;

    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(A.v1);
  }
}

// 클래스 로딩
// 1) 클래스 파일을 찾는다.
//    - JDK가 설치된 폴더의 하위 폴더인 /lib에서 찾는다.
//    - OS의 CLASSPATH 환경 변수에 설정된 디렉토리를 탐색하여 찾는다.
//    - JVM을 실행할 때 -classpath 또는 -cp 옵션으로 설정된 디렉토리를 탐색하여 찾는다.
//    - JVM을 실행하는 현재 폴더에서 찾는다.
//    - 그래도 없으면 오류를 띄운다.
// 2) 클래스 파일 검증
//    - bytecode의 유효여부를 검사
// 3) 클래스를 Method Area 영역에 로딩
//    - 코드(생성자, 메서드) 보관
//    - 상수 보관
//    - 스태틱 필드 생성
// => 클래스는 딱 한 번만 로딩된다. 중복 로딩되지 않는다.








