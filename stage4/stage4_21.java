package stage4;

import java.util.Scanner;

// 練習問題 4 - 21
// サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。

// サイズ 3 の例
// X X
//  X
// X X
// サイズ 4 の例
// X  X
//  XX
//  XX
// X  X
// サイズ 5 の例
// X   X
//  X X
//   X
//  X X
// X   X

public class stage4_21 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String size = scanner.next();
    int sizeInt = Integer.parseInt(size);
    for(int i = 0; i < sizeInt; i ++){
      for(int j = 0; j < sizeInt; j ++){
        if(i == j || (sizeInt - i -1) == j){
          System.out.print("X");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
