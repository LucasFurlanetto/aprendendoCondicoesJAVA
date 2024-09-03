import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {

        double valorOriginal;
        double desconto = 0;
        double valorDescontado;
        double percentualdesconto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        valorOriginal = sc.nextDouble();

        if (valorOriginal > 500) {
            desconto = valorOriginal * 0.20;
        } else if (valorOriginal > 200 && valorOriginal < 500) {
            desconto = valorOriginal * 0.10;
        } else if (valorOriginal > 100 && valorOriginal < 200) {
            desconto = valorOriginal * 0.05;
        }else
            System.out.println("Não teve desconto");

        percentualdesconto = desconto / 100;
        valorDescontado = valorOriginal - desconto;
        System.out.println("O valor original: " + valorOriginal +
                " O persentual de desconto é " + percentualdesconto + "%"  +
                " o valor do desconto é: " + desconto + " Valor final é: " + valorDescontado);







    }
}
