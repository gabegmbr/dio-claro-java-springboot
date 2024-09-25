package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private final Map<String, String> dicionarioMap = new HashMap<>();

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String significado = null;
        if(!dicionarioMap.isEmpty()){
            significado = dicionarioMap.get(palavra);
        }
        return significado;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("A", "Não é uma palavra.");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("A"));
        dicionario.removerPalavra("A");
        dicionario.exibirPalavras();
    }
}
