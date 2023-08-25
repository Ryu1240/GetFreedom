import java.util.Scanner;
class HelloNextLIne {
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("お名前は:");
        String s = stdIn.nextLine();

        System.out.println("こんにちは"+ s + "さん。");
    }
}
