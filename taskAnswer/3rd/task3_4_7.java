import java.util.Random;
class task3_4_7 {
    public static void main(String[] args){
        Random rand = new Random();
        
        int random = rand.nextInt(0,3);

        switch(random){
            case 0: System.out.println("グー"); break;
            case 1: System.out.println("チョキ"); break;
            case 2: System.out.println("パー"); break;
        }
    }
}
