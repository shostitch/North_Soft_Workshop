package stage1;

// 練習問題 1 - 9
// int 型の変数 x に任意の数値を代入し、x を 2 倍、3 倍、4 倍した結果を表示するプログラムを作成しなさい。

public class stage1_9 {
  public static void main(String[] args){
    int x = 1;
    for(int i = 2; i < 5; i ++){
      x *= i;
      System.out.println(x);
      x = 1;
    }
  }
}
