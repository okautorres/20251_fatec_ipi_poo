import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String nome;
    private String idioma;
    private int carga;
    private String nivel;
    private float preco;
    private List<Aula> aulas;

    public Curso(int id, String nome, String idioma, int carga, String nivel, float preco) {
        setId(id);
        setNome(nome);
        setIdioma(idioma);
        setCarga(carga);
        setNivel(nivel);
        setPreco(preco);
        this.aulas = new ArrayList<>();
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
}