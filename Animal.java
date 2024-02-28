package basicClass;
import java.util.*;
import java.text.SimpleDateFormat; // 1．インポート
import java.util.Date;
public class Animal{
    public static void main(String[] args){
        // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog p = new Dog();
        System.out.println(p.getName());
// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        System.out.println(p.getint());
// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		Date exDate = new Date();   // 2．日付（今回は現在の日時）を取得
        SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s"); // 3．パターンを指定

        System.out.println(exDateFormat.format(exDate)); 
    }
}
