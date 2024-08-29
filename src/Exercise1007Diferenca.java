import java.util.Locale;
import java.util.Scanner;

public class Exercise1007Diferenca {

    /**
     * Leia quatro valores inteiros A, B, C e D. 
     * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();

        int diferenca = (valorA * valorB) - (valorC * valorD);

        System.out.printf("DIFERENCA = %d%n", diferenca);

        scanner.close();
    }
}
