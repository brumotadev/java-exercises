
import java.util.Locale;
import java.util.Scanner;

public class Exercise1002AreaDoCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valorEntradaRaio = scanner.nextDouble();

        double valorNPi = 3.14159;

        double resultado = valorNPi * (Math.pow(valorEntradaRaio, 2));

        System.out.printf("A=%.4f%n", (resultado));

        scanner.close();
    }
}
