import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (adição, subtração, multiplicação, divisão): ");
        String operacao = scanner.next();

        double resultado;

        if (operacao.equalsIgnoreCase("adição") || operacao.equalsIgnoreCase("adicao")) {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equalsIgnoreCase("subtração") || operacao.equalsIgnoreCase("subtracao")) {
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equalsIgnoreCase("multiplicação") || operacao.equalsIgnoreCase("multiplicacao")) {
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equalsIgnoreCase("divisão") || operacao.equalsIgnoreCase("divisao")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}