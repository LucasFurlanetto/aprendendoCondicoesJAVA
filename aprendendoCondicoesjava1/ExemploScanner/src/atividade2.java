import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {

        //1. Crie uma variável para armazenar a nota de um aluno (de 0 a 10).
        //2. Usando condições encadeadas, classifique a nota da seguinte forma:
        //    - Nota >= 9: Excelente
        //    - Nota >= 7: Bom
        //    - Nota >= 5: Satisfatório
        //    - Nota < 5: Insatisfatório
        //3. Imprima a classificação correspondente.
        System.out.println("Digite sua nota: ");

        Integer nota = 0;

        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();
        String classificacao = "";


        if (nota >= 9){
        classificacao = "Exelente";

        } else if (nota >= 7){
            classificacao = "Bom";

        } else if (nota >= 5){
            classificacao ="Satisfatório";

        } else  if (nota < 5) {
            classificacao ="Insatisfatório";
        }
        System.out.println("Sua classificação foi: " + classificacao);

    }
}
