package stage3;

import java.util.Scanner;

// 練習問題 3 - 12
// 好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。

// ※ 	switch 文を使用する。
// ※ 	選択は、“1：まぐろ 2：えび 3：こはだ．．．”のようなガイドを表示し数字で入力させる。
// ※ 	題材は鮨でなくても良い。

public class stage3_12 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("数字でお答えください。（1：まぐろ 2：えび 3：こはだ）");
    int sushi = scanner.nextInt();
    switch(sushi){
      case 1:
      System.out.println("まぐろ");
        break;
        case 2:
      System.out.println("まぐろ");
        break;
        case 3:
      System.out.println("まぐろ");
        break;
      default:
        System.out.println("番号に一致するネタはありません");
        break;
    }
    scanner.close();
  }
}
