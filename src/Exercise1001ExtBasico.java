import java.util.Scanner;

/**
 * Exercocop 1001 - Extremamente Basico
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
 * Efetue a soma de A e B atribuindo o seu resultado na variável X. 
 * Imprima X
 * @author Bruno Mota
 */

public class Exercise1001ExtBasico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        int soma = valorA + valorB;

        System.out.println("X = " + soma);

        scanner.close();
    }
}
