import java.util.Scanner;
class task3_5_6 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("正方形の段数を入力してください。"); 
        int n = stdIn.nextInt();

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                System.out.print("*");
            }   
            System.out.println();
        }
    }
}
