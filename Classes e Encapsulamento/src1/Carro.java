package src1;

public class Carro{
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro(){
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void desligar(boolean ligaddo){
        if(this.marcha == 0 && this.velocidade == 0){
            System.out.println("Carro desligado.");
        }
        else{
            System.out.println("Não é possível desligar o carro em movimento ou engatado.");
        }
    }

    public void ligar(boolean ligado){
        this.ligado = true;
        System.out.println("Carro Ligado.");
    }

    public void acelerar(){
        if(!this.ligado){
            System.out.println("O carro está desligado. Não é possível acelerar.");
            return;
        }
        if(this.marcha == 0){
            System.out.println("O carro está em ponto morto. Engate uma marcha para acelerar.");
            return;
        }
        int limiteDaMarcha = 0;

        switch(this.marcha){
            case 1:
                    limiteDaMarcha = 20;
                    if(this.velocidade < limiteDaMarcha){
                        this.velocidade++;
                        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + "km/h");
                    }
                    else{
                        System.out.println("É necessário subir marcha para continuar acelerando.");
                        return;
                    }
                break;
            case 2:
                    limiteDaMarcha = 40;
                    if(this.velocidade < limiteDaMarcha){
                        this.velocidade++;
                        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + "km/h");
                    }
                    else{
                        System.out.println("É necessário subir marcha para continuar acelerando.");
                        return;
                    }
                break;
            case 3:
                    limiteDaMarcha = 60;
                    if(this.velocidade < limiteDaMarcha){
                        this.velocidade++;
                        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + "km/h");
                    }
                    else{
                        System.out.println("É necessário subir marcha para continuar acelerando.");
                        return;
                    }
                break;
            case 4:
                    limiteDaMarcha = 80;
                    if(this.velocidade < limiteDaMarcha){
                        this.velocidade++;
                        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + "km/h");
                    }
                    else{
                        System.out.println("É necessário subir marcha para continuar acelerando.");
                        return;
                    }
                break;
            case 5:
                    limiteDaMarcha = 100;
                    if(this.velocidade < limiteDaMarcha){
                        this.velocidade++;
                        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + "km/h");
                    }
                    else{
                        System.out.println("É necessário subir marcha para continuar acelerando.");
                        return;
                    }
                break;
            case 6:
                    limiteDaMarcha = 120;
                    if(this.velocidade < limiteDaMarcha){
                        this.velocidade++;
                        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + "km/h");
                    }
                    else{
                        System.out.println("Velocidade máxima atingida para a marcha atual.");
                        return;
                    }
                    break;
        }
    }


    public void frear() {
    if (!this.ligado) {
        System.out.println("O carro está desligado.");
        return;
    }

    int limiteMinimo = 0;

    switch (this.marcha) {
        case 1: limiteMinimo = 0; break;
        case 2: limiteMinimo = 21; break;
        case 3: limiteMinimo = 41; break;
        case 4: limiteMinimo = 61; break;
        case 5: limiteMinimo = 81; break;
        case 6: limiteMinimo = 101; break;
        default: limiteMinimo = 0; break; 
    }

    // Agora a lógica fica clara:
    if (this.velocidade > limiteMinimo) {
        this.velocidade--;
        System.out.println("Freando... Velocidade: " + this.velocidade + "km/h");
    } else {
        System.out.println("Limite mínimo da marcha " + this.marcha + " atingido. Reduza a marcha para frear mais.");
    }
}

    public void subirMarcha(){
        if(!this.ligado){
            System.out.println("O carro está desligado. Não é possível trocar de marcha.");
            return;
        }
        if(this.velocidade >= 0 && this.marcha < 5){
            this.marcha++;
            System.out.println("Marcha trocada para: " + this.marcha);
        }
    }

    public void descerMarcha(){
        if(!this.ligado){
            System.out.println("O carro está desligado. Não é possível trocar de marcha.");
            return;
        }
        if(this.velocidade > 0 && this.marcha > 1){
            this.marcha--;
            System.out.println("Marcha trocada para: " + this.marcha);
        }
    }

    public void virarEsquerda(){
        if(!this.ligado){
            System.out.println("O carro está desligado. Não é possível virar.");
            return;
        }
        if(this.velocidade > 0 && this.velocidade <= 40){
            System.out.println("Virando à esquerda.");
        }
        else if(this.velocidade > 40){
            System.out.println("Reduza a velocidade para virar à esquerda com segurança.");
        }
    }

    public void virarDireita(){
        if(!this.ligado){
            System.out.println("O carro está desligado. Não é possível virar.");
            return;
        }
        if(this.velocidade > 0 && this.velocidade <= 40){
            System.out.println("Virando à direita.");
        }
        else if(this.velocidade > 40){
            System.out.println("Reduza a velocidade para virar à direita com segurança.");
        }
        }
}