import java.util.Locale;
import java.util.Scanner;

public class Exercise1008Salario {


    /**
     * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroFuncionario = scanner.nextInt();
        int numeroHoras = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();

        double salario = numeroHoras * valorPorHora;

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        scanner.close();
    }
}
