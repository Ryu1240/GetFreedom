import java.util.Scanner;
public class task5_10_2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力してください:");String st = stdIn.nextLine();
        char[] chArray = st.toCharArray();
        int n = chArray.length;
        char[] InverseChArray = new char[n];
        for(int i = 0; i < n;i++){
            InverseChArray[i] = chArray[n-1-i];
        }
        String InverseSt = String.copyValueOf(InverseChArray);
        System.out.println("入寮された文字列の逆順は:"+InverseSt);
    }
}
