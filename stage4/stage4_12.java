package stage4;

import java.util.Scanner;

// 練習問題 4 - 12
// 数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。

public class stage4_12 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int total = 0;

    while(total <= 100){
      int num = scanner.nextInt();
      total = total + num;
    }

    System.out.println(total);

    scanner.close();
  }
}
