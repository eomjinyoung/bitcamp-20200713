package com.eomcs.util;

import java.util.EmptyStackException;

// 1) Stack 을 구현하기 위해 기존에 작성한 MyLinkedList를 상속 받는다.
// 2) 스택에 값을 추가하는 push() 메서드를 정의한다.
// 3) 스택에서 제일 마지막에 추가한 값을 꺼내는 pop() 메서드를 정의한다.
// 4) 스택에서 제일 마지막에 입력한 값을 조회하는 peek()을 정의한다.
// 5) 스택이 비어 있는지 알려주는 empty()를 정의한다.
//
// 테스트2: MyStackTest2
// 6) Object.clone()을 오버라이딩 : deep copy
//
// 테스트3: MyStackTest3
// 7) 제네릭 적용
//
public class Stack<E> extends LinkedList<E> implements Cloneable {

  public E push(E item) {
    add(item);
    return item;
  }

  public E pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public E peek() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }

  public boolean empty() {
    return this.size() == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone() throws CloneNotSupportedException {
    // 새 스택을 만든다.
    Stack<E> newStack = new Stack<E>();

    // 기존 스택의 값을 가져온다.
    Object[] values = this.toArray();

    // 기존 스택의 값을 새 스택에 넣는다.
    for(Object value : values) {
      newStack.push((E) value);
    }
    return newStack;
  }

  // 수퍼 클래스의  iterator()는 ListIterator 를 리턴한다.
  // ListIterator는 Stack으로 목록을 관리하는 방식과 다르게 데이터를 조회하다.
  // 따라서 Stack 에 맞는 Iterator를 리턴할 필요가 있다.
  // => 오버라이딩을 이용하여 상속 받은 메서드를 서브 클래스에 맞게 재정의한다.
  @Override
  public Iterator<E> iterator() {
    try {
      return new StackIterator<E>(this.clone());
    } catch (Exception e) {
      // 스택을 복제하다가 오류가 발생하면 
      // 이 메서드를 호출한 쪽에 오류 내용을 전달한다.
      throw new RuntimeException("스택 복제 중에 오류 발생!");
    }
  }
}






