package stage3;

// 練習問題 3 - 1
// int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。

public class stage3_1 {
  public static void main(String[] args){
    int x = 13;
    int y = 19;
    if(x > y){
      System.out.println("xはyより大きい。");
    } else {
      System.out.println("xはyより小さい。");
    }
  }
}
