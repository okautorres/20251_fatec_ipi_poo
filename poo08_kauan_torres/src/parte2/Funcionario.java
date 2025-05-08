package parte2;

public class Funcionario implements Colaborador {
    private String nome;
    private int horasTrabalhadas;


    public Funcionario(String nome, int horasTrabalhadas) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    @Override
    public void obtemSalario() {
        double result = horasTrabalhadas * BASE_HORA * 2;
        System.out.println("O salário do funcionário é: " + result);
    }


    @Override
    public void cargaHoraria() {
        System.out.println("A carga horária do funcionário é: " + horasTrabalhadas);
    }
}
