package list.Pesquisa.Numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros = new ArrayList<>();

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int n : listaNumeros){
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = listaNumeros.getFirst();
        for(int n : listaNumeros){
            if(n > maiorNumero) maiorNumero = n;
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = listaNumeros.getFirst();
        for(int n : listaNumeros){
            if(n < menorNumero) menorNumero = n;
        }
        return menorNumero;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(16);
        somaNumeros.exibirNumeros();
        int maiorNumero = somaNumeros.encontrarMaiorNumero();
        System.out.println("Maior número da lista: " + maiorNumero);
        int menorNumero = somaNumeros.encontrarMenorNumero();
        System.out.println("Menor número da lista: " + menorNumero);
        int soma = somaNumeros.calcularSoma();
        System.out.println("Soma da lista: " + soma);
    }
}
