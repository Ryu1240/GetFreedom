public class task4_5_5 {
    static int[] arrayClone(int[] a ){
        int[] x = new int[a.length];
        for(int i = 0; i < a.length; i++){
            x[i] = a[i];
        }
        return x;
    }

    public static void main(String[] args){
        int[] array = { 1, 3, 4 ,7 ,9 ,11};
        int[] cloneArray = arrayClone(array);
        System.out.println("複製後の配列要素を表示");
        for(int i = 0; i < cloneArray.length; i++){
            System.out.println("cloneArray["+ i +"]=" + cloneArray[i]);
        }
    }
}
