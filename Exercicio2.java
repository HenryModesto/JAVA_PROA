import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        if(n1 > 0){
            System.out.println("Positivo");
        } else if(n1 < 0){
            System.out.println("Negativo");
        } else{
            System.out.println("É igual a 0");
        }

    }
}
