import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {

        int numero = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero >= 1 ){
            System.out.println("Esse numero é Positivo");
        } else if (numero < 0) {
            System.out.println("Esse numero é Negativo");
        }else
            System.out.println("Esse numero é ZERO");

    }
}
