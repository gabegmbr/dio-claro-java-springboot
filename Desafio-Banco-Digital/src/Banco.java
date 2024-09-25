import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final List<Conta> contasList = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta){
        contasList.add(conta);
    }

    public void exibirContas(){
        System.out.println(contasList);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
