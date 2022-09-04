package stage4;

import java.util.Scanner;

// 練習問題 4 - 14
// 前の問題に次の修正を加えなさい。

// １球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
// ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
// ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。

public class stage4_14 {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int s = 0;
    int b = 0;

    while(s < 3 && b < 4){
      System.out.println("ストライク=1 or ボール=2 or ファール=3");
      int j = scanner.nextInt();
      if(j == 1){
        s ++ ;
      } else if(j == 2){
        b ++ ;
      } else if(j == 3){
        if(s < 2){
          s ++ ;
        }
      }
      System.out.println( b + "ボール" + "," + s + "ストライク");
    }

    scanner.close();
  }
}
