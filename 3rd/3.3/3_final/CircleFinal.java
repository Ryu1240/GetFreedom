import java.util.Scanner;
public class CircleFinal{
    public static void main(String[] args){
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("半径:");
        //半径の入力
        double r = stdIn.nextDouble();
        
        System.out.println("円周の長さ:"+(2*PI*r));
        System.out.println("面積:"+(2*PI*r*r));
    }
}