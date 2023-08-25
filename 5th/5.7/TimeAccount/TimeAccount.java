public class TimeAccount extends Account{
    private long timeBalance;

    //コンストラクタ
    TimeAccount(String name,String no,long balance, long timeBalance){   
        super(name,no,balance);
        this.timeBalance = timeBalance;
    }
    //定期預金残高を調べる
    long getTimeBalance(){
        return timeBalance;
    }

    void cancel(){
        deposit(timeBalance);
        timeBalance = 0;
    }
}
