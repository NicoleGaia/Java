import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name1 = scanner.next();
        System.out.println("Informe sua idade:");
        var age1 = scanner.nextInt();
        System.out.println("Infomre seu nome:");
        var name2 = scanner.next();
        System.out.println("Informe sua idade:");
        var age2 = scanner.nextInt();
        var ageDif = Math.abs(age1 - age2);
        System.out.printf("A diferença de idade entre %s e %s é de %s anos.", name1, name2, ageDif);
        scanner.close();
    }
}