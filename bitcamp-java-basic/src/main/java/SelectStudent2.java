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
      Thread.sleep(delay);
      if (count % 2 == 0) {
        System.out.println();
        Thread.sleep(5000);
      }
    }

    keyInput.close();

  }

}
// ------칠판--------
//[최희진1][       ][김하연2]   [정지은1][       ][이종엽2]
//[유지연2][       ][류승희1]   [박민섭2][       ][이건목1]
//[김찬구1][       ][김태희3]   [김유아1][       ][최진영2]
//[이재현3][       ][이용민4]   [이성권3][       ][신소미4]
//[조은채4][       ][권구현3]   [유아람4][       ][김성태3]
//                              [이승혁4][       ][오세준4]

//[최희진1][       ][       ]   [정지은1][       ][       ]
//[       ][       ][류승희1]   [       ][       ][이건목1]
//[김찬구1][       ][       ]   [김유아1][       ][       ]
//[       ][       ][이용민4]   [       ][       ][신소미4]
//[조은채4][       ][       ]   [유아람4][       ][       ]
//                  [이승혁4]   [       ][       ][오세준4]

//[       ][       ][김하연2]   [       ][       ][이종엽2]
//[유지연2][       ][       ]   [박민섭2][       ][       ]
//[       ][       ][김태희3]   [       ][       ][최진영2]
//[이재현3][       ][       ]   [이성권3][       ][       ]
//[       ][       ][권구현3]   [       ][       ][김성태3]
//                              [       ][       ][       ]







