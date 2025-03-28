import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente<carrinhoDeCompras> extends Usuario{
    private String nomeCliente;
    private String endereco;
    private String email;
    private String infoCartaoCredito;
    private String infoFrete;
    private float saldoConta;
    private List<Pedido> pedidos;
    private CarrinhoDeCompras carrinhoDeCompras;


    public Cliente(String numUsuario, String senha, String statusLogin, Date dataRegistro, String nomeCliente,
            String endereco, String email, String infoCartaoCredito, String infoFrete, float saldoConta) {
        super(numUsuario, senha, statusLogin, dataRegistro);
        setNomeCliente(nomeCliente);
        setEndereco(endereco);
        setEmail(email);
        setInfoCartaoCredito(infoCartaoCredito);
        setInfoFrete(infoFrete);
        setSaldoConta(saldoConta);
        this.pedidos = new ArrayList<>();
        this.carrinhoDeCompras = new CarrinhoDeCompras(0, 0, 0, new Date(), this);
    }

    

    public List<Pedido> getPedidos() {
        return pedidos;
    }


    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }



    public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }



    public String getNomeCliente() {
        return nomeCliente;
    }




    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }




    public String getEndereco() {
        return endereco;
    }




    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }




    public String getEmail() {
        return email;
    }




    public void setEmail(String email) {
        this.email = email;
    }




    public String getInfoCartaoCredito() {
        return infoCartaoCredito;
    }




    public void setInfoCartaoCredito(String infoCartaoCredito) {
        this.infoCartaoCredito = infoCartaoCredito;
    }




    public String getInfoFrete() {
        return infoFrete;
    }




    public void setInfoFrete(String infoFrete) {
        this.infoFrete = infoFrete;
    }




    public float getSaldoConta() {
        return saldoConta;
    }




    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void registrar() throws Exception {
        if (this.saldoConta <= 0) {
            throw new Exception("Saldo insuficiente para registrar cliente.");
        }
        if (this.email == null || this.email.isEmpty()) {
            throw new Exception("Email não pode ser vazio.");
        }
        System.out.println("Cliente registrado com sucesso.");
    }

    public boolean login(String email, String senha) {
        if(senha.equals(this.getSenha()) && email.equals(getEmail())){
            setStatusLogin("Online");
            System.out.println("Login feito com sucesso!");
            return true;
        } else{
            System.out.println("Senha errada ou email errados!");
            return false;
        }
    }

    public void atualizarPerfil(String nome, String email, String senha) {
        setNomeCliente(nome);
        setEmail(email);
        setSenha(senha);
        System.out.println("Perfil atualizado.");
    }
}
