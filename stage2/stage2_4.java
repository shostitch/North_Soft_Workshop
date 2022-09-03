package stage2;

import java.util.Scanner;

// 練習問題 2 - 4
// int 型の変数 x、y にそれぞれ数値を入力し、x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。

public class stage2_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("xの値は？");
    int x = scanner.nextInt();
    System.out.println("yの値は？");
    int y = scanner.nextInt();
    System.out.println("和" + (x + y));
    System.out.println("差" + (x - y));
    System.out.println("積" + (x * y));
    System.out.println("商" + (x / y) + "余り" + (x % y));

    scanner.close();
  }
}
