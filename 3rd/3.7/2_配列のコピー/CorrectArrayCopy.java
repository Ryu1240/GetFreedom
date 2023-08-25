public class CorrectArrayCopy{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {6,5,4,3,2};

        System.out.print("a= ");
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
        System.out.print("b= ");
        for(int i : b)
            System.out.print(i + " ");
        System.out.println();

        for(int i = 0; i < a.length; i++)
            b[i] = a[i];
         
        a[0] = 10;

        System.out.println("aをbに代入しました。");

        System.out.print("a= ");
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
        System.out.print("b= ");
        for(int i : b)
            System.out.print(i + " ");
        System.out.println();
    }
}