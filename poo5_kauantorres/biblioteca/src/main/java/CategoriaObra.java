import java.util.ArrayList;
import java.util.List;

class CategoriaObra {
    private int codigo;
    private String nome;

    public CategoriaObra() {}

    public CategoriaObra(int codigo, String nome) throws Exception {
        setCodigo(codigo);
        setNome(nome);
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
        System.out.println("=========Categoria Obra===========");
        System.out.println("codigo="+ getCodigo());
        System.out.println("nome="+ getNome());
    }

    public void guardar() {}
    public void carregar() {}
}
