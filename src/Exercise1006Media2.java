import java.util.Locale;
import java.util.Scanner;

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
 * Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */


public class Exercise1006Media2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        double media = ((valorA * 2) + (valorB * 3) + (valorC * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
