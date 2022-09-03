package stage3;

import java.util.Scanner;

// 練習問題 3 - 9
// 曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。

// 開いているか、休診であるかは、次の表に従います。
//      日曜	月曜	火曜	水曜	木曜	金曜	土曜
// 午前	休診	 ○	  休診	 ○	  ○	  休診   ○
// 午後	休診	 ○    ○	    ○	   ○	  ○	   休診
// 夜間	休診	 ○	  ○	   休診	  ○	   ○	  休診
// ※ 	曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
// >0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
// >0=午前、1=午後、2=夜間

public class stage3_8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("何曜日ですか？ 0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
    int day = scanner.nextInt();
    System.out.println("時間帯はいつですか? 0=午前、1=午後、2=夜間");
    int time = scanner.nextInt();

    if (day == 0 || (day == 2 && time == 0) || (day == 3 && time == 2) || (day == 5 && time == 0)
        || (day == 6 && time != 0)) {
      System.out.println("休診です");
    } else {
      System.out.println("予約しました");
    }

    scanner.close();
  }
}
