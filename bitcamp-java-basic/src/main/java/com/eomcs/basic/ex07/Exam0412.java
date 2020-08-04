package com.eomcs.basic.ex07;

// Stack과 Heap 메모리 영역
//
public class Exam0412 {

  public static void main(String[] args) {
    int[] arr;

    arr = m1(5);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static int[] m1(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 100 + i;
    }
    return arr;
  }

}






