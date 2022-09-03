package stage4;

// 練習問題 4 - 4
// 7 の階乗を計算し、表示するプログラムを作成しなさい。

public class stage4_4 {
  public static void main(String[] args){
    int num = 1;

    for(int i = 7; i > 0; i --){
      num *= i;
      System.out.println(num);
    }
  }
}
