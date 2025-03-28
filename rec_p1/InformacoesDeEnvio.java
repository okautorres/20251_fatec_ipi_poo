public class InformacoesDeEnvio {
    private int numFrete;
    private String tipoFrete;
    private int precoFrete;
    private int numRegiaoFrete;
    private Pedido pedido;

    public InformacoesDeEnvio(int numFrete, String tipoFrete, int precoFrete, int numRegiaoFrete, Pedido pedido) {
        setNumFrete(numFrete);
        setTipoFrete(tipoFrete);
        setPrecoFrete(precoFrete);
        setNumRegiaoFrete(numRegiaoFrete);
        setPedido(pedido);
    }

    public int getNumFrete() {
        return numFrete;
    }

    public void setNumFrete(int numFrete) {
        this.numFrete = numFrete;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public int getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(int precoFrete) {
        if(precoFrete < 0){
            System.out.println("O preço do frete não pode ser negativo");
            return;
        }
        this.precoFrete = precoFrete;
    }

    public int getNumRegiaoFrete() {
        return numRegiaoFrete;
    }

    public void setNumRegiaoFrete(int numRegiaoFrete) {
        this.numRegiaoFrete = numRegiaoFrete;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void atualizarInfoFrete(String tipoFrete, int precoFrete, int numRegiaoFrete){
        setTipoFrete(tipoFrete);
        setPrecoFrete(precoFrete);
        setNumRegiaoFrete(numRegiaoFrete);
        System.out.println("Frete atualizado.");
    }

    
    

}
