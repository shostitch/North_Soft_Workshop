package stage3;

import java.util.Scanner;
// 練習問題 3 - 3
// int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”
// と表示するプログラムを作成しなさい。

public class stage3_3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("xは");
    int x = scanner.nextInt();
    System.out.println("yは");
    int y = scanner.nextInt();
    if(x == y){
      System.out.println("xとyは同じです");
    } else if(x > y){
      System.out.println("xはyより大きい");
    } else {
      System.out.println("xはyより小さい");
    }

    scanner.close();
  }
}
