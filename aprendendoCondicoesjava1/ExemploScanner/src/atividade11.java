import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {

        double salarioBruto;
        int idadeTrabalho;
        double salarioLiquido;
        double imposto =0d;
        double bonus = 0d;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu salario Bruto: ");
        salarioBruto = sc.nextDouble();
        System.out.println("Qual sua idade Trabalho: ");
        idadeTrabalho = sc.nextInt();

        if (idadeTrabalho > 10) {
            bonus = salarioBruto * 0.10;
        } else if (idadeTrabalho >= 5) {
            bonus = salarioBruto * 0.05;}

        if (salarioBruto > 5000){
            imposto = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000) {
            imposto = salarioBruto * 0.18;
        } else if (salarioBruto < 3000) {
            imposto = salarioBruto * 0.10;

        }
        salarioLiquido = salarioBruto + bonus - imposto;

        System.out.println("O salario bruto é: " + salarioBruto + " O bonus é: " + bonus + " O imposto descontado é: " + imposto + "O salario liquido é: " + salarioLiquido);


    }
}
