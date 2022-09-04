package stage4;

import java.util.Scanner;

// 練習問題 4 - 13
// ストライク・カウントを数えるプログラムを作成しなさい。

// １球ごとにストライクかボールかを入力する。
// ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
// ※ 	ストライクの場合は1、ボールの場合は2を入力する。
// ストライク=1 or ボール=2 ？
// 1
// ストライク=1 or ボール=2 ？
// 2
// ストライク=1 or ボール=2 ？
// 1
// ストライク=1 or ボール=2 ？
// 1
// 1ボール,3ストライク

public class stage4_13 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int s = 0;
    int b = 0;

    while(s < 3 && b < 4){
      System.out.println("ストライク=1 or ボール=2");
      int j = scanner.nextInt();
      if(j == 1){
        s ++;
      } else if(j == 2){
        b ++;
      } else {
        System.out.println("数値が正しくありません");
      }
      System.out.println( b + "ボール" + "," + s + "ストライク");
    }



    scanner.close();
  }
}
