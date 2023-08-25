import java.util.Random;
public class CPUPlayer extends Player{
    static int counter;
    CPUPlayer(){
        setName("CPU-"+ counter++);
    }

    CPUPlayer(String CPUName){
        setName(CPUName);
    }

    @Override public void selectHand(){
        Random rand = new Random();
        int a = rand.nextInt(3);
        setHand(a+1);
    }

}
