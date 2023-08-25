public class StringFormat {
    public static void main(String[] args){
        String s1 = String.format("%5d",123);
        String s2 = String.format("%9.3fd",123.45);
        
        System.out.println("s1 = "+ s1);
        System.out.println("s2 = "+ s2);
    }
}
