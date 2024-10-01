import java.util.Scanner;

public class Exercicio1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int distancia = scanner.nextInt();
        
        int tempo = distancia * 2;
        
        System.out.printf("%d minutos%n", tempo);
    }
}
