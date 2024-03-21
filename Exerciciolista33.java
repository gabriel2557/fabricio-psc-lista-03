import java.util.Scanner;

public class Exerciciolista33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número total de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        // Leitura do número de votos brancos
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        // Leitura do número de votos nulos
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        // Leitura do número de votos válidos
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Cálculo do percentual de cada tipo de voto
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);

        scanner.close();
   }
}