import java.util.Scanner;

public class Exerciciodeteste{

    public static void main(String []args) {

        Scanner imput = new Scanner(System.in);


        Double soma;
        

        System.out.println("Escreva o primeiro numero");
        double numero1 = imput.nextDouble();

        System.out.println("Escreva o segundo numero");
        
        Double numero2 = imput.nextDouble();

        soma = (numero1/numero2);
        System.out.println(soma);

        imput.close();  
    }
}   