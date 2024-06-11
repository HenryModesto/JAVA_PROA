import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println("O número " + n1 + " é máior que o número " + n2 );
        } else {
            System.out.println("O número " + n2 + " é máior que o número " + n1 );
        }
    }
}
