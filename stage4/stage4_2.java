package stage4;

// 練習問題 4 - 2
// 九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。

public class stage4_2 {
  public static void main(String[] args){
    int num = 3;
    int a = 1;
    for(int i = 1; i <= 9; i ++){
      a = num * i;
      System.out.println(a);
    }
  }
}
