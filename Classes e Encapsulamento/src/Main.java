import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o nome do titular da conta:");
       String titular = scanner.nextLine();
       
       ContaBancaria conta = new ContaBancaria(titular);
       System.out.println("\n" +titular + ", seu saldo inicial é de: " + conta.getSaldo());

       int opcao;
       do{
        System.out.println("==== Escolha a opção ====");
       System.out.println("1 - Depositar");
       System.out.println("2 - Sacar");
       System.out.println("3 - Ver saldo");
       System.out.println("0 - Sair");
       System.out.println("==========================");
       opcao = scanner.nextInt();

       switch(opcao){
        case 1:
            System.out.println("Digite o valor a ser depositado:");
            double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);
            break;

        case 2:
            System.out.println("Digite o valor a ser sacado:");
            double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);
            break;
        
        case 3:
            System.out.println("Seu saldo atual é: " + conta.getSaldo());
            break;
        
        case 0:
            break;

        default:
            System.out.println("Opção Inválida!");
            break;

        }
       } while(opcao != 0);
       /*{
        System.out.println("Deseja realizar outra operação? (s/n)");
        char continuar = scanner.next().charAt(0);
        if(continuar == 'n' || continuar == 'N'){
            break;
        }***/

        scanner.close();
       }
}