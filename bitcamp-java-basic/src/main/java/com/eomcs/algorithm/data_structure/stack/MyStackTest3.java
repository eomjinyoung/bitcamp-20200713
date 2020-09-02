package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest3 {
  public static void main(String[] args) throws Exception {
    MyStack<String> stack = new MyStack<>();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    stack.push("ddd");
    stack.push("eee"); // aaa,bbb,ccc,ddd,eee
    //stack.push(new Integer(100)); // 컴파일 오류!
    print(stack);

    MyStack<String> stack2 = stack.clone();// aaa,bbb,ccc,ddd,eee
    print(stack2);

    System.out.println(stack2.pop()); // eee
    System.out.println(stack2.pop()); // ddd
    System.out.println(stack2.pop()); // ccc
    print(stack2); // aaa,bbb

    System.out.println("-----------------");
    print(stack);

  }
  static void print(MyStack<?> stack) {
    for (int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + ",");
    }
    System.out.println();
  }
}
