package stage4;

import java.util.Scanner;

// 次のプログラムを作成しなさい。

// 巨人、阪神戦で毎回の得点を入力する。（１回～９回）
// 入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
// ※ 	試合は巨人の先行とする。
// 1回表、巨人の得点は？ 0
// 1回裏、阪神の得点は？ 0
// 2回表、巨人の得点は？ 0
// 2回裏、阪神の得点は？ 1
//     ：
//     ：
//     ：
// 9回表、巨人の得点は？ 0
// 9回裏、阪神の得点は？ 1

// 巨人：5点, 阪神：6点
// 阪神の勝ち

public class stage4_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = 0;
    int h = 0;
    for (int i = 1; i < 10; i++) {
      System.out.println("巨人の点は？");
      int kwan = scanner.nextInt();
      System.out.println("阪神の点は？");
      int hwan = scanner.nextInt();
      k = k + kwan;
      h = h + hwan;
    }
    System.out.println("巨人:" + k + "阪神:" + h);
    if (k == h) {
      System.out.println("延長戦に");
    } else if (k > h) {
      System.out.println("巨人の勝ち");
    } else {
      System.out.println("阪神の勝ち");
    }
    scanner.close();
  }
}
