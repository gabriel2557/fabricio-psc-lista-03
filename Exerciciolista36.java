import java.util.Scanner;

public class Exerciciolista36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir um número de 1 a 4
        System.out.print("Insira um número de 1 a 4 para escolher uma estação: ");
        int numeroEstacao = scanner.nextInt();

        // Identificar a estação e imprimir a mensagem correspondente
        switch (numeroEstacao) {
            case 1:
                System.out.println("Você escolheu a Primavera. As flores estão florescendo e o clima está ameno.");
                break;
            case 2:
                System.out.println("Você escolheu o Verão. É uma época quente, perfeita para ir à praia e se refrescar.");
                break;
            case 3:
                System.out.println("Você escolheu o Outono. As folhas das árvores estão mudando de cor e caindo.");
                break;
            case 4:
                System.out.println("Você escolheu o Inverno. Está frio lá fora, então vista-se bem para se manter aquecido.");
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número de 1 a 4.");
        }

        scanner.close();
    }
}