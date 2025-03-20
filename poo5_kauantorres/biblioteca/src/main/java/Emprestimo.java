import java.util.Date;

public class Emprestimo {
    private String codigo;
    private Date dataEmprestimo;
    private Date dataPrevista;
    private Date dataDevolvido;
    private String situacao;
    private double multa;
    private Funcionario funcionario; // Associação funcionario com emprestimo
    private Leitor leitor; // Associação leitor com emprestimo
    private List<Copia> copias = new ArrayList<>(); // Composição (se emprestimo é destruido a cópia também)



    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolvido() {
        return dataDevolvido;
    }

    public void setDataDevolvido(Date dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void mostrar() {
        String msg = "Reserva{" +
                "codigo='" + getCodigo() + '\'' +
                ", dataReserva=" + getDataEmprestimo() +
                ", dataPrevista=" + getDataPrevista() +
                ", situacao='" + getSituacao() + '\'' +
                '}';
    }

    public Emprestimo(String codigo, Date dataReserva, Date dataPrevista, String situacao) throws Exception {
        setCodigo(codigo);
        setDataEmprestimo(dataReserva);
        setDataPrevista(dataPrevista);
        setSituacao(situacao);
    }

    public Emprestimo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    public void carregar() {}
    public void devolver() {}
    public void listar() {}
}
