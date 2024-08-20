import java.util.Locale;
import java.util.Scanner;

/**
 * Exercicio 1003 - Soma Simples
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. 
 * A seguir escrever o valor desta variável.
 */

public class Exercise1003SomaSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        int soma = valorA + valorB;

        System.out.printf("SOMA = %d%n", soma);

    
    }
}
