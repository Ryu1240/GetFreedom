import java.util.Scanner;
public class DayComparator2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int y, m, d;

        System.out.println("日付１を入力せよ。");
        System.out.print("年:"); y = stdIn.nextInt();
        System.out.print("月:"); m = stdIn.nextInt();
        System.out.print("日:"); d = stdIn.nextInt();
        Day day1 = new Day(y,m,d);

        System.out.println("日付２を入力せよ。");
        System.out.print("年:"); y = stdIn.nextInt();
        System.out.print("月:"); m = stdIn.nextInt();
        System.out.print("日:"); d = stdIn.nextInt();
        Day day2 = new Day(y,m,d);

        if(day1.getYear() == day2.getYear() 
        && day1.getMonth() == day2.getMonth() 
        && day1.getDate() == day2.getDate())
            System.out.println("等しいです。");
        else
            System.out.println("等しくありません。");
        }
}
