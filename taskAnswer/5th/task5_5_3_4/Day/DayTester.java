import java.util.Scanner;
public class DayTester {
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);
        int y,m,d;

        System.out.println("日付を入力せよ:");
        System.out.print("年:"); y = stdIn.nextInt();
        System.out.print("月:"); m = stdIn.nextInt();
        System.out.print("日:"); d = stdIn.nextInt();

        Day a = new Day(y,m,d);
        System.out.println(a.toString());
        System.out.println("年内の経過日数:"+a.elapsedDays());
        System.out.println("年内の残り日数:"+a.remainDays());

    }
}
