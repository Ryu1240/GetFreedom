import java.util.Scanner;
class task3_6_1{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a="); int a = stdIn.nextInt();
        System.out.print("b="); int b = stdIn.nextInt();
        System.out.print("c="); int c = stdIn.nextInt();

        int sum = a + b + c;
        System.out.println("sum:"+sum+",ave:"+sum/3.0);
    }
}
