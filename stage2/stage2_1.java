package stage2;

import java.util.Scanner;

// 練習問題 2 - 1
// String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。

public class stage2_1 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("お名前教えてください！");
    String s = scanner.next();
    System.out.println(s + "さん。こんにちは");

    scanner.close();
  }
}
// Scanner scanner = new Scanner(System.in);
// int number = scanner.nextInt();
//scanner.close(); あってもなくても良い（一回閉じるとそのプログラムの中で開けない。）
