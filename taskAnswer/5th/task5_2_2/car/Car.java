class Car {
    private String name;    //名前
    private int width;      //幅
    private int height;     //高さ
    private int length;     //長さ
    private double x;       //現在位置X座標
    private double y;       //現在位置Y座標
    private double fuel;    //残り燃料

    //ここより追加のフィールド
    private double tankCapacity;    //タンク容量
    private double fuelConsumption; //燃費

// コンストラクタ
    Car(String name, int width, int height,int length , double fuel){
        this.name = name;    this.width = width; 
        this.height = height;this.length = length;
        this.fuel  = fuel;
        x = y = 0;
    }

    double getX(){return x;} //現在位置のX座標を取得
    double getY(){return y;} //現在位置のY座標を取得
    double getFuel(){return fuel;} //残り燃料を取得

    //スペックを表示
    void putSpec(){
        System.out.println("名前:" + name);
        System.out.println("車幅:" + width + "mm");
        System.out.println("車高:" + height + "mm");
        System.out.println("車長:" + length + "mm");
        //追加
        System.out.println("タンク容量:" + tankCapacity + "L");
        System.out.println("燃費:" + fuelConsumption + "km/L");
    }
    // X方向にdx・Y方向にdy移動
    boolean move(double dx,double dy){
        double dist = Math.sqrt(dx * dx + dy * dy); //移動距離

        if(dist > fuel)
            return false;   //移動できない…燃料不足
        else {
            fuel -= dist/fuelConsumption;   //移動距離の分だけ燃料を減らす 燃費を反映
            x += dx;
            y += dy;
            return true;    //移動完了
        }
    }

    //給油メソッド１　指定した量を給油する 給油できない燃料の量を返却
    double oiling(double addFuel){
        fuel += addFuel;
        double surplus = fuel - tankCapacity;
        if(surplus > 0){
            System.out.printf("燃料が満タンになりました。%fLは給油できませんでした。",surplus);
            fuel = tankCapacity;
            return surplus;
        }else{
             System.out.printf("給油後の残り燃料は%fLです。",fuel);
             return 0;
        }
    }
}
