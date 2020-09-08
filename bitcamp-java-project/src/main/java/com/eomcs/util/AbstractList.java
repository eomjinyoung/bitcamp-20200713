package com.eomcs.util;

import java.util.NoSuchElementException;

public abstract class AbstractList<E> implements List<E>{

  protected int size;

  @Override
  public int size() {
    return size;
  }

  // 인터페이스 새로 추가된 규칙, `Iterator` 구현체를 리턴하는 메서드를 정의한다.
  @Override
  public Iterator<E> iterator() {
    class ListIterator implements Iterator<E> {
      int cursor;

      @Override
      public boolean hasNext() {
        return cursor < size();
      }

      @Override
      public E next() {
        if (cursor ==  size())
          throw new NoSuchElementException();
        return AbstractList.this.get(cursor++);
      }
    }
    return new ListIterator();
  }

}
