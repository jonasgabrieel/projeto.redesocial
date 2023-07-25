public class MailItem
{
    // O remetente do item.
    private String from;
    //O destinatário pretendido
    private String to;
    // O texto da mensagem
    private String message;

    /**
     *Crie um item de correio do remetente para o destinatário especificado,
     * contendo a mensagem fornecida
     * @param do remetente deste item.
     * @param para O destinatário pretendido deste item.
     * @param message O texto da mensagem a ser enviada.
     */
    public MailItem(String from, String to, String message)
    {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    /**
     * @return O remetente desta mensagem.
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * @return O destinatário pretendido desta mensagem.
     */
    public String getTo()
    {
        return to;
    }

    /**
     * @return O Texto da mensagem
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Imprima esta mensagem de correio para o terminal de texto.
     */
    public void print()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
    }
}
