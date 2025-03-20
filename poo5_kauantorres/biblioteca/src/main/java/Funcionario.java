public class Funcionario {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String cargo;
    private String documento;

    public Funcionario(){}
    public Funcionario(int codigo, String nome, String email, String telefone, String cargo, String documento) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setCargo(cargo);
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

    public void setNome(String nome) throws Exception {
        if(nome==null || nome.length()<6){
            throw new Exception("informe o nome corretamente!");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(email==null || email.length()<6){
            throw new Exception("informe o email corretamente!");
        }
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public void mostrar() {
        String msg =  "Funcionario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cargo='" + cargo + '\'' +
                ", documento='" + documento + '\'' +
                '}';
        System.out.println(msg);
    }
    
    public void guardar() {}
    public void carregar() {}
    public void listar() {}
}
