public class Exame extends Procedimento{

    public Exame(String descritivo) {
        super(descritivo);
        System.out.println("Exame solicitado");
    }

    public void solicitar(String descritivo){
        setDescritivo(descritivo);
    }

    public void consultar(String nome){
        System.out.println("Esta é sua receita "+ nome);
        super.consultar();
    }
}
