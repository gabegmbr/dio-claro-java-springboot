import java.util.Scanner;

class ParametrosInvalidosException extends Exception{
}

public class Contador {

        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametro Um é MAIOR que parametroDois e lançar a exceção
            int contagem = parametroDois - parametroUm;
            if (contagem <= 0){
                throw new ParametrosInvalidosException();
            }
            //realizar o for para imprimir os números com base na variável contagem
            for(int i = 1; parametroUm < parametroDois; i++, parametroUm++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }