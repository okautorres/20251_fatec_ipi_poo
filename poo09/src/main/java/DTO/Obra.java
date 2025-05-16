package DTO;

public class Obra {
    private int codigo;
    private String titulo;
    private String autores;
    private String editora;
    private String ano;
    private String descritivo;
    private String isbn;
    private CategoriaObra categoriaObra;

    public Obra(){}

    public Obra(int codigo, String titulo, String autores, String editora, String ano, String descritivo, String isbn,
            CategoriaObra categoriaObra) {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutores(autores);
        setEditora(editora);
        setAno(ano);
        setDescritivo(descritivo);
        setIsbn(isbn);
        setCategoriaObra(categoriaObra);
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

    public void setTitulo(String titulo) {
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
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

    public CategoriaObra getCategoriaObra() {
        return categoriaObra;
    }

    public void setCategoriaObra(CategoriaObra categoriaObra) {
        this.categoriaObra = categoriaObra;
    }

    public void guardar(){

    }
    
    public void carregar(){

    }

    public void listar(){

    }
    

}
