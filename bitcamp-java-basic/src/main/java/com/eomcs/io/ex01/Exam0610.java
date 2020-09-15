package com.eomcs.io.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0610 {

  public static void main(String[] args) throws Exception {
    File dir = new File(".");

    // list() 메서드에서 필터로 사용할 객체를 만든다.
    // 단 FilenameFilter라는 호출 규칙에 따라 만든다.
    class MyFilenameFilter implements FilenameFilter {
      @Override
      public boolean accept(File dir, String name) {
        // list() 메서드는 해당 디렉토리에서 찾은 파일이나 하위 폴더에 대해 
        // 결과에 포함시킬지 말지 결정하기 위해 이 메서드를 매번 호출할 것이다.
        System.out.printf("> %s/%s\n", dir.getName(), name);

        if (name.endsWith(".java")) {
          return true; // 결과에 포함시키라는 의미로 true를 리턴한다.
        } 
        return false; // 결과에 포함시키지 말라는 의미로 false를 리턴한다.
      }
    }

    FilenameFilter filter = new MyFilenameFilter();

    // list()를 호출할 때 list()가 사용할 필터를 파라미터로 넘겨준다.
    String[] names = dir.list(filter);

    System.out.println("----------------------------------------");

    for (String name : names) {
      System.out.println(name);
    }
  }

}


