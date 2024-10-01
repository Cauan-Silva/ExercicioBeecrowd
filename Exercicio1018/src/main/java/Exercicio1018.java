import java.util.Scanner;

public class Exercicio1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        System.out.println(N);
        
        int notas100 = N / 100;
        N %= 100;
        
        int notas50 = N / 50;
        N %= 50;
        
        int notas20 = N / 20;
        N %= 20;
        
        int notas10 = N / 10;
        N %= 10;
        
        int notas5 = N / 5;
        N %= 5;
        
        int notas2 = N / 2;
        N %= 2;
        
        int notas1 = N;
        
        System.out.printf("%d nota(s) de R$ 100,00%n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00%n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00%n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00%n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00%n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00%n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00%n", notas1);
    }
}