import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor1 = Sc.nextInt();

        if(valor1 % 2 == 0){
           System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }


    }
}