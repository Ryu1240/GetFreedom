//こちらのソースコードはテスターを用意していません。
public class TimeAccount {
    private String name;
    private String no;
    private long balance;
    private long timeBalance;
    //コンストラクタ
    TimeAccount(String n, String num,long z, long timeBalance){
        name = n;
        no = num;
        balance = z;
        this.timeBalance = timeBalance;
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
    public long getTimeBalance(){
        return timeBalance;
    }

    // k円預ける
    public void deposit(long k){
        balance += k;
    }
    // k円おろす
    public void withdraw(long k){
        balance -= k;
    }
    //定期預金を解約する
    void cancel(){
        balance += timeBalance;
        timeBalance = 0;
    }

}
