public class ContaCorrente extends Conta {

    protected ContaCorrente(String nomeCliente, Banco banco) {
        super(nomeCliente, banco);
    }

    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança - Banco " + banco.getNome() + " ===");
        imprimirDadosBancarios();
    }
}
