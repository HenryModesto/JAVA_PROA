import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite a categoria do cliente (1 para comum, 2 para associado, 3 para VIP): ");
        int categoria = scanner.nextInt();

        double valorFinal;

        if (categoria == 1) {
            valorFinal = valorCompra; // Sem desconto
            System.out.println("Cliente comum. Sem desconto.");
        } else if (categoria == 2) {
            valorFinal = valorCompra * 0.90; // 10% de desconto
            System.out.println("Cliente associado. Desconto de 10% aplicado.");
        } else if (categoria == 3) {
            valorFinal = valorCompra * 0.80; // 20% de desconto
            System.out.println("Cliente VIP. Desconto de 20% aplicado.");
        } else {
            valorFinal = valorCompra;
            System.out.println("Categoria inválida. Sem desconto aplicado.");
        }

        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}