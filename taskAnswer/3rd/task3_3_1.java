import java.util.Scanner;
class task3_3_1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a:"); int a = stdIn.nextInt();
        System.out.print("b:"); int b = stdIn.nextInt();

        
        System.out.print("和:"+ (a+b));
        System.out.print("平均:"+ ((a+b)/2));
    }
}
