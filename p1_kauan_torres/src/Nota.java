public class Nota {
    private static int contadorId = 1;
    private int id;
    private float valor;
    private String descricao;
    private Aluno aluno;
    private Curso curso;

    public Nota(float valor, String descricao, Aluno aluno, Curso curso) {
        setId(contadorId++);
        setValor(valor);
        setDescricao(descricao);
        setAluno(aluno);
        setCurso(curso);
    }

    public void exibirNota() {
        System.out.println("Nota: " + valor + " - " + descricao);
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Nota.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

}