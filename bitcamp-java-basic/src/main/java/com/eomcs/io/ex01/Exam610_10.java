package com.eomcs.io.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam610_10 {
  public static void main(String[] args) {
    // 1) 현재 폴더의 모든 파일 또는 모든 디렉토리 이름을 출력하라!
    // 2) 파일 이름 뿐만아니라 디렉토리일 경우 d 파일일 경우 -를 앞에 출력하라.
    // 3) 파일의 크기를 출력하라.
    // 4) 파일의 크기를 출력할 때 10자리로 고정하라.
    // 5) 파일의 크기를 출력할 때 크기가 0인 경우 빈 문자열을 출력하라.
    // 6) 파일 이름이 .java로 끝나는 경우만 출력하라.
    // 7) 출력에서 디렉토리를 제외하라.
    // 8) 필터를 익명 클래스로 변경하라.
    // 9) 익명 클래스를 파라미터 넣는 곳에 직접 위치시켜라.
    // 10) 익명 클래스를 람다로 변경하라.
    File file = new File(".");
    File[] files = file.listFiles(f -> f.isFile() && f.getName().endsWith(".java"));
    for (File f : files) {
      System.out.printf("%s %10s %s\n",
          f.isDirectory() ? "d" : "-",
              f.length() > 0 ? f.length() : "",
                  f.getName());
    }
  }
}
