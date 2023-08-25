public class task5_10_4{
    public static void main(String[] args){
        final double PI = 3.1416;
        double r = Double.parseDouble(args[0]);
        System.out.println("半径:"+r);

        System.out.println("円周の長さ:"+(2*PI*r));
        System.out.println("面積:"+(2*PI*r*r));
    }
}
