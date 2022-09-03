package stage4;

import java.util.Scanner;

// 練習問題 4 - 6
// 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。

public class stage4_6 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int wins = 0;
    for(int i = 1; i <= 10; i ++){
      System.out.println("0か1を入力してください");
      int result = scanner.nextInt();
      if(result == 1){
        wins ++;
      }
    }
    System.out.println("勝利" + wins + "敗北" + (10 - wins));
    scanner.close();
  }
}
