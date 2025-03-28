import java.util.Date;

public class Administrador extends Usuario{
    private String nomeAdmin;
    private String email;

    public Administrador(String numUsuario, String senha, String statusLogin, Date dataRegistro, String nomeAdmin,
            String email) {
        super(numUsuario, senha, statusLogin, dataRegistro);
        setNomeAdmin(nomeAdmin);
        setEmail(email);
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean atualizarCatalogo(String password) throws Exception{
        if(password.equals("admin")){
            System.out.println("O catálogo foi atualizado");
        } else{
            throw new Exception("A senha para atualizar catalogo esta incorreta");
        }
        return true;
    }

    
    public void listarAdmin() {
        System.out.println("Administrador{" +
                "numUsuario='" + getNumUsuario() + '\'' +
                ", statusLogin='" + getStatusLogin() + '\'' +
                ", dataRegistro=" + getDataRegistro() +
                ", nomeAdmin='" + getNomeAdmin() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}'); 
    }

}
