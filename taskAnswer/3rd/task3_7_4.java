import java.util.Scanner;
public class task3_7_4 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("人数は？："); int n = stdIn.nextInt();
        int[] score = new int[n];

        for(int i = 0; i < score.length; i++){
            System.out.print("score["+ i + "]:"); 
            score[i] = stdIn.nextInt();
        }
        int max = 0;
        int min = 100;
        int sum = 0;
        for(int i = 0; i < score.length; i++){
            if(score[i] > max)
                max = score[i];
            if(score[i]<min)
                min = score[i];
            sum += score[i];
        }
        System.out.println("平均点：" + sum/n);
        System.out.println("合計点：" + sum);
        System.out.println("最高点：" + max);
        System.out.println("最小点：" + min);
    }
}
