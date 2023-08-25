public class PlayerTester {
    public static void main(String[] args){
        HurmanPlayer human = new HurmanPlayer("ryu");
        CPUPlayer cpu = new CPUPlayer();

        human.selectHand();
        cpu.selectHand();

        System.out.println(human.toString());
        System.out.println(cpu.toString());
        human.judge(cpu);
    }
}
