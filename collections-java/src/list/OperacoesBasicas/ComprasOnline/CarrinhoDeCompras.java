package list.OperacoesBasicas.ComprasOnline;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        if(!carrinho.isEmpty()){
            for(Item i: carrinho){
                if(i.getName().equalsIgnoreCase(nome)){
                    carrinho.remove(i);
                    break;
                }
            }
        }
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Batata", 7.89, 4);
        carrinhoDeCompras.adicionarItem("Batata Doce Premium", 99.75, 1);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Batata Doce Premium");
        carrinhoDeCompras.exibirItens();
    }
}
