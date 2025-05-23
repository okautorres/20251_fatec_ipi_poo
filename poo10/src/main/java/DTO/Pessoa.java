package DTO;

public abstract class Pessoa {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String email, String telefone, String documento) {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDocumento(documento);
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    
}
