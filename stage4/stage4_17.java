package stage4;

// 練習問題 4 - 17
// 九九表（一の段～九の段）を表示するプログラムを作成しなさい。

public class stage4_17 {
  public static void main(String[] args){
    for(int i = 1; i < 10; i ++){
      for(int j = 1; j < 10; j ++){
        //int k = i * j;
        //System.out.print(i + " * " + j + " = " + k + " ");
        System.out.printf(" %2d",i * j); //2桁に決めることで表が綺麗に並ぶ
        //System.out.print(" " + k);
      }
      System.out.println();
    }
  }
}
