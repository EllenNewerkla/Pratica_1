package exer;
import java.util.Scanner;

public class senha_secreta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "python123";
        String tentativa;
        
        while (true) {
            System.out.println("Digite a senha: ");
            tentativa = scanner.nextLine();
            
            if (senha.equals(tentativa)) {
                System.out.println("Senha correta!!");
                break;  
            } else {
                System.out.println("Senha incorreta, tente novamente");
            }
        }
    }
}
