public class Main {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(20.0, "Filme A", "Normal");
        MeiaEntrada m1 = new MeiaEntrada(20.0, "Filme B", "Meia");
        EntradaFamilia f1 = new EntradaFamilia(20.0, "Filme C", "Familia", 4);

        System.out.println("===== SISTEMA DE INGRESSOS =====");

        imprimir(i1);
        imprimir(m1);
        imprimir(f1);
    }

    public static void imprimir(Ingresso ingresso){
        System.out.println("Nome Filme: " + ingresso.getName());
        System.out.println("Tipo Ingresso: " + ingresso.getType());
        System.out.println("Valor a Pagar: " + ingresso.calcularValorReal());
        System.out.println("-----------------------------");
    }
}