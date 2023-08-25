import java.util.Scanner;
public class HurmanPlayer extends Player{

    HurmanPlayer(String playerName){
        setName(playerName);
    }

    @Override public void selectHand(){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("手を選んでください:1…グー,2…チョキ,3…パー"); 
        int a = stdIn.nextInt();
        setHand(a);
    }

}
