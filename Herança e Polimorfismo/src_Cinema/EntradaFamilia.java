public class EntradaFamilia extends Ingresso {
    private int qtdPessoas;

    public EntradaFamilia(Double price, String name, String type, int qtdPessoas){
        super(price, name, type);
        this.qtdPessoas = qtdPessoas;
    }
    
    @Override
    public double calcularValorReal(){
        double total = super.calcularValorReal() * qtdPessoas;
        if(qtdPessoas > 3){
            total = total * 0.95;
        }
        return total;
    }

    public int getQtdPessoas(){
        return qtdPessoas;
    }
}
