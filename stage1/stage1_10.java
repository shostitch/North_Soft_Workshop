package stage1;

// 練習問題 1 - 10
// int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。

public class stage1_10 {
  public static void main(String[] args){
    int x = 2;
    int y = 1;
    for(int i = 1; i < 4; i ++){
      y = y * x;
      System.out.println(y);
    }
  }
}
