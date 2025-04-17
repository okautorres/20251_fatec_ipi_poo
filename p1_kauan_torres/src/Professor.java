import java.util.List;

public class Professor extends Pessoa {
    private int registro;
    private String especialidade;
    private List<Aula> aulas;

    public Professor(int id, String nome, String cpf, String email, String telefone, int registro, String especialidade) {
        super(id, nome, cpf, email, telefone);
        setRegistro(registro);
        setEspecialidade(especialidade);
    }

    public void registrarNota(Aluno aluno, Curso curso, float valor, String descricao) {
        Nota nota = new Nota(valor, descricao, aluno, curso);
        System.out.println("Nota registrada para aluno " + aluno.nome);
    }

    public void consultarAulas() {
        System.out.println("Consultando aulas do professor " + nome);
    }

    @Override
    public void exibir() {
        System.out.println("Professor: " + nome);
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    // Getters e Setters
}