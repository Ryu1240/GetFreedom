public class Account{
    private static int counter = 0;

    private String name;    //口座名義
    private String no;      //口座番号
    private long balance;   //預金残高
    private int id;

    // コンストラクタ
    public Account(String n, String num,long z){
        name    = n;
        no      = num;
        balance = z;
        id = ++counter;
    }
    // 口座名義を調べる
    public String getName(){
        return name;
    }
    //　口座番号を調べる
    public String getNo(){
        return no;
    }
    //　預金残高を調べる
    public long getBalance(){
        return balance;
    }
    //識別番号を取得
    public int getId(){
        return id;
    }

    // k円預ける
    public void deposit(long k){
        balance += k;
    }
    // k円おろす
    public void withdraw(long k){
        balance -= k;
    }
}
