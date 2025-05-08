package parte2;

public class Estagiario implements Colaborador{
    private String nome;
    private int horasTrabalhadas;

    public Estagiario() {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void obtemSalario() {
            double result = BASE_HORA  * horasTrabalhadas;
        System.out.println("O salário do estagiário é: "+result);
    }

    @Override
    public void cargaHoraria(){
        System.out.println("A carga horária do estagiário é: "+horasTrabalhadas);
    }
}
