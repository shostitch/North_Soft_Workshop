package stage3;

import java.util.Scanner;

// 練習問題 3 - 6
// 整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。

// “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”

// ※ 	負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
// ※ 	0 は“正の偶数”であるとする。


public class stage3_6 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // if(n >= 0){
    //   if(n % 2 == 0){
    //     System.out.println("正の偶数");
    //   } else {
    //     System.out.println("正の奇数");
    //   }
    // } else {
    //   if(n % 2 == 0){
    //     System.out.println("負の偶数");
    //   } else {
    //     System.out.println("負の奇数");
    //   }
    // }

    if(n >= 0 && n % 2 == 0){
      System.out.println("正の偶数");
    } else if(n >= 0 && n % 2 != 0){
      System.out.println("正の奇数");
    } else if(n < 0 && n % 2 == 0){
      System.out.println("負の偶数");
    } else if(n < 0 && n % 2 != 0){
      System.out.println("負の奇数");
    }


    scanner.close();
  }
}
