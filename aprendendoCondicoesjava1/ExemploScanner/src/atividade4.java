import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {

        String logincorreta = "gustavo";
        String senhacorreta = "1234";
        String login = "";
        String senha = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Login: ");
        login = sc.nextLine();
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();

        if (logincorreta.equals(login) && senhacorreta.equals(senha)) {
            System.out.println("Login efetuado com sucesso!");
        } else{
            System.out.println("Acesso negado!");

        }
    }
}
