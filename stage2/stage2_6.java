package stage2;

import java.util.Scanner;

// 練習問題 2 - 6
// 年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。

// ※ 	日数の計算は閏年等を考慮せず、年齢×365とする。


public class stage2_6 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("あなたの年齢は？");
    int age = scanner.nextInt();
    System.out.println("日数に直すと");
    System.out.println(age * 365 + "日です");

    scanner.close();
  }
}
