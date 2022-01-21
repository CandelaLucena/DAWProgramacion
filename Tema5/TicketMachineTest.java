public class TicketMachineTest {
    public static void main(String[] args) {
        TicketMachine t1;

        t1 = new TicketMachine(100);
        t1.prompt();
        t1.insertMoney(200);
        t1.printTicket();
        t1.showPrice();
        t1.empty();
        t1.showPrice();
    }
}
