import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
public class Contador {
    public static void main (String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o pri

        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }
        }

        int contagem = parametroDois - parametroUm;
        for (int i = parametroUm; i <= parametroDois ; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        System.out.println("Quantidade de interações: " + contagem);
        //realizar o for para imprimir os números com base na variável contagem
    }
}