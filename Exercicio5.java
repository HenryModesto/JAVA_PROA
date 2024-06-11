import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio5{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota ");
        float nota1 = Sc.nextInt();

        System.out.println("Digite a segunda nota");
        float nota2 = Sc.nextInt();


        System.out.println("Digite a terceira nota:");
        float nota3 = Sc.nextInt();


        float media = (nota1 + nota2 + nota3)/3;

        if(media >= 7 ){
            System.out.println("Aprovado!, sua média é" + media);
        } else if (media == 5){
            System.out.println("Recuperação, sua média é"+ media);
        } else if(media < 5){
            System.out.println("Reprovado, sua média é" + media);
        }
    }
}