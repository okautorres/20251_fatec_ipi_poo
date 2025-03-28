import java.util.Date;

public class CarrinhoDeCompras {
    private int numCarrinho;
    private int numProduto;
    private int quantidade;
    private Date dataAdicionado;
    private Cliente cliente;
    
    public CarrinhoDeCompras(int numCarrinho, int numProduto, int quantidade, Date dataAdicionado, Cliente cliente) {
        setNumCarrinho(numCarrinho);
        setNumProduto(numProduto);
        setQuantidade(quantidade);
        setDataAdicionado(dataAdicionado);
        setCliente(cliente);
    }

    public int getNumCarrinho() {
        return numCarrinho;
    }

    public void setNumCarrinho(int numCarrinho) {
        this.numCarrinho = numCarrinho;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public void setNumProduto(int numProduto) {
        this.numProduto = numProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataAdicionado() {
        return dataAdicionado;
    }

    public void setDataAdicionado(Date dataAdicionado) {
        this.dataAdicionado = dataAdicionado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItemCarrinho(int numCarrinho, int numProduto, int quantidade, Date dataAdicionado, Cliente cliente){
        if(cliente.getStatusLogin().equals("Offline")){
            System.out.println("Você precisa estar logado para atualizar a quantidade.");
        }
        setNumCarrinho(quantidade);
        setNumProduto(numProduto);
        setQuantidade(quantidade);
        setDataAdicionado(dataAdicionado);
        setCliente(cliente);
        System.out.println("Item adicionado/atualizado no carrinho.");
    }

    public void atualizarQuantidade(int quantidade){
        if (quantidade < 1) {
            System.out.println("Quantidade inválida. A quantidade deve ser maior que zero. ");
            return;
        }
        if(cliente.getStatusLogin().equals("Offline")){
            System.out.println("Você precisa estar logado para atualizar a quantidade.");
        }
        setQuantidade(quantidade);
        System.out.println("Quantidade ataualizada.");
    }

    public void verDetalhesCarrinho(){
        if (numProduto == 0) {
            System.out.println("Carrinho vazio.");
            return;
        }
        System.out.println("Carrinho nº " + numCarrinho + 
        " | Produto nº " + numProduto + " | Quantidade: " + quantidade + 
        " | Data de Adição: " + dataAdicionado + " | Cliente: " + cliente.getNomeCliente());
    }

    public void finalizarPedido(int numPedido) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. Não é possível finalizar o pedido com quantidade zero ou negativa.");
            return;
        }
    
        Pedido pedido = new Pedido(numPedido, new Date().toString(), "Em andamento", null, null, cliente);
    
        InformacoesDeEnvio informacoesDeEnvio = new InformacoesDeEnvio(numPedido, "Frete Normal", 50, 1,pedido);
    

        pedido.setInformacoesDeEnvio(informacoesDeEnvio);
    

        cliente.getPedidos().add(pedido);
    
        System.out.println("Pedido nº " + pedido.getNumPedido() + " finalizado com sucesso!");
    }

}
