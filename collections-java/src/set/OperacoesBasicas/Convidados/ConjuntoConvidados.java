package set.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 231);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
        conjuntoConvidados.exibirConvidados();
    }

}
