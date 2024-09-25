public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Itaú");
        ContaCorrente cc1 = new ContaCorrente("Cliente 1", banco);
        cc1.depositar(100);
        cc1.imprimirExtrato();
        banco.exibirContas();
    }
}
