import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo lado: ");
        int n2 = sc.nextInt();

        System.out.println("Digite o terceiro lado: ");
        int n3 = sc.nextInt();

        if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) {
            System.out.println("Triângulo válido");
        } else {
            System.out.println("Triângulo Inválido");
        }
    }
}
