package basicClass;
public class Dog {
       // Q1：フィールドに動物の名前の変数を定義してください。
    String papillon;
     // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
    int kazu;
    Dog(){
        // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
        //値設定
        this.papillon = "犬";
        // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
        this.kazu = 1;
    }

    void setName(String _name){
        this.papillon = _name;
    }

    String getName(){
        return this.papillon;
    }
    int getint(){
        return this.kazu;
    }
}
