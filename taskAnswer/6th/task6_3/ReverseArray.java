import java.util.Scanner;
public class ReverseArray {
    static void swap(int[] a, int idx1,int idx2)throws NullPointerException{
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        try{
            for(int i = 0;i < a.length/2; i++)
                swap(a,i,a.length-i-1); //ArrayIndexOutOfBoundsExceptionの回避のため-1を追加
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.exit(1);
        }catch (NullPointerException e){
            System.out.println("要素の並びを反転しました。");
            e.printStackTrace();
            System.exit(1);
        }
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();

        int[] x = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("x["+ i +"]:");
            x[i] = stdIn.nextInt();
        }
        x = null; // 空参照にする
        reverse(x);

        for(int i = 0; i < num; i++){
            System.out.println("x["+ i +"]=" + x[i]);
        }
    }
}
