package stage4;

import java.util.Scanner;

// 練習問題 4 - 9
// 整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。

public class stage4_9 {
  public static void main(String[] args){
    int max = 0;
    int min = 100;
    Scanner scanner = new Scanner(System.in);
    for(int i = 1; i <= 10; i++){
      int num = scanner.nextInt();
      if(num > max){
        max = num;
      }
      if(num < min){
        min = num;
      }
    }
    System.out.println("最大値:" + max + "最小値:" + min);

    scanner.close();
  }
}
