public class Copia {
    private int codigo;
    private String situacao;
    private String descritivo;
    private Obra obra; // Associação obra com copia

    public Copia() {
    }

    public Copia(int codigo, String situacao, String descritivo) throws Exception {
        setCodigo(codigo);
        setSituacao(situacao);
        setDescritivo(descritivo);
    }


    public void mostrar() {
        String msg = "Copia{" +
                "codigo=" + getCodigo() +
                ", situacao='" + getSituacao() + '\'' +
                ", descritivo='" + getDescritivo() + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) throws Exception {
        if(situacao==null || situacao.length()<3){
            throw new Exception("A situacao deve ser informada corretamente!");
        }
        this.situacao = situacao;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void guardar() {}
    public void carregar() {}
    public void listar() {}
}
