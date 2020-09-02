package com.eomcs.util;

import java.util.EmptyStackException;

public class Stack extends LinkedList implements Cloneable {

  public Object push(Object item) {
    add(item);
    return item;
  }

  public Object pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public Object peek() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }

  public boolean empty() {
    return this.size() == 0;
  }

  @Override
  public Stack clone() throws CloneNotSupportedException {
    // 새 스택을 만든다.
    Stack newStack = new Stack();

    // 기존 스택의 값을 가져온다.
    Object[] values = this.toArray();

    // 기존 스택의 값을 새 스택에 넣는다.
    for(Object value : values) {
      newStack.push(value);
    }
    return newStack;
  }
}






