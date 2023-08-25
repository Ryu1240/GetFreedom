import java.util.Scanner;
public class task3_7_7 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int stnNum = 6;
        int sjtNum = 2;
        int[][] a = new int[sjtNum][stnNum];
        for(int i = 0; i < sjtNum; i++){
            for(int j = 0;j < stnNum; j++){
                if(i == 0)
                    System.out.print((j+1)+"番の学生の国語の点数:");
                else
                    System.out.print((j+1)+"番の学生の数学の点数:");
                a[i][j] = stdIn.nextInt();
            }
        }
        
        //合計の算出部
        int[] sjtsum = new int[sjtNum];//教科ごとの合計値を格納
        int[] stnsum = new int[stnNum];//学生ごとの合計値を格納
        for(int i = 0; i < sjtNum; i++){
            for(int j = 0;j < stnNum; j++){
                sjtsum[i] += a[i][j]; 
                stnsum[j] += a[i][j]; 
            }
        }
        //平均点出力
        System.out.println("国語の平均点:"+ sjtsum[0]/stnNum);
        System.out.println("数学の平均点:"+ sjtsum[1]/stnNum);
        for(int j = 0;j < stnNum; j++){
            System.out.println((j+1)+"番目の学生の平均点:"+ stnsum[j]/sjtNum);
        }


    }
}
