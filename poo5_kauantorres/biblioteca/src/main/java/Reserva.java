import java.util.Date;

public class Reserva {
    private String codigo;
    private Date dataReserva;
    private Date dataPrevista;
    private String situacao;
    private Leitor leitor; // Associação leitor com reserva

    public void mostrar() {
        String msg = "Reserva{" +
                "codigo='" + getCodigo() + '\'' +
                ", dataReserva=" + getDataReserva() +
                ", dataPrevista=" + getDataPrevista() +
                ", situacao='" + getSituacao() + '\'' +
                '}';
    }

    public Reserva(String codigo, Date dataReserva, Date dataPrevista, String situacao) throws Exception {
        setCodigo(codigo);
        setDataReserva(dataReserva);
        setDataPrevista(dataPrevista);
        setSituacao(situacao);
    }

    public Reserva() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) throws Exception {
        if(situacao==null || situacao.length()<4){
            throw  new Exception("Informe uma situação corretamente!");
        }
        this.situacao = situacao;
    }


    public void cadastrar() {}
    public void cancelar() {}
    public void retirar() {}
}
