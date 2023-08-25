abstract public class Player {
    private int hand;
    private String name;
    private final String[] h ={"グー","チョキ","パー"};
    
    abstract public void selectHand();

    public String toString(){
        return String.format("%sが出した手は%s",name,h[hand-1]);
    }

    public void setHand(int hand){
        this.hand = hand;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

    public void judge(Player p){
        int j = p.getHand() - hand;
        if(j == 1 || j == -2){
            System.out.println(name + "の勝ちです。");
        }else if ( j == 0 ){
            System.out.println("あいこです。");
            
        }else{
            System.out.println(p.getName()+"の勝ちです。");
        }
    }
}
