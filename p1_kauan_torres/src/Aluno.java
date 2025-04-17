import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Matricula> matriculas;
    private List<Nota> notas;

    public Aluno(int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
        this.matriculas = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    public void matricular(Curso curso) {
        Matricula m = new Matricula(this, curso);
        matriculas.add(m);
    }

    public void consultarNota() {
        for (Nota n : notas) {
            n.exibirNota();
        }
    }

    public void consultarAulas() {
        System.out.println("Consultando aulas do aluno " + nome);
    }

    public void realizarPagamento(float valor) {
        System.out.println("Pagamento de R$" + valor + " realizado pelo aluno " + nome);
    }

    @Override
    public void exibir() {
        System.out.println("Aluno: " + nome);
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}