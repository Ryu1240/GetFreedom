import java.util.Scanner;
public class HurmanArrayTester {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        //生成時に初期化するパターン
        Hurman[] a = {
            new Hurman("Tarou",166.7,60.6,19),
            new Hurman("Akari",156.5,56.6,18)
        };
        for(int i = 0; i < a.length; i++){
            System.out.printf("a[%d]の情報を表示します。\n",i);
            a[0].printInfo();
        }

        //生成後に初期化するパターン
        Hurman[] b = new Hurman[2];
        for(int i = 0; i < b.length; i++){
            System.out.print("name:"); String n = stdIn.next();
            System.out.print("height:"); double h = stdIn.nextDouble();
            System.out.print("weight:"); double w = stdIn.nextDouble();
            System.out.print("age:"); int age = stdIn.nextInt();
            b[i] = new Hurman(n,h,w,age);
        }
        for(int i = 0; i < b.length; i++){
            System.out.printf("b[%d]の情報を表示します。\n",i);
            b[i].printInfo();
        }
    }
    
}
