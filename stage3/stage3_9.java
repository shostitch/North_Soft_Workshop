package stage3;

import java.util.Scanner;

// 練習問題 3 - 8
// 中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。

// 両方とも 60 点以上の場合、合格
// 合計が 130 点以上の場合、合格
// 合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
// 上記以外は不合格

public class stage3_9 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int test1 = scanner.nextInt();
    int test2 = scanner.nextInt();

    if (test1 >= 60 && test2 >= 60){
      System.out.println("合格");
    } else if(test1 + test2 >= 130){
      System.out.println("合格");
    } else if(test1 + test2 >= 100 && test1 >= 90 || test2 >= 90){
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }

    scanner.close();
  }
}
