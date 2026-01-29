import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado?");
        var lado = scanner.nextDouble();
        var area = Math.pow(lado, 2);
        System.out.printf("A área do quadrado é %s", area);
        scanner.close();
    }
}