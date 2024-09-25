public class Conta {
    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo = 0;
    protected Banco banco;

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Conta(String nomeCliente, Banco banco){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.banco = banco;
        banco.adicionarConta(this);
        this.cliente = new Cliente(nomeCliente);
    }

    protected void sacar(double valor) {
        saldo -= valor;
    }

    protected void depositar(double valor) {
        saldo += valor;
    }

    protected void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected int getAgencia() {
        return agencia;
    }

    protected int getNumero() {
        return numero;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void imprimirDadosBancarios(){
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                ", banco=" + banco +
                '}';
    }
}
