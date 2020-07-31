package com.eomcs.pms;

// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.sql.Date;
import java.util.Scanner;

// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는
//    메모리를 설계한다. => Member 클래스 정의
// 2) Member 클래스의 레퍼런스 배열을 만들어 Member의 인스턴스를 보관한다.
//
public class App_b {

  public static void main(String[] args) {

    // 값을 담기 위해 메모리를 준비할 때
    // 어떤 종류의 메모리를 준비해야 하는지 설계도를 작성한다.
    // => 이것을 "클래스 정의"라고 부른다.
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date createdDate;
    }

    // Member 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다.
    final int LENGTH = 100;
    Member[] members = new Member[LENGTH]; // [ , , , , ]


    Scanner keyInput = new Scanner(System.in);

    System.out.println("[회원]");

    long currentMillis = 0;
    int count = 0;

    for (int i = 0; i < LENGTH; i++) {
      count++;

      members[i] = new Member();

      System.out.print("번호? ");
      members[i].no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("이름? ");
      members[i].name = keyInput.nextLine();

      System.out.print("이메일? ");
      members[i].email = keyInput.nextLine();

      System.out.print("암호? ");
      members[i].password = keyInput.nextLine();

      System.out.print("사진? ");
      members[i].photo = keyInput.nextLine();

      System.out.print("전화? ");
      members[i].tel = keyInput.nextLine();

      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
      members[i].createdDate = new Date(currentMillis);
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();

      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈춰라.
      }
    }

    keyInput.close();

    System.out.println("---------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          members[i].no,
          members[i].name,
          members[i].email,
          members[i].tel,
          members[i].createdDate.toString());
    }

  }
}









