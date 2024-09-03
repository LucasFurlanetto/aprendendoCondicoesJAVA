import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        int numero = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero é Par");
        } else
            System.out.println("O Numero é Impar");

    }
}
