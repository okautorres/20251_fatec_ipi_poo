public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(int id, String nome, String cpf, String email, String telefone, String cargo) {
        super(id, nome, cpf, email, telefone);
        setCargo(cargo);
    }

    public void gerarRelatorioMatriculas() {
        System.out.println("Relatório de matrículas gerado.");
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    public void gerenciarHorarios() {
        System.out.println("Horários gerenciados.");
    }

    public void cadastrarAluno(Aluno aluno) {
        System.out.println("Aluno " + aluno.nome + " cadastrado.");
    }

    @Override
    public void exibir() {
        System.out.println("Funcionário: " + nome);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}