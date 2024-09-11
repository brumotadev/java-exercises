import java.util.Scanner;
import java.util.Locale;


public class Exercise1009SalarioBonus {


    /** 
     * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
     * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double salarioTotal = (totalVendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}
