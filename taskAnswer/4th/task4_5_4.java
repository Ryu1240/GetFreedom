public class task4_5_4 {
    static void arvRmvN(int[] a ,int idx ,int n){
        for(int i = idx; i < a.length - n; i++){
            a[i] = a[i+n];
        }
    }
    public static void main(String[] args){
        int[] array1 = { 1, 3, 4 ,7 ,9 ,11};
        System.out.println("削除前の配列の要素の確認");
        for(int i = 0; i < array1.length; i++){
            System.out.println("array1["+ i +"]=" + array1[i]);
        }
        arvRmvN(array1,1,3);

        System.out.println();
        System.out.println("削除後の配列要素を表示");
        for(int i = 0; i < array1.length; i++){
            System.out.println("array1["+ i +"]=" + array1[i]);
        }
    }
}