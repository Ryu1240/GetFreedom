import java.util.Scanner;
class task3_4_3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("正の整数を入力してください。"); int a = stdIn.nextInt();

        if( a <= 0){
            System.out.println("正でない値が入力されました");
        }else if(a % 10 == 0){ // aが10の倍数ならあまりは０
            System.out.printf("%dは10の倍数です",a);
        }else{
            System.out.printf("%dは10の倍数ではありません",a);
        }
    }
}
