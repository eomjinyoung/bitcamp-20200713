// 객체 출력 - 인스턴스의 값을 출력
package com.eomcs.io.ex05;

import java.io.FileOutputStream;

public class Exam0111 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test4.data");

    int age = 0x1a2b3c4d;

    // 3) 성별 출력 (1바이트)
    out.write(age >> 24); // 0000001a|2b3c4d
    out.write(age >> 16); // 00001a2b|3c4d
    out.write(age >> 8);  // 001a2b3c|4d
    out.write(age);       // 1a2b3c4d

    out.close();

    System.out.println("데이터 출력 완료!");

  }

}
