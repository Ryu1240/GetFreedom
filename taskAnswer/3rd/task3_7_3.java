import java.util.Scanner;
class task3_7_3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:"); int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
        System.out.print("a["+i+"]="); 
        a[i] = stdIn.nextInt();
        }
        
        
        for(int i = 0; i < a.length; i++)
            if(i == 0)
                System.out.print("a={"+a[i] + ",");
            else if((i+1) == a.length)
                System.out.println(a[i]+"}");
            else
                System.out.print(a[i]+",");
    }
}
