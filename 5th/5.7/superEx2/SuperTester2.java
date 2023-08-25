class Base {
    protected int x;

    Base() { this.x = 0;}
    Base(int x) {this.x = x;}
    void print(){ System.out.println("Base.x =" + x);}
}

//サブクラス
class Derived extends Base {
    int x;
    Derived(int x1,int x2){super.x = x1; this.x = x2;}

    //スーパークラスのメソッドを上書き(オーバーライド)
    void print(){super.print(); System.out.println("Derived.x =" + x);}
}

public class SuperTester2 {
    public static void main(String[] args){
        Base a = new Base(10);
        System.out.println("--a--"); a.print();

        Derived b = new Derived(20,30);
        System.out.println("-- b --"); b.print();
    }
}