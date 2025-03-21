public class Receita extends Procedimento {

    public Receita(String descritivo) {
        super(descritivo);
        System.out.println("Receita preescrita");
        
    }
    public void preescrever(String descritivo){
            setDescritivo(descritivo);
    }

}
