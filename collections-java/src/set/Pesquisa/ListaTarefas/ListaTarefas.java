package set.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet = new HashSet<>();

    public void adicionarTarefa(String descricao){
        tarefaSet.add((new Tarefa(descricao, false)));
    }

    public void removerTarefa(String descricao){
        Tarefa paraRemover = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                paraRemover = t;
            }
        }
        tarefaSet.remove(paraRemover);
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricaoTarefa().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(false);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println("Exibindo tarefas: ");
        System.out.println(tarefaSet);
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        System.out.println("Exibindo e retornando tarefas concluídas: ");
        System.out.println(tarefasConcluidas);
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        System.out.println("Exibindo e retornando tarefas pendentes: ");
        System.out.println(tarefasPendentes);
        return tarefasPendentes;
    }

    public void contarTarefas(){
        System.out.println(tarefaSet.size() == 1? tarefaSet.size() + " tarefa" : tarefaSet.size() + " tarefas");
    }

    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
        System.out.println("Todas as tarefas foram removidas.");
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.marcarTarefaPendente("Tarefa 1");
        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 3");
        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.exibirTarefas();

        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
