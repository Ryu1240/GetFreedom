public class task4_5_3 {
    static void arvRmv(int[] a ,int idx){
        for(int i = idx; i <a.length - 1; i++){
            a[i] = a[i+1];
        }
    }
    public static void main(String[] args){
        int[] array1 = { 1, 3, 4 ,7 ,9 ,11};
        System.out.println("削除前の配列の要素の確認");
        for(int i = 0; i < array1.length; i++){
            System.out.println("array1["+ i +"]=" + array1[i]);
        }
        arvRmv(array1,2);

        System.out.println();
        System.out.println("削除後の配列要素を表示");
        for(int i = 0; i < array1.length; i++){
            System.out.println("array1["+ i +"]=" + array1[i]);
        }
    }
}