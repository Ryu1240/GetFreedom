import java.util.Scanner;
class task3_3_2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("底辺:"); int a = stdIn.nextInt();
        System.out.print("高さ:"); int b = stdIn.nextInt();
        
        System.out.print("面積:"+ (a*b/2));
    }
}
