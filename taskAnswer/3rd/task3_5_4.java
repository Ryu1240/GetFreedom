import java.util.Scanner;
class task3_5_4 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("正の値を入力してください。"); 
        int n = stdIn.nextInt();

        for(int i = n; 0 <= i; i--){
            System.out.println(i);
        }
    }
}
