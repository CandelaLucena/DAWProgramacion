public class MailTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient cliente = new MailClient(server, "Candela");

        System.out.println(server.howManyMailItems("Candela"));
        cliente.sendMailItem("Candela", "Hola", "Buenos dias");
        System.out.println(server.howManyMailItems("Candela"));

        cliente.sendMailItem("Candela;Pepe", "Hola", "Buenos dias");
        System.out.println(server.howManyMailItems("Pepe"));


    }
}
