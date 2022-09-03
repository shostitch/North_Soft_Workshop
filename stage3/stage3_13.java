package stage3;

import java.util.Scanner;

// 練習問題 3 - 13
// 月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。

// また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。

// ※ 	switch 文を使用すること。

public class stage3_13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    switch (num) {
      case 1:
        System.out.println(31);
        break;
      case 2:
        System.out.println(28);
        break;
      case 3:
        System.out.println(31);
        break;
      case 4:
        System.out.println(30);
        break;
      case 5:
        System.out.println(31);
        break;
      case 6:
        System.out.println(30);
        break;
      case 7:
        System.out.println(31);
        break;
      case 8:
        System.out.println(31);
        break;
      case 9:
        System.out.println(30);
        break;
      case 10:
        System.out.println(31);
        break;
      case 11:
        System.out.println(30);
        break;
      case 12:
        System.out.println(31);
        break;
    }

    scanner.close();
  }
}
