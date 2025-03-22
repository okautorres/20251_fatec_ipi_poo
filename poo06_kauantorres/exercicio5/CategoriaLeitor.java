package exercicio5;

public class CategoriaLeitor extends Categoria{
    private int dias;

    public CategoriaLeitor() {
    }

    public CategoriaLeitor(int codigo, String nome, int dias) {
        super(codigo, nome);
        setDias(dias);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }


}
