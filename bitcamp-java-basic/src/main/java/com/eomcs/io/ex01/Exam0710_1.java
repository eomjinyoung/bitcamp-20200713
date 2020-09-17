package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_1 {
  public static void main(String[] args) {
    // 1) 현재 디렉토리의 파일 및 디렉토리 이름 출력
    File dir = new File(".");

    File[] files = dir.listFiles();

    for (File file : files) {
      System.out.println(file.getName());
    }
  }
}
