package stage4;

import java.util.Scanner;

// 練習問題 4 - 11
// 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。

// 例：
// 14
// 01234567890123

public class stage4_11 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for(int i = 1; i <= num; i ++){
      for(int j = 0; j <= 9; j ++){
        System.out.print(j);
      }
    }
    System.out.println();

    scanner.close();
  }
}
