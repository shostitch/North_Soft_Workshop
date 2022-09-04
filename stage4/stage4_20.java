package stage4;

import java.util.Scanner;

// 練習問題 4 - 20
// サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
// サイズ 4 の例
// $
// $$
// $$$
// $$$$

public class stage4_20 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String size = scanner.next(); //文字列で受け取り方変更の練習
    int sizeInt = Integer.parseInt(size);

    for(int i = 1; i <= sizeInt; i ++){
      int count = 1;
      while(i >= count){
        System.out.print("$");
        count ++;
      }
      System.out.println();
    }
  }
}
