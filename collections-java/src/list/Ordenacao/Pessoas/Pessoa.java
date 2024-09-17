package list.Ordenacao.Pessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, o.getIdade());
    }

    @Override
    public String toString() {
        String s = "\r\n" + "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
        return s;
    }
}

class ComparadorIdade implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
}
