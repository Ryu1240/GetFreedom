import java.util.Scanner;
class task3_4_1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください。");
        int x = stdIn.nextInt();
        if(x < 0)
            x = -x;
        System.out.println("入力した整数の絶対値は"+x+"です");
    }
}
