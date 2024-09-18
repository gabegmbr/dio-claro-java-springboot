package set.Pesquisa.Agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet = new HashSet<>();

    public void adicionarContato(String nome, int numero){
        contatoSet.add((new Contato(nome, numero)));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNomeContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("ABC", 40028922);
        agendaContatos.adicionarContato("ABC", 44123512);
        agendaContatos.adicionarContato("BBC", 44123512);
        agendaContatos.exibirContatos();
        agendaContatos.atualizarNomeContato("ABC", 1345678);
        agendaContatos.exibirContatos();
    }

}
