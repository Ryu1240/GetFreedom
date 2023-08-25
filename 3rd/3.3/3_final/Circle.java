import java.util.Scanner;
public class Circle{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
    
        System.out.print("半径:");
        //半径の入力
        double r = stdIn.nextDouble();

        System.out.println("円周の長さ:"+(2*3.14*r));
        System.out.println("面積:"+(2*3.14*r*r));
    }
}

