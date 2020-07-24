package com.eomcs.pms;

// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.sql.Date;
import java.util.Scanner;

// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
// 2) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.
// 3) 배열을 사용하여 여러 개의 값을 다루기
// - 배열을 사용하면 간단하게 여러 개의 변수를 선언할 수 있다.
public class App_c {

  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[회원]");

    // 최대 5명의 회원 정보를 입력 받는 변수를 선언
    int[] no = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] photo = new String[5];
    String[] tel = new String[5];
    Date[] now = new Date[5];

    long currentMillis = 0;
    int count = 1;

    // 1번 회원 입력
    System.out.print("번호? ");
    no[0] = keyInput.nextInt();
    keyInput.nextLine();

    System.out.print("이름? ");
    name[0] = keyInput.nextLine();

    System.out.print("이메일? ");
    email[0] = keyInput.nextLine();

    System.out.print("암호? ");
    password[0] = keyInput.nextLine();

    System.out.print("사진? ");
    photo[0] = keyInput.nextLine();

    System.out.print("전화? ");
    tel[0] = keyInput.nextLine();

    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
    now[0] = new Date(currentMillis);
    System.out.println();

    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String response = keyInput.nextLine();

    if (response.equals("y") || response.equals("Y")) {
      count = count + 1;

      // 2번 회원 입력
      System.out.print("번호? ");
      no[1] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("이름? ");
      name[1] = keyInput.nextLine();

      System.out.print("이메일? ");
      email[1] = keyInput.nextLine();

      System.out.print("암호? ");
      password[1] = keyInput.nextLine();

      System.out.print("사진? ");
      photo[1] = keyInput.nextLine();

      System.out.print("전화? ");
      tel[1] = keyInput.nextLine();

      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
      now[1] = new Date(currentMillis);
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      response = keyInput.nextLine();

      if (response.equalsIgnoreCase("y")) {
        count = count + 1;

        // 3번 회원 입력
        System.out.print("번호? ");
        no[2] = keyInput.nextInt();
        keyInput.nextLine();

        System.out.print("이름? ");
        name[2] = keyInput.nextLine();

        System.out.print("이메일? ");
        email[2] = keyInput.nextLine();

        System.out.print("암호? ");
        password[2] = keyInput.nextLine();

        System.out.print("사진? ");
        photo[2] = keyInput.nextLine();

        System.out.print("전화? ");
        tel[2] = keyInput.nextLine();

        currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
        now[2] = new Date(currentMillis);
        System.out.println();

        System.out.print("계속 입력하시겠습니까?(y/N) ");
        response = keyInput.nextLine();

        if (response.equalsIgnoreCase("y")) {
          count += 1; // count = count + 1;

          // 4번 회원 입력
          System.out.print("번호? ");
          no[3] = keyInput.nextInt();
          keyInput.nextLine();

          System.out.print("이름? ");
          name[3] = keyInput.nextLine();

          System.out.print("이메일? ");
          email[3] = keyInput.nextLine();

          System.out.print("암호? ");
          password[3] = keyInput.nextLine();

          System.out.print("사진? ");
          photo[3] = keyInput.nextLine();

          System.out.print("전화? ");
          tel[3] = keyInput.nextLine();

          currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
          now[3] = new Date(currentMillis);
          System.out.println();

          System.out.print("계속 입력하시겠습니까?(y/N) ");
          response = keyInput.nextLine();

          if (response.equalsIgnoreCase("y")) {
            count++; // count = count + 1

            // 5번 회원 입력
            System.out.print("번호? ");
            no[4] = keyInput.nextInt();
            keyInput.nextLine();

            System.out.print("이름? ");
            name[4] = keyInput.nextLine();

            System.out.print("이메일? ");
            email[4] = keyInput.nextLine();

            System.out.print("암호? ");
            password[4] = keyInput.nextLine();

            System.out.print("사진? ");
            photo[4] = keyInput.nextLine();

            System.out.print("전화? ");
            tel[4] = keyInput.nextLine();

            currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
            now[4] = new Date(currentMillis);
            System.out.println();

          }


        }


      }
    }

    keyInput.close();

    System.out.println("---------------------------");
    System.out.printf("%d, %s, %s, %s, %s\n", no[0], name[0], email[0], tel[0], now[0].toString());
    if (count > 1) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[1], name[1], email[1], tel[1], now[1].toString());
      if (count > 2) {
        System.out.printf("%d, %s, %s, %s, %s\n", no[2], name[2], email[2], tel[2], now[2].toString());
        if (count > 3) {
          System.out.printf("%d, %s, %s, %s, %s\n", no[3], name[3], email[3], tel[3], now[3].toString());
          if (count > 4) {
            System.out.printf("%d, %s, %s, %s, %s\n", no[4], name[4], email[4], tel[4], now[4].toString());
          }
        }
      }
    }
  }
}









