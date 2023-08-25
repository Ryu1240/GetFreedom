public class ExIdTester {
    public static void main(String[] args){
        ExId a = new ExId();
        System.out.println("1つインスタンスを生成後:"+ExId.getMaxId());
        ExId b = new ExId();
        System.out.println("2つインスタンスを生成後:"+ExId.getMaxId());
        ExId c = new ExId();
        System.out.println("3つインスタンスを生成後:"+ExId.getMaxId());

        System.out.println("nを4に変更前:n ="+ExId.getN());
        ExId.setN(4);
        System.out.println("nを4に変更後:n ="+ExId.getN());

        ExId d = new ExId();
        System.out.println("4つインスタンスを生成後:"+ExId.getMaxId());
        ExId e = new ExId();
        System.out.println("5つインスタンスを生成後:"+ExId.getMaxId());
        ExId f = new ExId();
        System.out.println("6つインスタンスを生成後:"+ExId.getMaxId());



    }
}
