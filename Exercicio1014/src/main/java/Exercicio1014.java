import java.util.Scanner;

public class Exercicio1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanciaPercorrida = scanner.nextInt();

        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}
