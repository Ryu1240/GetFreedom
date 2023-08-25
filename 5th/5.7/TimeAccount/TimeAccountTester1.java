public class TimeAccountTester1 {
    public static void main(String[] args){
        Account adachi = new Account("足立幸一","123456",1000);
        TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);

        Account x; // クラス変数は…
        x = adachi; //自分自身の型のインスタンスを参照できる
        x = nakata; //下位クラス型のインスタンスも参照できる

        System.out.println("xの預金残高:" + x.getBalance());

        TimeAccount y; // クラス変数は…
        //y = adachi;   //上位クラス型のインスタンスは参照できない
        y = nakata;     //自分自身の型のインスタンスを参照できる

        System.out.println("yの預金残高:" + y.getBalance());
        System.out.println("yの定期預金残高:" + y.getTimeBalance());
    }
}
