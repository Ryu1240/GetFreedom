import java.util.Random;
class task3_3_3_2 {
    public static void main(String[] args){
        Random rand = new Random();
        
        int random = rand.nextInt(1,10) - 10;
        System.out.println("乱数は"+random);
    }
}
