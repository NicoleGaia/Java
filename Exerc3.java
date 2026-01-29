import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor da base do retângulo?");
        var base = scanner.nextDouble();
        System.out.println("Qual o valor da altura do retângulo?");
        var altura = scanner.nextDouble();
        var area = base * altura;
        System.out.printf("A área do retângulo é %s", area);

        scanner.close();
    }
}