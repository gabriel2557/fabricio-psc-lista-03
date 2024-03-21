import java.util.Scanner;

public class Exerciciolista310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir o cabeçalho da loja
        System.out.println("Lojinha do Sr. Aboo");

        // Pedir o valor da compra do produto
        System.out.print("Digite o valor de compra do produto: R$");
        double valorCompra = scanner.nextDouble();

        // Definir a porcentagem de lucro de acordo com a tabela
        double porcentagemLucro;
        if (valorCompra < 20) {
            porcentagemLucro = 45;
        } else if (valorCompra <= 50) {
            porcentagemLucro = 35;
        } else if (valorCompra <= 100) {
            porcentagemLucro = 25;
        } else {
            porcentagemLucro = 15;
        }

        // Calcular o valor da venda
        double valorVenda = valorCompra * (1 + porcentagemLucro / 100);

        // Exibir a porcentagem de lucro e o valor da venda
        System.out.println("Porcentagem de lucro: " + porcentagemLucro + "%");
        System.out.println("Valor de venda: R$" + valorVenda);

        scanner.close();
    }
}