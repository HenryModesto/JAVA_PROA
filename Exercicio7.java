import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade > 0 && idade <= 12) {
            System.out.println("É criança!");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("É adolescente!");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("É adulto!");
        } else if (idade >= 60) {
            System.out.println("É idoso!");
        } else {
            System.out.println("Erro, digite sua idade novamente!");
        }

        sc.close();
    }
}