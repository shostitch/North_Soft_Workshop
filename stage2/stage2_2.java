package stage2;

import java.util.Scanner;

// 練習問題 2 - 2
// int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。

public class stage2_2 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    System.out.println(x);

    scanner.close();
  }
}
