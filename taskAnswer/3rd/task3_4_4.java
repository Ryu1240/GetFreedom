import java.util.Scanner;
class task3_4_4 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("点数を入力してください。"); int a = stdIn.nextInt();

        if( a < 60){
            System.out.println("あなたの成績は不可です。");
        }else if(a < 70){
            System.out.println("あなたの成績は可です。");
        }else if(a < 80){
            System.out.println("あなたの成績は良です。");
        }else if(a <= 100){
            System.out.println("あなたの成績は優です。");
        }
    }
}
