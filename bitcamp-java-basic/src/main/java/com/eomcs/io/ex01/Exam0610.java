package com.eomcs.io.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam0610 {

  public static void main(String[] args) throws Exception {

    File dir = new File(".");
    File[] files = dir.listFiles(new FileFilter() {
      @Override
      public boolean accept(File file) {
        if (file.isFile() && file.getName().endsWith(".java"))
          return true; // 조회 결과에 포함시켜라!
        return false; // 조회 결과에서 제외하라!
      }
    });

    for (File file : files) {
      System.out.printf("%s %12d %s\n", 
          file.isDirectory() ? "d" : "-", 
              file.length(),
              file.getName());
    }

  }

}


