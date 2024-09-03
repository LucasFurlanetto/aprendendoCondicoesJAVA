import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {

        double temperatura;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um temperatura em Celsius: ");
        temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente");
        } else if (temperatura >= 15 ) {
            System.out.println("Agradável");
        } else if (temperatura < 15) {
            System.out.println("Frio");

        }
    }
}
