package parte2;

public class ProfessorGraduacao implements Professor {
    private String nome;
    private int horasTrabalhadas;
    private String titulacao;


    public ProfessorGraduacao(String nome, int horasTrabalhadas, String titulacao) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.titulacao = titulacao;
    }


    @Override
    public void obtemSalario() {
        double salarioBase = horasTrabalhadas * BASE_HORA * 4;
        double adicional = obtemTitulacao();
        double resultadoFinal = salarioBase + adicional;
        System.out.println("O salário do professor de graduação é: " + resultadoFinal);
    }


    @Override
    public void cargaHoraria() {
        System.out.println("A carga horária do professor de graduação é: " + horasTrabalhadas);
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
