public class Ingresso {
    private Double price;
    private String name;
    private String type;

    public Ingresso(Double price, String name, String type){
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public double calcularValorReal(){
        return this.price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}
