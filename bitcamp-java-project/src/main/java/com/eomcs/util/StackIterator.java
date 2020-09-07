package com.eomcs.util;

import java.util.NoSuchElementException;

// Stack 객체에서 값을 꺼내는 클래스를 정의한다.
// => Iterator 계약에 따라 동작하는 클래스다.
// => 인터페이스를 구현하는 클래스를 보통 그 인터페이스의 구현체라 부른다.
// => 즉 다음 클래스는 "Iterator의 구현체" 이다.
public class StackIterator<E> implements Iterator<E> {

  Stack<E> stack;

  public StackIterator(Stack<E> stack) {
    this.stack = stack;
  }

  @Override
  public boolean hasNext() {
    return !stack.empty();
  }

  @Override
  public E next() {
    if (stack.empty()) 
      throw new NoSuchElementException(); // 목록에 데이터가 없다는 것을 알려주는 예외 클래스다.
    return stack.pop();
  }
}
