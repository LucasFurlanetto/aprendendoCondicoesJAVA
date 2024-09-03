import java.util.Scanner;

public class atividade6 {
    public class Atividade06Condicoes {
        public static void main(String[] args) {

            double mediaFinal;

            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual a media final: ");
            mediaFinal = entrada.nextDouble();

            if (mediaFinal >= 7) {
                System.out.println("Aprovado");
            } else if (mediaFinal >= 5 && mediaFinal < 7) {
                System.out.println("Recuperação");
            } else if (mediaFinal < 5) {
                System.out.println("Reprovado");
            }


        }
    }
}

