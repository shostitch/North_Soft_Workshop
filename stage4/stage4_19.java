package stage4;

import java.util.Scanner;

// 練習問題 4 - 19
// 数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。

public class stage4_19 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int ave = 0;
    int count = 0;
    for(;;){
      int num = scanner.nextInt();
      if(num == 0){
        scanner.close();
        break;
      }
      ave = ave + num;
      count ++;
    }
    System.out.println(ave / count);
  }
}
