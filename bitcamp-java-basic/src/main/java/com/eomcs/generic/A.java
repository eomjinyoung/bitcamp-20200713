package com.eomcs.generic;

import java.io.Serializable;

class X extends Throwable implements Serializable {
  private static final long serialVersionUID = 1L;

  public static class Y {

  }
}

public class A<T> {
  static class B extends X {

  }
}
