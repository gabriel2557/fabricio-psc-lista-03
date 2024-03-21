import java.util.Scanner;

public class Exerciciolista32{

    public static void main(String []args) {

        Scanner imput = new Scanner(System.in);

        double media;

        System.out.println("Por favor insira a primeira nota");
        Double nota1 = imput.nextDouble();

        System.out.println("Por favor insira a segunda nota");
        Double nota2 = imput.nextDouble();

        System.out.println("Por favor insira a terceira nota");
        Double nota3 = imput.nextDouble();

        media = (nota1 + nota2 + nota3)/3;
        System.out.println(media);

        if (media >=7) {

            System.out.println("Parabéns você foi APROVADO!"+ media);
        
        } else {
            
            System.out.println("Infelizmente você foi REPROVADO!"+ media);

            }
        
        imput.close();
        }
}
