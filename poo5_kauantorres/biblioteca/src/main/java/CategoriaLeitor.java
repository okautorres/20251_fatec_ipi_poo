public class CategoriaLeitor {
    private int codigo;
    private String nome;
    private int dias;

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) throws Exception {
        if(dias<7){
            throw new Exception("A quantidade de dias deve ser maior ou igual a 7!");
        } else {
            this.dias = dias;
        }
    }

    public CategoriaLeitor() {}

    public CategoriaLeitor(int codigo, String nome) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setDias(dias);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome == null || nome.length()<=3){
            throw new Exception("Nome da categoria deve ser informado corretamente!");
        } else {
            this.nome = nome;
        }
    }

    public void mostrar(){
        System.out.println("=========Categoria Leitor===========");
        System.out.println("codigo="+ getCodigo());
        System.out.println("nome="+ getNome());
        System.out.println("dias="+ getDias());
    }



}
