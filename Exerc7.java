import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num1 = scanner.nextInt();
        System.out.println("Informe outro número maior que o primeiro:");
        int num2 = scanner.nextInt();
        if(num1 >= num2){
            System.out.println("O segundo número deve ser maior que o primeiro.");
            System.out.println("Informe outro número maior que o primeiro:");
            num2 = scanner.nextInt();
        }
        System.out.println("Digite 0 para PAR e 1 para ÍMPAR:");
        int escolha = scanner.nextInt();
        System.out.println("Números entre " + num1 + " e " + num2 + " que são " + (escolha == 0 ? "PAR" : "ÍMPAR"));
        switch(escolha){
            case 0:
                for(int i = num2; i >= num1; i--){
                    if(i % 2 == 0){
                        System.out.println(i);
                    }
                }
                break;
            case 1:
                for(int i = num2; i >= num1; i--){
                    if(i % 2 != 0){
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        } 

        scanner.close();
    }
}