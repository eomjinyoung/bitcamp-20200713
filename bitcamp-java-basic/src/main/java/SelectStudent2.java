import java.util.ArrayList;
import java.util.Scanner;

public class SelectStudent2 {

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

    int count = 0;
    int delay = 1000;
    while (nameList.size() > 0) {
      count++;
      int index = (int)(Math.random() * nameList.size());
      System.out.printf("%s ", nameList.remove(index));
      Thread.currentThread().sleep(1000);
      if (count % 2 == 0) {
        System.out.println();
        Thread.currentThread().sleep(5000);
      }
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












