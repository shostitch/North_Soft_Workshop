package stage4;

import java.util.Scanner;

// 練習問題 4 - 5
// 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。

// ※ 	計算は整数で行い、小数点以下は切り捨ててよい。


public class stage4_5 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    for(int i = 1; i <= 10 ;i ++){
      int num = scanner.nextInt();
      a = a + num;
      System.out.println(a);
    }
    System.out.println("平均" + (a / 10));

    scanner.close();
  }
}
