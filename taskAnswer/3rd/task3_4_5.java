import java.util.Scanner;
class task3_4_5 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("２つの整数を入力してください。");
        System.out.print("a:");  int a = stdIn.nextInt();
        System.out.print("b:");  int b = stdIn.nextInt();

        if(a > b){ // aがbの約数ならあまりは０
            System.out.printf("%dと%dのうち大きい方は%dです",a,b,a);
        }else{
            System.out.printf("%dと%dのうち大きい方は%dです",a,b,b);
        }
    }
}
