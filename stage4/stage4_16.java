package stage4;

import java.util.Scanner;

// 練習問題 4 - 16
// 2 以上の数値を入力し、素因数分解した結果を表示しなさい。

// 例：
// 20100
// 2 2 3 5 5 67

public class stage4_16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 2; 1 < num; i++) {
      while (num % i == 0) {
        System.out.print(i + " ");
        num = num / i;
      }
    }
    System.out.println();
    scanner.close();
  }
}
