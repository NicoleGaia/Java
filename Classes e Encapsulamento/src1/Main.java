package src1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();

        int opcao;
        do{
            System.out.println("==== Escolha a opção ====");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Subir de Marcha");
            System.out.println("6 - Descer de Marcha");
            System.out.println("7 - Virar à esqueda");
            System.out.println("8 - Virar à direita");
            System.out.println("0 - Sair");
            System.out.println("==========================");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar(true);
                    break;
                case 2:
                    carro.desligar(false);
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.frear();
                    break;
                case 5:
                    carro.subirMarcha();
                    break;
                case 6:
                    carro.descerMarcha();
                    break;
                case 7:
                    carro.virarEsquerda();
                    break;
                case 8:
                    carro.virarDireita();
                    break;
                case 0:
                    break;
            }
        }
        while(opcao !=0);

        scanner.close();
    }
}