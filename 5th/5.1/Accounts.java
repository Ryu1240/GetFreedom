class Accounts {
    public static void main(String[]args){
        String adachiAccountName    = "足立太郎";     //足立君の口座名義
        String adachiAccountNo      = "123456";     //足立君の口座番号
        long   adachiAccountBalance = 1000;         //足立君の口座番号

        String nakataAccountName    = "中田花子";    //中田さんの口座名義
        String nakataAccountNo      = "654321";     //中田さんの口座番号
        long   nakataAccountBalance = 200;         //中田さんの口座番号

        adachiAccountBalance -= 200; //足立君が200円おろす
        nakataAccountBalance += 100;//中田君が100円預ける

        System.out.println("■足立君の口座");
        System.out.println(" 口座名義:"+ adachiAccountName);
        System.out.println(" 口座番号:"+ adachiAccountNo);
        System.out.println(" 預金残高:"+ adachiAccountBalance);
        System.out.println("■中田さんの口座");
        System.out.println(" 口座名義:"+ nakataAccountName);
        System.out.println(" 口座番号:"+ nakataAccountNo);
        System.out.println(" 預金残高:"+ nakataAccountBalance);
    }    
}
