package exercicio5;

import java.util.List;

public class Funcionario extends Pessoa{
    private String cargo;
    private List<Emprestimo> emprestimos;

    

    public Funcionario(String cargo) {
        setCargo(cargo);
    }

    public Funcionario(int codigo, String nome, String email, String telefone, String documento, String cargo, List<Emprestimo> emprestimos) {
        super(codigo, nome, email, telefone, documento);
        setCargo(cargo);
        setEmprestimos(emprestimos);
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void guardar(){

    }

    public void carregar(){

    }

    public void listar(){

    }

}
