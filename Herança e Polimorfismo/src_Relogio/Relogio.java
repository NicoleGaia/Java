package src_Relogio;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    private String periodo; // até 12:00 é AM, depois é PM

    public Relogio(int hora, int minuto, int segundo, String periodo){
        this.hora= hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.periodo = periodo;
    }

    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    public int getSegundo(){
        return segundo;
    }
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    public String getPeriodo(){
        return periodo;
    }
    public void setPeriodo(int hora){
        this.periodo = (hora < 12) ? "AM" : "PM";
    }
}
