import java.util.Scanner;
public class LabelContinue{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を加算します。");
        int total = 0;

    Outer:
        for(int i = 1; i <= 10;i++){
            System.out.println("■第" + i + "グループ");
            int sum = 0;
        Inner:
            for(int j = 0; j < 5; j++){
                System.out.print("整数:");
                int t =stdIn.nextInt();
                if (t == 99999)
                    break Outer;
                else if(t == 88888)
                    continue Inner;
                sum += t;
            }
            System.out.println("小計は"+ sum +"です。\n");
            total += sum;
        }
        System.out.println("\n合計は" + total + "です。");
    }
}