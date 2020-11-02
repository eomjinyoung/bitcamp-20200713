import java.util.ArrayList;
import java.util.Scanner;

public class SelectStudent {

  public static void main(String[] args) throws Exception {
    Scanner keyInput = new Scanner(System.in);

    String[] names = {
        "최진영","최희진",
        "권구현","김성태","김유아","김찬구","김태희",
        "유아람","유지연","이건목","이성권","이승혁",
        "이용민","이재현","이종엽","정지은","조은채",
        "김하연","류승희","박민섭","신소미","오세준"
    };

    ArrayList<String> nameList = new ArrayList<>();
    for (String name : names) {
      nameList.add(name);
    }

    int count = 0;
    int delay = 2000;
    while (nameList.size() > 0) {
      int index = (int)(Math.random() * nameList.size());
      Thread.sleep(delay);
      String selectedName = nameList.remove(index);
      System.out.printf("%s, ", selectedName);
      if ((++count % 11) == 0) {
        keyInput.nextLine();
        delay = 5000;
      }
    }

    keyInput.close();

  }

}
// ------칠판--------
// [박민섭][김태희][김하연] [최희진][      ][이종엽]
// [유아람][이용민][이건목] [권구현][김유아][신소미]
// [김성태][      ][김찬구] [정지은][유지연][      ]
// [      ][조은채][이승혁] [이성권][이재현][      ]
// [      ][      ][류승희] [오세준][최진영][      ]












