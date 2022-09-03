package stage4;

import java.util.Scanner;

// 練習問題 4 - 10
// 個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。

public class stage4_10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 1; i <= num; i++) {
      System.out.print("*");
    }
    System.out.println();
    scanner.close();
  }
}
