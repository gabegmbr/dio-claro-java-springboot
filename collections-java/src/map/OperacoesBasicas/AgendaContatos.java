package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, Integer> agendaContatoMap = new HashMap<>();
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }

    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 234567);
        agendaContatos.adicionarContato("Contato 2", 123456);
        agendaContatos.adicionarContato("Contato 3", 345678);
        agendaContatos.adicionarContato("Contato 4", 456789);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Contato 3");
        agendaContatos.exibirContatos();

        System.out.println("Número pesquisado: " + agendaContatos.pesquisarPorNome("Contato 1"));
    }

}
