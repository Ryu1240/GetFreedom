public class task4_5_1 {
    //配列の要素の合計値を返すメソッド
    static int sumOf(int [] a){
        int sum = 0;
        for(int i = 0; i <a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] array1 = { 1, 2, 3 ,4 ,5 ,6 ,7};
        int[] array2 = { 1, 1, 1 ,2 ,2 ,2};
        System.out.println("array1の合計は"+sumOf(array1));
        System.out.println("array2の合計は"+sumOf(array2));
    }
}
