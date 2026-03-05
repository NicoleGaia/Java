package src_Loja;

public class Vendedor extends Gerente{
    private int vendasRealizadas;

    public Vendedor(String nome, String email, int senha, int vendasRealizadas, boolean administrador){
        super(nome, email, senha, administrador);
        this.vendasRealizadas = vendasRealizadas;
    }

    public int getVendasRealizadas(){
        return vendasRealizadas;
    }
    public void setVendasRealizadas(int vendasRealizadas){
        this.vendasRealizadas = vendasRealizadas;
    }
    public String realizarVenda(int vendasRealizadas, Double valor){
        this.vendasRealizadas += vendasRealizadas;
        return "Venda realizada com sucesso! Quantidade: " + this.vendasRealizadas;
    }
    @Override
    public int consultarVendas(int vendasRealizadas){
        return getVendasRealizadas();
    }   
    public String realizarLogin(String email, int senha){
        if(getEmail().equals(email) && getSenha() == senha){
            return "Login bem-sucedido!";
        } else{
            return "Login falhou. Verifique suas cresenciais.";
        }
    }
    public String alterarDados(String email){
        setEmail(email);
        return "Dados alterados com sucesso!";
    }
    public String realizarLogff(){
        return "Logout realizado com sucesso!";
    }
    public int alterarSenha(int novaSenha){
        setSenha(novaSenha);
        return getSenha();
    }
}
