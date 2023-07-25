import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MailServer
{
    // Armazenamento para o número arbitrário de itens de correio a serem armazenados no servidor.
    private List<MailItem> items;

    /**
     * Construir um servidor de correio.
     */
    public MailServer()
    {
        items = new ArrayList<>();
    }

    /**
     * Return quantos itens de correio estão esperando por um usuário..
     * @param O usuário a ser verificado
     * @return Quantos itens estão esperando.
     */
    public int howManyMailItems(String who)
    {
        int count = 0;
        for(MailItem item : items) {
            if(item.getTo().equals(who)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Retorna o próximo item de email para um usuário ou nulo se não houver nenhum.
     * @param O usuário que está solicitando seu próximo item.
     * @return O próximo item do usuário.
     */
    public MailItem getNextMailItem(String who)
    {
        Iterator<MailItem> it = items.iterator();
        while(it.hasNext()) {
            MailItem item = it.next();
            if(item.getTo().equals(who)) {
                it.remove();
                return item;
            }
        }
        return null;
    }

    /**
     *Adicione o item de correio fornecido à lista de mensagens.
     * @param O item de correio a ser armazenado no servidor.
     */
    public void post(MailItem item)
    {
        items.add(item);
    }
}
