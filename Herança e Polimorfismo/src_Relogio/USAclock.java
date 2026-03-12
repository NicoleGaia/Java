package src_Relogio;

public class USAclock extends Relogio{
    public USAclock(int hora, int minuto, int segundo, String periodo){
        super(hora, minuto, segundo, periodo);
    }

    @Override
    public void setHora(int hora){
        // aceita horas no formato 24h (0-23) e converte para 12h com AM/PM
        if(hora >= 0 && hora <= 23){
            int converted = hora % 12;
            if (converted == 0) {
                converted = 12; // meia-noite e meio-dia são representados como 12
            }
            else if(hora >=12 && hora < 24 && converted != 0){
                converted = hora - 12; // converte para formato 12h
            }
            super.setHora(converted);
            // atualizar o período com base na hora original de 24h
            super.setPeriodo(hora);
        } else {
            System.out.println("Hora inválida! A hora deve estar entre 0 e 23");
        }
    }
}

