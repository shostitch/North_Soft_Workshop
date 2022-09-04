package stage4;

import java.util.Scanner;

// 練習問題 4 - 15
// 入力された数が素数かどうかを判定するプログラムを作成しなさい。

// ※ 	判定する数は 4 以上としてよい。

public class stage4_15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    scanner.close();
    if (num < 2) {
      System.out.println("素数じゃないよ");
    }
    for (int n = 2; n < num; n++) {
      if (num % n == 0) {
        System.out.println("素数じゃないよ");
        return; //リターンで処理終了（下の素数を出力しない）
      }
    }
    System.out.println("素数");
  }
}
