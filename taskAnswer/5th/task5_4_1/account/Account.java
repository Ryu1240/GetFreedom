class Account{
    private String name;    //口座名義
    private String no;      //口座番号
    private long balance;   //預金残高
    //追加位
    private Day date;
    // コンストラクタ(thisを使用する形に変更)
    Account(String name, String no,long balance,int year,int month,int day){
        this.name    = name;
        this.no      = no;
        this.balance = balance;
        this.date = new Day(year,month,day);
    }
    // 口座名義を調べる
    String getName(){
        return name;
    }
    //　口座番号を調べる
    String getNo(){
        return no;
    }
    //　預金残高を調べる
    long getBalance(){
        return balance;
    }
    // k円預ける
    void deposit(long k){
        balance += k;
    }
    // k円おろす
    void withdraw(long k){
        balance -= k;
    }
    public String toString(){
        return String.format("口座名義:%s \n 口座番号:%s \n 預金残高:%d \n 口座開設日:%s \n",name,no,balance,date.toString());
    }
}