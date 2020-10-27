import java.util.ArrayList;
import java.util.Scanner;

public class SelectStudent3 {

  public static void main(String[] args) throws Exception {
    Scanner keyInput = new Scanner(System.in);

    String[] names = {
        "조은채","최진영",
        "권구현","김성태","김유아","김찬구","김태희",
        "유아람","유지연","이건목","이성권","이승혁",
        "이용민","이재현","이종엽","정지은","최희진",
        "김하연","류승희","박민섭","신소미","오세준"
    };

    ArrayList<String> nameList = new ArrayList<>();
    for (String name : names) {
      nameList.add(name);
    }

    System.out.print("처음: ");
    for (String name : nameList) {
      System.out.printf("%s, ", name);
    }
    System.out.println();
    System.out.println("------------------------------------");
    System.out.println();

    for (int i = 0; i < 10000; i++) {
      int index = (int)(Math.random() * nameList.size());
      int index2 = (int)(Math.random() * nameList.size());
      String temp = nameList.get(index);
      nameList.set(index, nameList.get(index2));
      nameList.set(index2, temp);
    }

    System.out.print("섞기: ");
    for (String name : nameList) {
      System.out.printf("%s, ", name);
    }
    System.out.println();
    System.out.println("------------------------------------");
    System.out.println();

    System.out.print("시작할까요?");
    keyInput.nextLine();

    int count = 0;
    while (nameList.size() > 0) {
      count++;
      int index = (int)(Math.random() * nameList.size());
      System.out.printf("%s ", nameList.remove(index));
      Thread.currentThread().sleep(3000);
      if (count % 5 == 0) {
        System.out.println();
        Thread.currentThread().sleep(5000);
      }
    }

    keyInput.close();

  }

}
// ------프로젝트 팀--------
//[1팀]  [2팀]  [3팀]  [4팀]  [5팀]
//김하연 정지은 이승혁 권구현 최희진
//이종엽 신소미 조은채 이성권 이건목
//유지연 이용민 오세준 이재현 류승희
//최진영 김유아 유아람 김성태 김찬구
//박민섭 김태희












