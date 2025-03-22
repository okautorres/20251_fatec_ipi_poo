package exercicio5;

import java.util.List;

public class Leitor extends Pessoa {
    private CategoriaLeitor categorialeitor;
    private List<Reserva> reservas; 
    private List<Emprestimo> emprestimos;

    public Leitor() { }

    public Leitor(int codigo, String nome, String email, String telefone, String documento,CategoriaLeitor categorialeitor, 
    List<Reserva> reservas, List<Emprestimo> emprestimos) {
        super(codigo, nome, email, telefone, documento);
        setCategorialeitor(categorialeitor);
        setReservas(reservas);
        setEmprestimos(emprestimos);
    }
    

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public CategoriaLeitor getCategorialeitor() {
        return categorialeitor;
    }

    public void setCategorialeitor(CategoriaLeitor categorialeitor) {
        this.categorialeitor = categorialeitor;
    }



    public void guardar(){

    }
    
    public void carregar(){

    }

    public void listar(){

    }
}
