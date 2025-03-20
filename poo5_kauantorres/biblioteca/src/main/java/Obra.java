public class Obra {
    private int codigo;
    private String titulo;
    private String autores;
    private String editora;
    private int ano;
    private String descritivo;
    private String isbn;
    private List<Copia> copias = new ArrayList<>();

    public Obra() {
    }


    public void mostrar() {
        String msg =  "Obra{" +
                "codigo=" + getCodigo() +
                ", titulo='" + getTitulo() + '\'' +
                ", autores='" + getAutores() + '\'' +
                ", editora='" + getEditora() + '\'' +
                ", ano=" + getAno() +
                ", descritivo='" + getDescritivo() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                '}';
        System.out.println(msg);
    }

    public Obra(int codigo, String titulo, String autores, String editora, int ano, String descritivo, String isbn) throws Exception {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutores(autores);
        setEditora(editora);
        setAno(ano);
        setDescritivo(descritivo);
        setIsbn(isbn);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        if(titulo==null || titulo.length()<6){
            throw new Exception("Informe um titulo correto!");
        }
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void guardar() {}
    public void carregar() {}
    public void listar() {}
}
