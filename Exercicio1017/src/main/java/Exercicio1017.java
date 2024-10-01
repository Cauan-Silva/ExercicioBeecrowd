import java.util.Scanner;

public class Exercicio1017 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tempo = scanner.nextInt();
            int velocidade = scanner.nextInt();
            
            int distancia = tempo * velocidade;
            
            double litrosNecessarios = distancia / 12.0;
            
            System.out.printf("%.3f%n", litrosNecessarios);
        }
    }
}
