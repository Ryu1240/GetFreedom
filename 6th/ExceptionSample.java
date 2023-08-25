import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionSample {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("x・yの加減乗除を行います");
        while(true){
            try{
                System.out.print("xの値:");
                int x = stdIn.nextInt(); 

                System.out.print("yの値:");
                int y = stdIn.nextInt(); 
                
                System.out.println("x + y =" + (x + y));
                System.out.println("x - y =" + (x - y));
                System.out.println("x * y =" + (x * y));
                System.out.println("x / y =" + (x / y));
                System.out.println("x % y =" + (x % y));
            }catch (InputMismatchException e){
                System.out.println("入力エラー発生。"+ e);
                String s = stdIn.next();
                System.out.println(s + "は無視しました。");
            }catch (ArithmeticException e){
                System.out.println("算術エラー発生。"+ e);
                System.out.println("エラーが出ないような数値をお願いします。");
            }finally{
                System.out.println("-----------");
                System.out.println("もう一度？(1…yes/0…no):");
                int retry = stdIn.nextInt();
                if(retry == 0) break;
                System.out.println("-----------");
            }
        }
    }
}
