import java.util.Scanner;
class VoidEx {
    static void putStars(int n){
        while(n-- > 0)
            System.out.print('*');
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左下直角の三角形を表示します。");
        System.out.println("段数:");
        int n = stdIn.nextInt();

        for(int i = 1; i <= n; i++){
            putStars(i);
            System.out.println();
        }
    }
}
