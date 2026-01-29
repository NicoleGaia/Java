public class ContaBancaria {
    public String titular;
    private double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
        else{
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public double getSaldo(){
        return saldo;
    }
}












/*public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;
    
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
}*/