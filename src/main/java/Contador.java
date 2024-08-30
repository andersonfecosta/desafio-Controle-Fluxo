import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm>=parametroDois) {
            throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int loops = parametroDois - parametroUm;
        int inicioContagem = 0;
        while (inicioContagem <= loops){
            System.out.println("Imprimindo o número " + parametroUm);
            inicioContagem++;
            parametroUm++;
        }

    }
}
