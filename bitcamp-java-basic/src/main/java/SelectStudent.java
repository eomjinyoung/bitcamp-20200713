import java.util.ArrayList;
import java.util.Scanner;

public class SelectStudent {

  public static void main(String[] args) throws Exception {
    Scanner keyInput = new Scanner(System.in);

    String[] names = {
        "권구현","김성태","김유아","김찬구","김태희",
        "김하연","류승희","박민섭","신소미","오세준",
        "유아람","유지연","이건목","이성권","이승혁",
        "이용민","이재현","이종엽","정지은","조아진",
        "조은채","최진영","최희진"
    };

    ArrayList<String> nameList = new ArrayList<>();
    for (String name : names) {
      nameList.add(name);
    }

    while (nameList.size() > 0) {
      int index = (int)(Math.random() * nameList.size());
      for (int i = 0; i < 10; i++) {
        System.out.print(".");
        Thread.currentThread().sleep(1000);
      }
      String selectedName = nameList.remove(index);
      System.out.printf("=> %s\n", selectedName);
      keyInput.nextLine();
    }

    keyInput.close();

  }

}
// ------칠판--------
// [김찬구][김태희][이승혁] [김유아][신소미][최희진]
// [박민섭][이용민][이건목] [정지은][유아람][권구현]
// [김성태][김하연][이성권] [류승희][유지연][18    ]
// [19    ][조은채][조아진] [이재현][23    ][24    ]
// [25    ][26    ][이종엽] [오세준][최진영][30    ]












