public class TicketMachineTest {
    public static void main(String[] args) {
        TicketMachine t1;

        t1 = new TicketMachine();
        t1.setPrice(6);
        t1.showPrice();
        t1.getPrice();
        t1.empty();
    }
}
