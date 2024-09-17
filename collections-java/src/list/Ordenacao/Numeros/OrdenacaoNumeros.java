package list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listaNumeros = new ArrayList<>();

    public void adicionarNumero(int n){
        listaNumeros.add(n);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
        if(!listaAscendente.isEmpty()){
            Collections.sort(listaAscendente);
        }
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDescedente = new ArrayList<>(listaNumeros);
        if(!listaDescedente.isEmpty()){
            listaDescedente.sort(Collections.reverseOrder());
        }
        return listaDescedente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();
        listaNumeros.adicionarNumero(4);
        listaNumeros.adicionarNumero(1);
        listaNumeros.adicionarNumero(6);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(7);
        listaNumeros.adicionarNumero(2);
        listaNumeros.adicionarNumero(8);
        listaNumeros.adicionarNumero(5);
        System.out.println(listaNumeros);
        List<Integer> listaAscendente = listaNumeros.ordenarAscendente();
        System.out.println(listaAscendente);
        List<Integer> listaDescendente = listaNumeros.ordenarDescendente();
        System.out.println(listaDescendente);
    }
}
