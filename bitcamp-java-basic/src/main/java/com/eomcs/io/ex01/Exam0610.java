package com.eomcs.io.ex01;

import java.io.File;

public class Exam0610 {

  public static void main(String[] args) throws Exception {

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


