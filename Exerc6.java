import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu peso:");
        double peso = scanner.nextDouble();

        var imc = peso / (altura*altura);
        //imc = Double.parseDouble(String.format("%.2f", imc));

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc > 18.5 && imc <= 24.9){
            System.out.println(imc + " - " + "Peso ideal");
        } else if(imc > 24.9 && imc <= 29.9){
            System.out.println(imc + " - " + "Levemente acima do peso");
        } else if(imc > 29.9 && imc <= 34.9){
            System.out.println(imc + " -" + "Obesidade grau I");
        } else if(imc > 34.9 && imc <= 39.9){
            System.out.println(imc + " - " + "Obesidade grau II (Severa)");
        } else{
            System.out.println(imc + " - " + "Obesidade grau III (Mórbida)");
        } 
        
        scanner.close();
    }
}