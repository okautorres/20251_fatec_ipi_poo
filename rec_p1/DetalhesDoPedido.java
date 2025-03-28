public class DetalhesDoPedido {
    private int numPedido;
    private int numProduto;
    private String nomeProduto;
    private int quantidade;
    private float precoUnidade;
    private float subtotal;
    private Pedido pedido;

    public DetalhesDoPedido(int numPedido, int numProduto, String nomeProduto, int quantidade, float precoUnidade,
            float subtotal, Pedido pedido) {
        setNumPedido(numPedido);
        setNumProduto(numProduto);
        setNomeProduto(nomeProduto);
        setQuantidade(quantidade);
        setPrecoUnidade(precoUnidade);
        setSubtotal(subtotal);
        setPedido(pedido);
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public void setNumProduto(int numProduto) {
        this.numProduto = numProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(float precoUnidade) {
        if(precoUnidade <= 0){
            System.out.println("O preço não pode ser negativo e nem 0");
            return;
        }
        this.precoUnidade = precoUnidade;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void calcPreco(){
        this.subtotal =this.quantidade * this.precoUnidade;
        System.out.println("O preço total é: "+ subtotal);
    }

    
    
}
