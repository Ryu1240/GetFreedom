public class ExId {
    static int counter = 0;
    static int n = 1;
    private int id;
    //インスタンス初期化子を利用することで今後コンストラクタが増えても安心
    {
        counter += n;
    }
    public ExId(){
        id = counter;4
    }

    public int getId(){
        return id;
    }
    public static int getMaxId(){
        return counter;
    }

    public static int getN(){
        return n;
    }

    public static void setN(int n){
        ExId.n = n;
    }
}