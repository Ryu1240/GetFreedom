import java.util.Scanner;//A
public class SystemIn {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in); //B
        System.out.println("x・yの加減乗除を行います");
        System.out.print("x=");
        double x = stdIn.nextInt(); //C
        System.out.print("y=");
        int y = stdIn.nextInt(); //C

        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));
    }
}
