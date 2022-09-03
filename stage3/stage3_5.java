package stage3;

import java.util.Scanner;

// 練習問題 3 - 5
// 正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。

// ※ 	奇数、偶数の判定には除算の余りを利用する。


public class stage3_5 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if(number % 2 == 0){
      System.out.println("偶数");
    } else {
      System.out.println("奇数");
    }

    scanner.close();
  }
}
