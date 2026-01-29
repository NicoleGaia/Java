import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        int num = scanner.nextInt();
        
        int maiorNum;
        do{
            System.out.println("Informe um múmero maior que " + num + ":");
            maiorNum = scanner.nextInt();
            if(maiorNum < num){
                System.out.println("Número Inválido! Tente novamente.");
                System.out.println("Informe um número maior que " + num + ":");
                maiorNum = scanner.nextInt();
            }
        }
        while(maiorNum % num ==0);

        scanner.close();
    }
}