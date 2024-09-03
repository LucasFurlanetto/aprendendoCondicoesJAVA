import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        Integer idade = 0;
        double peso = 0.0;

        System.out.println("Escreva seu nome :");
        nome = sc.next();

        System.out.println("Informe sua idade :");
        idade = sc.nextInt();

        System.out.println("Informe sua peso :");
        peso = sc.nextDouble();

        System.out.println(nome + " tem " + idade + " anos");
        System.out.println(nome + " tem " + peso + " peso");



    }
}