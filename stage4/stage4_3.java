package stage4;

// 練習問題 4 - 3
// 2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。

public class stage4_3 {
  public static void main(String[] args){
    int num = 2;
    int a = 1;

    for(int i = 1; i <= 8; i ++){
      a *= num;
      System.out.println(a);
    }
  }
}
