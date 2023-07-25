public class MailClient
{
    // O servidor usado para enviar e receber.
    private MailServer server;
    // O usuário executando este cliente.
    private String user;

    /**
     * Crie um cliente de e-mail executado pelo usuário e anexado ao servidor fornecido.
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }

    /**
     *Devolva o próximo item de correio (se houver) para este usuário.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }

    /**
     * Imprima o próximo item de correio (se houver) para este usuário no terminal de texto.
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
     * Envie a mensagem fornecida ao destinatário fornecido por meio do servidor de correio anexado. @param para O destinatário pretendido.
     @param message O texto da mensagem a ser enviada.
     */
    public void sendMailItem(String to, String message)
    {
        MailItem item = new MailItem(user, to, message);
        server.post(item);
    }
}
