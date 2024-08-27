import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Boas-vindas ao processo de cadastro de conta bancária!");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o número da conta: ");
            int numero = input.nextInt();
            System.out.println("Digite o número da agência: ");
            String agencia = input.next();
            input.nextLine();
            System.out.println("Digite o seu nome: ");
            String nomeCliente = input.nextLine();
            System.out.println("Digite o saldo da conta: ");
            float saldo = input.nextFloat();
            System.out.println("Olá, " + nomeCliente + ", agradecemos por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numero + ". O seu saldo de " + saldo + " já está disponível para saque.");
        }
    }
}
