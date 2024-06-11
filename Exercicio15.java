import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Categoria: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Categoria: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Categoria: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Categoria: Obesidade grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Categoria: Obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Categoria: Obesidade grau III");
        }

        scanner.close();
    }
}