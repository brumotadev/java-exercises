
import java.util.Locale;
import java.util.Scanner;

/**
 * Exercicio 1002 Area do Circulo
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
 * - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
 * @author Bruno Mota
 */

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
