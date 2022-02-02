/**
 * A class to model a simple email client. The client is run by a
 * particular user, and sends and retrieves mail via a particular server.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MailClient
{
    // The server used for sending and receiving.
    private MailServer server;
    // The user running this client.
    private String user;

    /**
     * Create a mail client run by user and attached to the given server.
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }

    /**
     * Return the next mail item (if any) for this user.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }

    /**
     * Print the next mail item (if any) for this user to the text 
     * terminal.
     */
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No new mail.");
        }
        else {
            item.print();
        }
    }

    /**
     * Send the given message to the given recipient via
     * the attached mail server.
     * @param to The intended recipient.
     * @param message The text of the message to be sent.
     */
    public void sendMailItem(String to, String message, String asunto)
    {
        // to puede ser "Julio;Pepe;..." o "Pepe"
        if(to.contains(";")){
            String[] arrayTo = to.split(";");
            for (int i = 0; i < arrayTo.length; i++) {
                MailItem item = new MailItem(user, arrayTo[i], message, asunto);
                server.post(item);
            }

        }else{
            MailItem item = new MailItem(user, to, message, asunto);
            server.post(item);
        }
        
    }

    public void forwardLastMailItem(String forwardTo){

        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No mail.");
        }
        else {
            //item = MailItem(user, to, message, asunto);
            //server.post(item);
        }
    }
}