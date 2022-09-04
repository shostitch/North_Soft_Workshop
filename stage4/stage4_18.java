package stage4;

import java.util.Scanner;

// 練習問題 4 - 18
// 数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。

public class stage4_18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int total = 0;
    for (;;) {
      int num = scanner.nextInt();
      if (num != 0) {
        total += num;
      } else {
        System.out.println(total);
        scanner.close();
        break;
      }
    }
    
  }
}
