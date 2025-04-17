import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matricula {
    private static int contadorId = 1;
    private int id;
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;
    private String status;
    private List<Pagamento> pagamentos;

    public Matricula(Aluno aluno, Curso curso) {
        setId(contadorId++);
        setAluno(aluno);
        setCurso(curso);
        setDataMatricula(new Date());
        setStatus("Ativa");
        this.pagamentos = new ArrayList<>();
    }

    public void listarPagamentos() {
        for (Pagamento p : pagamentos) {
            System.out.println("Pagamento de R$" + p.getValor() + " - Status: " + p.getStatus());
        }
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Matricula.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}