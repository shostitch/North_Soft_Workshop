package stage4;

import java.util.Scanner;

// 練習問題 4 - 8
// 自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。

public class stage4_8 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    for(int i = 1; i <= 10; i ++){
      int num = scanner.nextInt();
      if(a <= num){
        a = num;
      }
    }

    System.out.println("最大値は" + a);

    scanner.close();
  }
}
