package com.eomcs.io.ex01;

import java.io.File;

public class Exam610_1 {
  public static void main(String[] args) {
    // 1) 현재 폴더의 모든 파일 또는 모든 디렉토리 이름을 출력하라!
    File file = new File(".");
    String[] filenames = file.list();
    for (String filename : filenames) {
      System.out.println(filename);
    }
  }
}
