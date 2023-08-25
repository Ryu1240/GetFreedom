import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("手を選べ（0…グー/1…チョキ/2…パー）:");
        int hand = stdIn.nextInt();
        switch(hand+1){
        case 1: System.out.println("グー"); break;
        case 2: System.out.println("チョキ"); break;
        case 3: System.out.println("パー"); break;
        }
    }
}
