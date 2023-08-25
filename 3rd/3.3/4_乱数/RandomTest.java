import java.util.Random;
public class RandomTest{
    public static void main(String[] args){
        Random rand = new Random();//B

        int lucky = rand.nextInt(0,10);//C
        
        System.out.println("今日のラッキナンバーは"+ lucky +"です");
    }
}
