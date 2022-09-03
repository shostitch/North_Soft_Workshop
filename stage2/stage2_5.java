package stage2;

import java.util.Scanner;

// 練習問題 2 - 5
// ２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。

// ※ 	計算は整数で行い、小数点以下は切り捨ててよい。

public class stage2_5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("一つ目の値は");
    int number1 = scanner.nextInt();
    System.out.println("二つ目の値は");
    int number2 = scanner.nextInt();
    System.out.println("平均は");
    System.out.println((number1 + number2) / 2);

    scanner.close();
  }
}
