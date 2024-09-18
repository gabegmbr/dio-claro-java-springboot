package set.Pesquisa.ListaTarefas;

import java.util.Objects;

public class Tarefa {
    private String descricaoTarefa;
    private boolean tarefaConcluida;

    public Tarefa(String descricaoTarefa, boolean tarefaConcluida) {
        this.descricaoTarefa = descricaoTarefa;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricaoTarefa(), tarefa.getDescricaoTarefa());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricaoTarefa());
    }

    @Override
    public String toString() {
        String s = descricaoTarefa + " - Estado: " + tarefaConcluida;
        return s;
    }
}
