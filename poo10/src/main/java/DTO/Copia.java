package DTO;

public class Copia {
    private int codigo;
    private String situação;
    private String descritivo;
    private Obra obra;

    public Copia() {
    }

    public Copia(int codigo, String situação, String descritivo, Obra obra) {
        setCodigo(codigo);
        setSituação(situação);
        setDescritivo(descritivo);
        setObra(obra);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public void guardar(){

    }
    
    public void carregar(){

    }

    public void listar(){

    }
}
