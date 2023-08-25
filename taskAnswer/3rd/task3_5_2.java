import java.util.Scanner;
class task3_5_2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("小さい方の値を入力してください。"); int min = stdIn.nextInt();
        System.out.print("おおきい方の値を入力してください。"); int max = stdIn.nextInt();

        for(int i = 0; i <= max; i++){
            if(min <= i)
            System.out.print(i+" ");//横に綺麗に表示したいので空白を追加しています。
        }
        System.out.println();
    }
}
