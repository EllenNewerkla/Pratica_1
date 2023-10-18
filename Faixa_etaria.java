package exer;
import java.util.Scanner;

public class idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade: ");
        idade = scanner.nextInt();
        
        if (idade >= 0 && idade <= 17) {
            System.out.println("É menor de idade");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("É um adulto");
        } else if (idade >= 60 && idade <= 100) {
            System.out.println("É um idoso");
        } else {
            System.out.println("Essa idade é inválida");
        }
    }
}