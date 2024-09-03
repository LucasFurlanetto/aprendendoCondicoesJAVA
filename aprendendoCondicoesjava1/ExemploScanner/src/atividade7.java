import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {

        double numeroUm;
        double numeroDois;
        String operacao;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numeroUm = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numeroDois = scanner.nextDouble();
        System.out.println("Digite a operacao: ");
        operacao = scanner.next();

        switch (operacao) {
            case "+":
                System.out.println(numeroUm + numeroDois);
                break;
            case "-":
                System.out.println(numeroUm - numeroDois);
                break;
            case "*":
                System.out.println(numeroUm * numeroDois);
                break;
            case "/":
                System.out.println(numeroUm / numeroDois);
                break;
            default:
                System.out.println("Operação Invalida");
                break;

        }
    }
}
