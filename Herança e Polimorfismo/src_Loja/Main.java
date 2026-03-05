package src_Loja;

public class Main {
    public static void main(String[] args){
        //criar gerente, vendedor e atendente
        Gerente gerente = new Gerente("João", "joao@email.com", 2234, true);
        Vendedor vendedor = new Vendedor("Carlos", "carlos@email.com", 1234, 0, false);
        Atendente atendente = new Atendente("Maria", "maria@email.com", 4444, 1000.0, false);

        //testar login
        System.out.println(gerente.realizarLogin("joao@email.com", 2234));
        System.out.println(vendedor.realizarLogin("carlos@email.com", 1234));
        System.out.println(atendente.realizarLogin("maria@email.com", 4444));

        //gerar relatorio de vendas
        System.out.println(vendedor.realizarVenda(2, 500.0));
        System.out.println("Total de vendas realizadas: " + vendedor.consultarVendas(0));
        System.out.println(atendente.receberPagamento(1000.0));
        System.out.println(atendente.fecharCaixa());


        //Alterar dados e senha, realizar logout
        System.out.println(gerente.realizarLogff());
        System.out.println(vendedor.realizarLogff());
        System.out.println(atendente.realizarLogff());
        System.out.println(gerente.alterarDados("joao01@email.com"));
        System.out.println(vendedor.alterarDados("joao01@email.com"));
        System.out.println(atendente.alterarDados("joao01@email.com"));
    }
}
