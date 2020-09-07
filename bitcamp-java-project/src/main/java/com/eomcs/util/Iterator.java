package com.eomcs.util;

// 컬렉션의 데이터를 조회할 때 호출할 메서드 규칙을 정의한다.
public interface Iterator<E> {
  boolean hasNext();
  E next();
}
