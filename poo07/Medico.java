import java.util.ArrayList;
import java.util.List;

public class Medico extends Funcionario{
    private String crm;
    private String especialidade;
    private static List<Consulta> consultas = new ArrayList<>();

    public Medico() {

    }

    public Medico(String nome, String telefone, String senha, String crm, String especialidade) {
        super(nome, telefone, senha);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void acessar(String nome){ 
        //polimorfismo estatico    
        System.out.println("Um medico acessou a clinica "+ nome);};

    

}
