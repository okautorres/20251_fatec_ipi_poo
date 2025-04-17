import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Curso cursoIngles = new Curso(1, "Inglês Básico", "Inglês", 60, "Básico", 1200.0f);

        Professor prof = new Professor(1, "Ana", "123.456.789-00", "ana@escola.com", "1111-2222", 1001, "Inglês");
        prof.exibir(); // Polimorfismo

        Aluno aluno = new Aluno(2, "Lucas", "987.654.321-00", "lucas@aluno.com", "9999-8888");
        aluno.exibir(); // Polimorfismo

        aluno.matricular(cursoIngles);

        Aula aula1 = new Aula(1, new Date(), "Verbo To Be", cursoIngles, prof);
        aula1.adicionarAluno(aluno);
        cursoIngles.adicionarAula(aula1);

        prof.registrarNota(aluno, cursoIngles, 8.5f, "Prova 1");

        Matricula matricula = aluno.getMatriculas().get(0);
        Pagamento pagamento = new Pagamento(1200.0f, matricula);
        matricula.adicionarPagamento(pagamento);
        matricula.listarPagamentos();

        aluno.consultarAulas();
        prof.consultarAulas();
        aluno.realizarPagamento(1200.0f);
    }
}
