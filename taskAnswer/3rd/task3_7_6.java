import java.util.Random;
import java.util.Scanner;
class task3_7_6 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        String[] JpWeek = {"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
        String[] EngWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int retry = 0;
        int preQuestion = -1;
        int question = -1;

        do{
            //前回出した問題と被らないようにする部分
            while(true){
                question = rand.nextInt(7);
                if(preQuestion != question){
                    preQuestion = question;
                    break;
                }
            }
            //出題部分
            System.out.println(JpWeek[question]+"は英語で？");
            //回答部分
            System.out.print("Ans:"); String ans = stdIn.next(); //文字入力なのでnextLine()

            if(ans == EngWeek[question]){
                System.out.println("正解です！");
            }else{
                System.out.println("残念！答えは"+EngWeek[question]+"でした。");
            }
            System.out.print("もう一度？1...Yes/ 0...No"); retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
