import java.util.Random;
import java.util.Scanner;

public class task4_3_5 {
    static Scanner stdIn = new Scanner(System.in);
    static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("もう一度？<Yes…1/No…0>:");
            cont = stdIn.nextInt();
        }while (cont != 0 && cont != 1);
        return cont == 1;
    }

    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("暗算力トレーニング");
        do {
            int x =rand.nextInt(900) + 100;
            int y =rand.nextInt(900) + 100;
            int z =rand.nextInt(900) + 100;
            int r = rand.nextInt(4);
        Out:
            while(true){
                int k;
                switch(r){
                    case 0: System.out.print(x + "+" + y + "+" + z + "=");
                            k = stdIn.nextInt();
                            if(k == x + y + z)
                                break Out;
                            System.out.println("違います！");break;
                    case 1:System.out.print(x + "+" + y + "-" + z + "=");
                            k = stdIn.nextInt();
                            if(k == x + y - z)
                                break Out;
                            System.out.println("違います！"); break;
                    case 2:System.out.print(x + "-" + y + "+" + z + "=");
                            k = stdIn.nextInt();
                            if(k == x - y + z)
                                break Out;
                            System.out.println("違います！"); break;
                    case 3:System.out.print(x + "-" + y + "-" + z + "=");
                            k = stdIn.nextInt();
                            if(k == x - y - z)
                                break Out;
                            System.out.println("違います！"); break;
                }
            }
        }while (confirmRetry());
    }
}

