//銀行口座クラス【第１版】とそれをテストするクラス

//銀行口座クラス【第１版】
class Account{
    String name;    //口座名義
    String no;      //口座番号
    long balance;   //預金残高
    
}
////銀行口座クラス【第１版】をテストするクラス
class AccountTester{    
    public static void main(String[] args){
        Account adachi = new Account();
        Account nakata = new Account();

        adachi.name ="足立太郎";     //足立君の口座名義
        adachi.no      = "123456";     //足立君の口座番号
        adachi.balance = 1000;         //足立君の口座番号

        nakata.name    = "中田花子";    //中田さんの口座名義
        nakata.no      = "654321";     //中田さんの口座番号
        nakata.balance = 200;         //中田さんの口座番号

        adachi.balance -= 200; //足立君が200円おろす
        nakata.balance += 100;//中田君が100円預ける

        System.out.println("■足立君の口座");
        System.out.println(" 口座名義:"+ adachi.name);
        System.out.println(" 口座番号:"+ adachi.no);
        System.out.println(" 預金残高:"+ adachi.balance);
        System.out.println("■中田さんの口座");
        System.out.println(" 口座名義:"+ nakata.name);
        System.out.println(" 口座番号:"+ nakata.no);
        System.out.println(" 預金残高:"+ nakata.balance);
    }
}
