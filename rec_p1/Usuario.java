import java.util.Date;
import java.time.LocalTime;

public abstract class Usuario {
    private String numUsuario;
    private String senha;
    private String statusLogin;
    private Date dataRegistro;

    public Usuario() {
    }

    public Usuario(String numUsuario, String senha, String statusLogin, Date dataRegistro) {
        setNumUsuario(numUsuario);
        setSenha(senha);
        setStatusLogin(statusLogin);
        setDataRegistro(dataRegistro);
    }

    public String getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(String numUsuario) {
        this.numUsuario = numUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatusLogin() {
        return statusLogin;
    }

    public void setStatusLogin(String statusLogin) {
        this.statusLogin = statusLogin;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public boolean verificarLogin(String senha) throws Exception{
        int hour = LocalTime.now().getHour();

        if(hour < 6 || hour > 22){
            throw new Exception("Login feito fora do horário. Só pode ser feito entre 6 e 22h.");
        }
        if(senha.equals(this.senha)){
            setStatusLogin("Online");
            System.out.println("Login feito com sucesso!");
            return true;
        } else{
            System.out.println("Senha errada!");
            return false;
        }
    }

    public void listarUsuario() {
        System.out.println("Usuario{" +
                "numUsuario='" + getNumUsuario() + '\'' +
                ", statusLogin='" + getStatusLogin() + '\'' +
                ", dataRegistro=" + getDataRegistro() +
                '}'); 
    }

}
