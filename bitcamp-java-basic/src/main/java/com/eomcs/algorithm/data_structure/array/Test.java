package com.eomcs.algorithm.data_structure.array;

public class Test {

  public static void main(String[] args) {
    String s = new String();
    
    Class<?> classInfo = String.class;
    System.out.println(classInfo);
    
    Class<?> classInfo2 = s.getClass();
    System.out.println(classInfo2);
    
    System.out.println(classInfo == classInfo2);
  }

 
}
