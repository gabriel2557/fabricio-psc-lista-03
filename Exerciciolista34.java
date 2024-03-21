import java.util.Scanner;

public class Exerciciolista34 {

public static String determinarSituacaoPeso(double imc) {
    if (imc < 20) {
        return "Abaixo do peso";
    } else if (imc >= 20 && imc < 25) {
        return "Peso Normal";
    } else if (imc >= 25 && imc < 30) {
        return "Sobrepeso";
    } else if (imc >= 30 && imc < 40) {
        return "Obeso";
    } else { // incluir condição para valores iguais a 40
        return "Obeso Mórbido";
    }
}
}