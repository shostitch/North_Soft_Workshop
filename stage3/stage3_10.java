package stage3;

import java.util.Scanner;

// 練習問題 3 - 10
// 整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい。

// x は y より小さく、かつ、x と y は共に偶数である。
// x と y は等しく、かつ、負の数である。
// x は y より小さい、または、x は偶数である。
// x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
// x も y も負の数である、ではない。（ x も y も負の数である、の否定）

public class stage3_10 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    if(x < y && x % 2 == 0 && y % 2 == 0){
      System.out.println("x は y より小さく、かつ、x と y は共に偶数である");
    }
    if(x == y && x < 0){
      System.out.println("x と y は等しく、かつ、負の数である。");
    }

    if(x < y || x % 2 == 0){
      System.out.println("x は y より小さい、または、x は偶数である。");
    }

    if((x <= 10 || x >= 100) && (y >= 10 && y <= 100)){
      System.out.println(" x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
    }

    if(!(x < 0) && !(y < 0)){
      System.out.println(" x も y も負の数である、ではない。（ x も y も負の数である、の否定）");
    }
    scanner.close();
  }
}
