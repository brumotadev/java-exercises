import java.util.Locale;
import java.util.Scanner;

public class Exercise1004ProdutoSimples {

    /**
     * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
     * A seguir mostre a variável PROD com mensagem correspondente.
     * @author Bruno Mota
     *    
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        int prod = valorA * valorB;

        System.out.printf("PROD = %d%n", prod);

        scanner.close();

    }
}
