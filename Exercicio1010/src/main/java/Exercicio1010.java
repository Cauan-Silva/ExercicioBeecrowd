import java.util.Scanner;

public class Exercicio1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int numPecas1 = scanner.nextInt();
        double valorUnitario1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int numPecas2 = scanner.nextInt();
        double valorUnitario2 = scanner.nextDouble();

        double valorTotal = (numPecas1 * valorUnitario1) + (numPecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}
