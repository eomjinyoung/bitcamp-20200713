package com.eomcs.util;

import java.util.NoSuchElementException;

// Queue 객체에서 값을 꺼내는 클래스를 정의한다.
// => Iterator 계약에 따라 동작하는 클래스다.
// => 인터페이스를 구현하는 클래스를 보통 그 인터페이스의 구현체라 부른다.
// => 즉 다음 클래스는 "Iterator의 구현체" 이다.
public class QueueIterator<E> implements Iterator<E> {

  Queue<E> queue;

  public QueueIterator(Queue<E> queue) {
    this.queue = queue;
  }

  @Override
  public boolean hasNext() {
    return queue.size() > 0;
  }

  @Override
  public E next() {
    if (queue.size() == 0) 
      throw new NoSuchElementException(); // 목록에 데이터가 없다는 것을 알려주는 예외 클래스다.
    return queue.poll();
  }
}
