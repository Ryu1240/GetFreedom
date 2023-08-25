public class task3_7_5 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = new int[7];

        //コピー前の配列の確認
        int i = 0;
        for(int n : a){
            System.out.println("a["+ i++ +"]" + n);
        }

        System.out.println();
        i = 0;
        for( int n : b){
            System.out.println("b["+ i++ +"]" + n);
        }
        System.out.println();

        //逆順にコピー
        for(int j = 0; j < a.length; j++){
            b[j] = a [a.length - 1 - j];
        }

        //コピー後の配列を表示
        System.out.println("change");
        i = 0;
        for( int n : a){
            System.out.println("a["+ i++ +"]" + n);
        }
        i = 0;
        for( int n : b){
            System.out.println("b["+ i++ +"]" + n);
        }
    }
}
