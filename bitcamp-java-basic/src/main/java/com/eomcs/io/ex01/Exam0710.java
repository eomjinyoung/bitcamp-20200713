package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710 {
  public static void main(String[] args) {
    // 1) 현재 디렉토리의 파일 및 디렉토리 이름 출력
    // 2) 디렉토리 안의 목록을 출력하는 코드를 별도의 메서드로 분리
    // 3) 하위 디렉토리의 파일 및 디렉토리 목록도 출력한다.
    // 4) 하위 디렉토리 내용을 출력할 때는 인덴트를 추가한다.
    // 5) 인덴트 처리 부분을 별도의 메서드로 추출한다. (extract method)
    File dir = new File(".");

    printFiles(dir, 0);
  }

  static void printFiles(File dir, int level) {
    File[] files = dir.listFiles();

    for (File file : files) {
      printIndent(level);
      System.out.println(file.getName());
      if (file.isDirectory()) {
        printFiles(file, level + 1);
      }
    }
  }

  static void printIndent(int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("  ");
    }
    System.out.print("|-- ");
  }
}






