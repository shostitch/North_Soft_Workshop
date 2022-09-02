package stage1;

//練習問題 1 - 12
// int 型の変数 x に任意の数値を代入し、
// インクリメント演算子、デクリメント演算子を適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。

public class stage1_12 {
  public static void main(String[] args){
    int x = 10;
    for(int i = 0; i <= x; i ++){
      System.out.println(i);
    }

    int y = 0;
    for(int j = 10; j >= y; j --){
      System.out.println(j);
    }
  }
}
