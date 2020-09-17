package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_4 {
  public static void main(String[] args) {
    // 1) 현재 디렉토리의 파일 및 디렉토리 이름 출력
    // 2) 디렉토리 안의 목록을 출력하는 코드를 별도의 메서드로 분리
    // 3) 하위 디렉토리의 파일 및 디렉토리 목록도 출력한다.
    // 4) 하위 디렉토리 내용을 출력할 때는 인덴트를 추가한다.
    File dir = new File(".");

    printFiles(dir, 0);
  }

  static void printFiles(File dir, int level) {
    File[] files = dir.listFiles();

    for (File file : files) {
      for (int i = 0; i < level; i++) {
        System.out.print("  ");
      }
      System.out.println(file.getName());
      if (file.isDirectory()) {
        printFiles(file, level + 1);
      }
    }
  }
}
