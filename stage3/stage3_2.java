package stage3;

import java.util.Scanner;

// 練習問題 3 - 2
// ２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。

public class stage3_2 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("aは");
    int a = scanner.nextInt();
    System.out.println("bは");
    int b = scanner.nextInt();

    if(a == b){
      System.out.println("同じです");
    } else if(a < b){
      System.out.println("bの方が大きいです");
    } else {
      System.out.println("aの方が大きいです");
    }

    scanner.close();
  }
}
