public abstract class Funcionario {
    private String nome;
    private String telefone;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String nome, String telefone, String senha) {
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar(){
        System.out.println("Você conseguiu acessar a porta de funcionários da clinica médica \n");
    }

}
