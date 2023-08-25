import java.util.Scanner;

class task4_6_1 {
    static int min(int a,int b){

    }

    static int min(int a,int b,int c){
        
    }

    static int min(int[] a){
        int min = a[0];
        //配列aの中の最小値を求める処理

        return min;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("int:xの値:"); int a = stdIn.nextInt();
        System.out.print("long:bの値:"); long b = stdIn.nextLong();
        System.out.print("float:cの値:"); float c = stdIn.nextFloat();

        System.out.println("aの絶対値は"+absolute(a));
        System.out.println("bの絶対値は"+absolute(b));
    }
}

