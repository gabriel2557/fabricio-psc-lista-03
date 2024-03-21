import java.util.Scanner;

public class Exerciciolista37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a descrição do produto
        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        // Ler a quantidade adquirida
        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        // Ler o preço unitário
        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        // Calcular o total
        double total = quantidade * precoUnitario;

        // Calcular o desconto
        double desconto;
        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else if (quantidade < 30) {
            desconto = total * 0.05;
        } else {
            desconto = total * 0.10;
        }

        // Calcular o total a pagar
        double totalPagar = total - desconto;

        // Imprimir os resultados
        System.out.println("\nDescrição do produto: " + descricao);
        System.out.println("Quantidade adquirida: " + quantidade);
        System.out.println("Preço unitário: R$" + precoUnitario);
        System.out.println("Total: R$" + total);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total a pagar: R$" + totalPagar);

        scanner.close();
    }
}