import java.util.Scanner;

public class Exerciciolista38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir os comprimentos dos lados do triângulo
        System.out.println("Digite os comprimentos dos três lados do triângulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        // Verificar se os comprimentos dos lados formam um triângulo válido
        if (isTrianguloValido(lado1, lado2, lado3)) {
            // Determinar o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os comprimentos dos lados não formam um triângulo válido.");
        }

        scanner.close();
    }

    // Método para verificar se os comprimentos dos lados formam um triângulo válido
    public static boolean isTrianguloValido(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}