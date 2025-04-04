
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Consulta extends Agenda {
    private String motivo;
    private String historico;
    private Paciente paciente;
    private Medico medico;
    private Exame exame;
    private Receita receita;

    public Consulta() {
        
    }

    

    public Consulta(String motivo, String historico, Paciente paciente, Medico medico, Exame exame, Receita receita) {
        setMotivo(motivo);
        setHistorico(historico);
        setPaciente(paciente);
        setMedico(medico);
        setExame(exame);
        setReceita(receita);
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Receita getReceita() {
        return receita;
    }



    public void setReceita(Receita receita) {
        this.receita = receita;
    }



    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void marcar(Paciente paciente, Medico medico, String motivo, String historico) {

        setPaciente(paciente);
        setMedico(medico);
        setMotivo(motivo);
        setHistorico(historico);
        setData(LocalDate.now());  
        setHora(LocalTime.now().withNano(0)); 

        System.out.println("Consulta marcada com o Dr. " + medico.getNome() +
                        " para o paciente " + paciente.getNome() +
                        " no dia " + getData() + " às " + getHora() + "." +
                        "\nMotivo: " + getMotivo() + "\nHistórico: " + getHistorico()+ "\n");
    }


    public void cancelar() {
            System.out.println("A consultas de "+ paciente.getNome()+ " com "+ medico.getNome()+" foi cancelada." +"\n");
            setMotivo(null);
            setHistorico(null);
            setPaciente(null);
            setMedico(null);
            setExame(null);
            setReceita(null);
    }


    public void consultar() {
        try {
            super.consultar(); //polimorfismo dinamico
            System.out.println("Consulta com o Dr. " + medico.getNome() +
            " no dia " + getData() + " às " + getHora() + "." +
            "\nMotivo: " + getMotivo() + "\nHistórico: " + getHistorico() + "\n");
        } catch (Exception e) {
            System.out.println("Não existe esta consulta \n");
        }

    }


    public void realizar() {
        System.out.println("Consulta realizada com o " + medico);
    }


    public void atualizar(Paciente paciente, Medico novoMedico, String novoMotivo, String novoHistorico) {
        System.out.println("Consulta com o Dr. " + medico.getNome() +
        " no dia " + getData() + " às " + getHora() + "." +
        "\nMotivo: " + getMotivo() + "\nHistórico: " + getHistorico() + "\n");
        setMedico(novoMedico);
        setMotivo(novoMotivo);
        setHistorico(novoHistorico);
        System.out.println("Consulta atualizada.");
        System.out.println("NOVA Consulta com o Dr. " + medico.getNome() +
        " no dia " + getData() + " às " + getHora() + "." +
        "\nMotivo: " + getMotivo() + "\nHistórico: " + getHistorico() + "\n");
    }

}
