import java.util.Scanner;
public class ArithInt {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x・yの加減乗除を行います");

        System.out.print("xの値:");
        int x = stdIn.nextInt(); 

        System.out.print("yの値:");
        int y = stdIn.nextInt(); 
        
        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));
    }
}
