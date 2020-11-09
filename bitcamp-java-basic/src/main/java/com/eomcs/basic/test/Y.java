package com.eomcs.basic.test;

public class Y implements A {
  @Override
  public void m() {
    System.out.println("Y.m()");
  }

  public void i() {
    System.out.println("X.i()");
  }
}
