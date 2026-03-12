package src_Relogio;

public class Main {
    public static void main(String[] args){
        Relogio relogio = new Relogio(10, 30, 45, "AM");
        System.out.println("Relógio genérico: " + relogio.getHora() + ":" + relogio.getMinuto()+ ":" + relogio.getSegundo() + " " + relogio.getPeriodo() + "\n");
        
        BRLclock brlClock = new BRLclock(0, 30, 45, null);
        brlClock.setHora(15);
        System.out.println("Relógio BRL: " + brlClock.getHora() + ":" + brlClock.getMinuto() + ":" + brlClock.getSegundo() + " " + brlClock.getPeriodo() + "\n");
        
        USAclock usaClock = new USAclock(0, 30, 45, null);
        usaClock.setHora(10);
        System.out.println("Relógio USA: " + usaClock.getHora() + ":" + usaClock.getMinuto() + ":" + usaClock.getSegundo() + " " + usaClock.getPeriodo() + "\n");
    }
}