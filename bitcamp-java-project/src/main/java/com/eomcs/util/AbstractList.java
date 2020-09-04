package com.eomcs.util;

// 이 추상 클래스는 List 규칙에 따라 작성한다.
// => 단 일부 메서드는 이 클래스에서 구현하지만,
//    나머지 메서드는 서브 클래스에서 구현하도록 남겨둔다.
public abstract class AbstractList<E> implements List<E> {

  protected int size;

  @Override
  public int size() {
    return this.size;
  }

  // 인터페이스에 선언된 메서드 중에서 나머지 메서드는 
  // 서브 클래스의 특징에 따라 구현해야 하기 때문에 여기서 구현하지 않는다.
  // => 즉 나머지 메서드는 추상 메서드인채로 남겨진다.
}
