public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(Double price, String name, String type){
        super(price, name, type);
    }

    @Override
    public double calcularValorReal(){
        return super.calcularValorReal() / 2;
    }
}
