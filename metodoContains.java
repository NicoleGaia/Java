import java.util.Scanner;

public class metodoContains {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua solicitação a respeito de serviços AWS: ");
        String solicitacao = scanner.nextLine();

        String texto = solicitacao.toLowerCase();
        
        if (texto.contains("servidor")){
            System.out.println("EC2");
        }
        else if (texto.contains("armazenar")){
            System.out.println("S3");
        }
        else if(texto.contains("banco de dados")){
            System.out.println("RDS");
        }
        else if(texto.contains("código sob demanda")){
            System.out.println("Lambda");
        }
        else{
            System.out.println("Serviço não identificado.");
        }
        
        scanner.close();
    } 
}



        /*String codigo = scanner.nextLine();
        
        if(codigo.contains("EC2")){
          System.out.println("EC2");
        }
        else if(codigo.contains("S3")){
          System.out.println("S3");
        }
        else if(codigo.contains("Lambda")){
          System.out.println("Lambda");
        }
        else{
          System.out.println("Codigo invalido");
        }*/
