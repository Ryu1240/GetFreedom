import java.util.Scanner;
class task3_5_3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("表示する記号の個数を入力してください。"); 
        int n = stdIn.nextInt();

        for(int i = 0; i < n; i++){
            if((i%2) == 0)
                System.out.print("*");//iが偶数の時に*を表示
            else
                System.out.print("+");
        }
        System.out.println();
    }
}
