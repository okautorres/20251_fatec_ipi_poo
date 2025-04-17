import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    private int id;
    private Date data;
    private String conteudo;
    private Curso curso;
    private Professor professor;
    private List<Aluno> alunosEmAula;

    public Aula(int id, Date data, String conteudo, Curso curso, Professor professor) {
        setId(id);
        setData(data);
        setConteudo(conteudo);
        setCurso(curso);
        setProfessor(professor);
        this.alunosEmAula = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosEmAula.add(aluno);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosEmAula() {
        return alunosEmAula;
    }

    public void setAlunosEmAula(List<Aluno> alunosEmAula) {
        this.alunosEmAula = alunosEmAula;
    }
}