
public class Teste {
    public static void main(String[] args) {
        Consulta con1 = new Consulta();
        Consulta con2 = new Consulta();
        Medico med1 = new Medico("joao pedro", "9532-213", "joao@123", "42.512.33", "ortopedista");
        Medico med2 = new Medico("gabriel ass", "325-125", "gab@123", "23.532.11", "cirurgiao");
        Paciente pac1 = new Paciente("kauan", "46363462", "9251-2512", "Masculino", 20);
        Paciente pac2 = new Paciente("afonso", "654345", "2647-12465", "Masculino", 66);
        pac1.cadastrar();
        pac2.cadastrar();
        pac1.consultar();
        con1.marcar(pac1, med1, "Dor de cabeça", "teste");
        con2.marcar(pac2, med2, "Inchaço no abdome", "aaa");
        con1.consultar();
        con1.cancelar();
        con1.consultar();
        con2.atualizar(pac2, med1, "Quis trocar de medico", null);       
        Receita receita = new Receita("febre amarela");
        receita.preescrever("medicamento para febre");
        receita.consultar();
        Exame exame = new Exame("ultrassonografia");
        exame.consultar();
    }

}
