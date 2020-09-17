package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_2 {
  public static void main(String[] args) {
    // 1) 현재 디렉토리의 파일 및 디렉토리 이름 출력
    // 2) 디렉토리 안의 목록을 출력하는 코드를 별도의 메서드로 분리
    File dir = new File(".");

    printFiles(dir);
  }

  static void printFiles(File dir) {
    File[] files = dir.listFiles();

    for (File file : files) {
      System.out.println(file.getName());
    }
  }
}
