package src_Loja;

public class Atendente extends Gerente{
    private Double valorEmCaixa;

    public Atendente(String name, String email, int senha, Double valorEmCaixa, boolean administrador){
        super(name, email, senha, administrador);
        this.valorEmCaixa = valorEmCaixa;
    }
    public Double getValorEmCaiixa(){
        return valorEmCaixa;
    }
    public void setValorEmCaixa(Double valorEmCaixa){
        this.valorEmCaixa = valorEmCaixa;
    }
    public double receberPagamento(Double valor){
        this.valorEmCaixa += valor;
        return this.valorEmCaixa;
    }
    public String fecharCaixa(){
        return "Caixa fechado! Valor total em caixa: R$ " + this.valorEmCaixa;
    }
    @Override
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
