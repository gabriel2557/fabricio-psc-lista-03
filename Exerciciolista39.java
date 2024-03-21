import java.util.Scanner;

public class Exerciciolista39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir a idade da pessoa
        System.out.print("QUAL A IDADE DA PESSOA?: ");
        int idade = scanner.nextInt();

        // Determinar a classificação eleitoral
        String classificacao;
        if (idade < 16) {
            classificacao = "Não é eleitor";
        } else if (idade >= 16 && idade <= 17) {
            classificacao = "Eleitor facultativo";
        } else if (idade >= 18 && idade <= 65) {
            classificacao = "Eleitor obrigatório";
        } else {
            classificacao = "Eleitor facultativo";
        }

        // Imprimir a classificação eleitoral
        System.out.println("Saída: " + classificacao);

        scanner.close();
    }
}