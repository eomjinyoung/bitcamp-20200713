package com.eomcs.basic.test;

public class Z implements A {
  @Override
  public void m() {
    System.out.println("Z.m()");
  }

  public void j() {
    System.out.println("X.j()");
  }
}
