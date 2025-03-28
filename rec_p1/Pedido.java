public class Pedido {
    private int numPedido;
    private String dataCriacao;
    private String status;
    private InformacoesDeEnvio informacoesDeEnvio;
    private DetalhesDoPedido detalhesPedidos;
    private Cliente cliente;

    public Pedido(int numPedido, String dataCriacao, String status, InformacoesDeEnvio informacoesDeEnvio,
            DetalhesDoPedido detalhesPedidos, Cliente cliente) {
        setNumPedido(numPedido);
        setDataCriacao(dataCriacao);
        setStatus(status);
        setInformacoesDeEnvio(informacoesDeEnvio);
        setDetalhesPedidos(detalhesPedidos);
        setCliente(cliente);
    }


    
    public int getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    public String getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public InformacoesDeEnvio getInformacoesDeEnvio() {
        return informacoesDeEnvio;
    }
    public void setInformacoesDeEnvio(InformacoesDeEnvio informacoesDeEnvio) {
        this.informacoesDeEnvio = informacoesDeEnvio;
    }
    public DetalhesDoPedido getDetalhesPedidos() {
        return detalhesPedidos;
    }
    public void setDetalhesPedidos(DetalhesDoPedido detalhesPedidos) {
        this.detalhesPedidos = detalhesPedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void efetuarPedido() throws Exception {
        if (this.status.equals("Finalizado")) {
            throw new Exception("Pedido já finalizado.");
        }
        if (informacoesDeEnvio == null || informacoesDeEnvio.getTipoFrete() == null) {
            throw new Exception("Informações de envio não registradas.");
        }
        this.status = "Finalizado";
        cliente.getPedidos().add(this);
        System.out.println("Pedido efetuado com sucesso para "+cliente.getNomeCliente());
    }


}
