import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var num = scanner.nextInt();

        System.out.printf("----- Tabuada do %d -----\n", num);
        for (int i=0; i<=10; i++){
            var result = num*i;
            System.out.printf("%d x %d = %d \n", num, i, result);
        }

        scanner.close();
    }
}