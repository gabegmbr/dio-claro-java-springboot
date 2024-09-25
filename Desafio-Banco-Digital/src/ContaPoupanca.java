public class ContaPoupanca extends Conta {
    protected ContaPoupanca(String nomeCliente, Banco banco) {
        super(nomeCliente, banco);
    }

    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança - Banco " + banco.getNome() + " ===");
        imprimirDadosBancarios();
    }
}
