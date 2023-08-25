import java.util.Scanner;
public class CarTester {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("車のデータを入力せよ。");
        System.out.print("名前:");         String name = stdIn.next();
        System.out.print("車幅:");         int width = stdIn.nextInt();
        System.out.print("高さ:");         int height = stdIn.nextInt();
        System.out.print("長さ:");         int length = stdIn.nextInt();
        System.out.print("燃料:");         double fuel = stdIn.nextDouble();
        System.out.print("購入年:");         int y = stdIn.nextInt();
        System.out.print("購入月:");         int m = stdIn.nextInt();
        System.out.print("購入日:");         int d = stdIn.nextInt();

        ExtendedCar car = new ExtendedCar(name,width,height,length,fuel,new Day(y,m,d));

        car.putSpec();
        System.out.println("購入日：" + car.getPurchaseDay());

        car.move(5,5);
        System.out.println("総移動距離:"+ car.getTotalRun());
        car.move(8,8);
        System.out.println("総移動距離:"+ car.getTotalRun());

    }
}
