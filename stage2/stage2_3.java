package stage2;

import java.util.Scanner;

// 練習問題 2 - 3
// int 型の変数 x に数値を入力し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。

public class stage2_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = 1;
    // System.out.println(x);
    // System.out.println(x * x);
    // System.out.println(x * x * x);

    for (int i = 1; i <= x; i++) {
      y = y * x;
      System.out.println(y);
    }
    // for文の方がいい感じ＾＾

    scanner.close();
  }
}
