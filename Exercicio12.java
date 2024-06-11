import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 100) {
            System.out.println("O número é maior que 100.");
        } else {
            int dobro = numero * 2;
            System.out.println("O número não é maior que 100. O dobro do número é: " + dobro);
        }

        scanner.close();
    }
}