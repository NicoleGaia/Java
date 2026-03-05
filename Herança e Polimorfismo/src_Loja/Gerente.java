package src_Loja;

public class Gerente {
    private String nome;
    private String email;
    private int senha;
    private boolean administrador;

    public Gerente(String nome, String email, int senha, boolean administrador){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getSenha(){
        return senha;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    public boolean isAdministrador(){
        return administrador;
    }
    public void setAdministrador(boolean administrador){
        this.administrador = administrador;
    }
    public int consultarVendas(int vendasRealizadas){
        return vendasRealizadas;
    }   
    public String realizarLogin(String email, int senha){
        if(this.email.equals(email) && this.senha == senha){
            return "Login bem-sucedido!";
        } else{
            return "Login falhou. Verifique suas cresenciais.";
        }
    }
    public String alterarDados(String email){
        this.email = email;
        return "Dados alterados com sucesso!";
    }
    public String realizarLogff(){
        return "Logout realizado com sucesso!";
    }
    public int alterarSenha(int novaSenha){
        this.senha = novaSenha;
        return this.senha;
    }
}
    