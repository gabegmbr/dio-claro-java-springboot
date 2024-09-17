package list.Ordenacao.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        if(!listaPessoas.isEmpty()){
            Collections.sort(pessoasPorIdade);
        }
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        if(!listaPessoas.isEmpty()){
            pessoasPorAltura.sort(new ComparadorIdade());
        }
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas lista = new OrdenacaoPessoas();
        lista.adicionarPessoa("A", 18, 1.75);
        lista.adicionarPessoa("B", 32, 2.99);
        lista.adicionarPessoa("C", 67, 1.50);
        lista.adicionarPessoa("D", 3, 0.75);
        List<Pessoa> idade = lista.ordenarPorIdade();
        System.out.println("Ordenação por idade: " + idade);
        List<Pessoa> altura = lista.ordenarPorAltura();
        System.out.println("Ordenação por altura: " + altura);
    }

}
