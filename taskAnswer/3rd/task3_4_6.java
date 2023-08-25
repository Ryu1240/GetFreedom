import java.util.Scanner;
class task3_4_6 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("3つの整数を入力してください。");
        System.out.print("a:");  int a = stdIn.nextInt();
        System.out.print("b:");  int b = stdIn.nextInt();
        System.out.print("c:");  int c = stdIn.nextInt();

        if(a < b && a < c){ 
            System.out.printf("%最小値は%dです",a);
        }else if(b < a && b < c){ 
            System.out.printf("%最小値は%dです",b);
        }else{
            System.out.printf("%最小値は%dです",c);
        }
    }
}
