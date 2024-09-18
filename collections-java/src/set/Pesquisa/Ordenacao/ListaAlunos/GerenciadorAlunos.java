package set.Pesquisa.Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos = new HashSet<>();

    public void adicionarAlunos(String nome, long matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        for(Aluno a : listaAlunos){
            if(a.getMatricula() == matricula){
                alunoRemover = a;
                break;
            }
        }
        listaAlunos.remove(alunoRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> listaAlunosPorNome = new TreeSet<>(new ComparatorNome());
        listaAlunosPorNome.addAll(listaAlunos);
        return listaAlunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> listaAlunosPorNota = new TreeSet<>(new ComparatorNota());
        listaAlunosPorNota.addAll(listaAlunos);
        return listaAlunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(listaAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAlunos("Aluno 2", 10000, 5.6);
        gerenciadorAlunos.adicionarAlunos("Aluno 1", 20000, 0.1);
        gerenciadorAlunos.adicionarAlunos("Aluno 3", 30000, 9.9);
        gerenciadorAlunos.adicionarAlunos("Aluno 4", 40000, 6.0);
        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        gerenciadorAlunos.removerAluno(20000);
        gerenciadorAlunos.exibirAlunos();
    }

}

