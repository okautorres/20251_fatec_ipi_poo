import java.util.ArrayList;
import java.util.List;

class CategoriaObra {
    private int codigo;
    private String tipo;

    public void guardar() {}
    public void carregar() {}
}

class Obra {
    private int codigo;
    private String titulo;
    private String autores;
    private String editora;
    private int ano;
    private String descritivo;
    private String isbn;
    private CategoriaObra categoria;
    private List<Copia> copias = new ArrayList<>();

    public void guardar() {}
    public void carregar() {}
    public void listar() {}
}

class Copia {
    private int codigo;
    private String situacao;
    private String descritivo;
    private Obra obra; // Associação obra com copia

    public void guardar() {}
    public void carregar() {}
    public void listar() {}
}

class Leitor {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String documento;
    private List<Reserva> reservas = new ArrayList<>();

    public void guardar() {}
    public void carregar() {}
    public void listar() {}
}

class Reserva {
    private int codigo;
    private String dataReserva;
    private String dataPrevista;
    private String situacao;
    private Leitor leitor; // Associação leitor com reserva

    public void cadastrar() {}
    public void cancelar() {}
    public void retirar() {}
}

class Funcionario {
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String cargo;
    private String documento;

    public void guardar() {}
    public void carregar() {}
    public void listar() {}
}

class Emprestimo {
    private int codigo;
    private String dataEmprestimo;
    private String dataPrevisto;
    private String dataDevolvido;
    private double multa;
    private String situacao;
    private Funcionario funcionario; // Associação funcionario com emprestimo
    private Leitor leitor; // Associação leitor com emprestimo
    private List<Copia> copias = new ArrayList<>(); // Composição (se emprestimo é destruido a cópia também)

    public void cadastrar() {}
    public void carregar() {}
    public void devolver() {}
    public void listar() {}
}
