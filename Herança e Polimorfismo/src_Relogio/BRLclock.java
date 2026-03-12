package src_Relogio;

public class BRLclock extends Relogio{
    

    public BRLclock(int hora, int minuto, int segundo, String periodo){
        super(hora, minuto, segundo, periodo);
    }

    @Override
    public void setHora(int hora){
        if(hora >=0 && hora <=23){
            super.setHora(hora);
            super.setPeriodo(hora);
        }
        else{
            System.out.println("Hora inválida! A hora deve estar entre 0 e 23.");
        }
    }
    

}
