package set.OperacoesBasicas.Palavras;

import java.util.*;

public class ConjuntoPalavrasUnicas {
    Set<String> conjuntoPalavras = new HashSet<>();

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        for(String p : conjuntoPalavras){
            if(p.equalsIgnoreCase(palavra)){
                conjuntoPalavras.remove(p);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra){
        boolean palavraEncontrada = false;
        for(String p : conjuntoPalavras){
            if(p.equalsIgnoreCase(palavra)){
                palavraEncontrada = true;
                break;
            }
        }
        System.out.println(palavraEncontrada? "A palavra '" + palavra + "' está presente no conjunto." : "A palavra '" + palavra + "' não está presente no conjunto.");
    }

    public void exibirPalavrasUnicas(){
        System.out.printf("Conjunto de palavras únicas: ");
        System.out.println(conjuntoPalavras);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return conjuntoPalavras.equals(that.conjuntoPalavras);
    }

    @Override
    public int hashCode() {
        return conjuntoPalavras.hashCode();
    }

    @Override
    public String toString() {
        return "Conjunto Palavras Únicas: " +
                conjuntoPalavras;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        conjuntoPalavras.adicionarPalavra("Batata");
        conjuntoPalavras.adicionarPalavra("Batata");
        conjuntoPalavras.adicionarPalavra("Abacaxi");
        conjuntoPalavras.adicionarPalavra("Pneu de carro");
        conjuntoPalavras.adicionarPalavra("AK-47");
        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.verificarPalavra("AK-47");
        conjuntoPalavras.removerPalavra("AK-47");
        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.verificarPalavra("AK-47");
    }
}
