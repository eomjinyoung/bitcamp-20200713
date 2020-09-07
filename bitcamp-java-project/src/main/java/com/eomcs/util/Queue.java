package com.eomcs.util;

// 1) Queue 를 구현하기 위해 기존에 작성한 MyLinkedList를 상속 받는다.
// 2) Queue에 값을 추가하는 offer(Object)를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()을 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.
//
// 테스트2: MyQueueTest2
// 5) Queue.clone() 오버라이딩 : deep copy
// 
// 테스트3: MyQueueTest3
// 6) 제네릭 적용
//
public class Queue<E> extends LinkedList<E> implements Cloneable {

  public boolean offer(E e) {
    return add(e);
  }

  public E poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }

  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> newQueue = new Queue<>();
    //Object[] values = this.toArray();
    for (Object value : this.toArray()) {
      newQueue.offer((E)value);
    }
    return newQueue;
  }

  // 상속 받은 메서드가 서브 클래스의 역할에 맞지 않다면 
  // 역할에 맞게끔 재정의 하라. => 오버라이딩
  // AbstractList로부터 상속 받은  iterator()는 ListIterator 객체를 리턴한다.
  // ListIterator 는 입력한 순서대로 조회한다.
  // Queue도 입력한 순서대로 조회하는 것은 같다. 다만 맨 앞의 값을 꺼내서 삭제한다.
  // 따라서 Queue 방식에 맞게 동작하는  Iterator를 리턴하도록 하라.
  @Override
  public Iterator<E> iterator() {
    try {
      return new QueueIterator<E>(this.clone());
    } catch (Exception e) {
      throw new RuntimeException("큐를 복제하는 중에 오류 발생!");
    }
  }
}






