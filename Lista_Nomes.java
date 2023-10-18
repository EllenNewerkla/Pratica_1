package exer;
import java.util.Scanner;
public class Lista_nomes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome que quer verificar se está presente na lista: ");
        String nomever = scanner.nextLine();

        boolean encontrado = false;

        for (String nome : nomes) {
            if (nome.equals(nomever)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(nomever + " está na lista de nomes.");
        } else {
            System.out.println(nomever + " não está na lista de nomes.");
        }

	}

}