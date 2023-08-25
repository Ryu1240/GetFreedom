import java.util.Scanner;
class task3_4_2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("２つの正の整数を入力してください。");
        System.out.print("a:");  int a = stdIn.nextInt();
        System.out.print("b:");  int b = stdIn.nextInt();

        if(b % a == 0){ // aがbの約数ならあまりは０
            System.out.printf("%dは%dの約数です",a,b);
        }else{
            System.out.printf("%dは%dの約数ではありません",a,b);
        }
    }
}
