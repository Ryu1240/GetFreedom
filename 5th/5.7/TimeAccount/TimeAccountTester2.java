public class TimeAccountTester2 {
    static int compBalance(Account a, Account b){
        if(a.getBalance() > b.getBalance() ) //aの方が多い
            return 1;
        else if(a.getBalance() < b.getBalance() ) //bの方が多い
            return -1;
        return 0; //aとbは同じ
    }
    public static void main(String[] args){
        Account adachi = new Account("足立幸一","123456",1000);
        TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);

        switch (compBalance(adachi, nakata)){
            case 0  : System.out.println("足立くんと仲田くんの預金座高は同じ"); break;
            case 1  : System.out.println("足立くんの方が預金座高は多い"); break;
            case -1 : System.out.println("仲田くんの方が預金座高は多い"); break;
        }
    }
}
