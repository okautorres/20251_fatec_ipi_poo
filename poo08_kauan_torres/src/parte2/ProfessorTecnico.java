package parte2;

public class ProfessorTecnico implements Professor {
    private String nome;
    private int horasTrabalhadas;
    private String titulacao;

    public ProfessorTecnico(String nome, int horasTrabalhadas, String titulacao) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.titulacao = titulacao;
    }

    @Override
    public void obtemSalario() {
        double salarioBase = horasTrabalhadas * BASE_HORA * 3;
        double adicional = obtemTitulacao();
        double resultadoFinal = salarioBase + adicional;
        System.out.println("O salário do Professor Técnico é: " + resultadoFinal);
    }

    @Override
    public void cargaHoraria() {
        System.out.println("A carga horária do Professor Técnico é: " + horasTrabalhadas);
    }

    @Override
    public double obtemTitulacao() {
        switch (titulacao) {
            case "Mestrado":
                return BASE_HORA * horasTrabalhadas * 0.20;
            case "Doutorado":
                return BASE_HORA * horasTrabalhadas * 0.50;
            case "Graduação":
                return 0;
            default:
                return 0;
        }
    }
}
