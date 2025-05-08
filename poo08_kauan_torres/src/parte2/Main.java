package parte2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 160);
        ProfessorGraduacao professorGraduacao = new ProfessorGraduacao("Carlos", 160, "Mestrado");
        ProfessorTecnico professorTecnico = new ProfessorTecnico("Ana", 160, "Doutorado");
        funcionario.obtemSalario();
        funcionario.cargaHoraria();
        professorGraduacao.obtemSalario();
        professorGraduacao.cargaHoraria();
        professorTecnico.obtemSalario();
        professorTecnico.cargaHoraria();
    }
}
