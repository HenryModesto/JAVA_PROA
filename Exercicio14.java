import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);
            System.out.printf("O número é positivo. A raiz quadrada é: %.2f%n", raizQuadrada);
        } else {
            double aoQuadrado = Math.pow(numero, 2);
            System.out.printf("O número é negativo. O número ao quadrado é: %.2f%n", aoQuadrado);
        }

        scanner.close();
    }
}