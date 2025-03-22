package exercicio5;

import java.time.LocalDate;

public class Emprestimo {
    private int codigo;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevisto;
    private LocalDate dataDevolvido;
    private int multa;
    private String situação;
    private Funcionario funcionario;
    private Leitor leitor;
    private Copia copia;

    public Emprestimo(){}

    public Emprestimo(int codigo, LocalDate dataEmprestimo, LocalDate dataPrevisto, LocalDate dataDevolvido, int multa,
            String situação, Funcionario funcionario, Leitor leitor, Copia copia) {
        setCodigo(codigo);
        setDataEmprestimo(dataEmprestimo);
        setDataPrevisto(dataPrevisto);
        setDataDevolvido(dataDevolvido);
        setMulta(multa);
        setSituação(situação);
        setFuncionario(funcionario);
        setLeitor(leitor);
        setCopia(copia);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevisto() {
        return dataPrevisto;
    }

    public void setDataPrevisto(LocalDate dataPrevisto) {
        this.dataPrevisto = dataPrevisto;
    }

    public LocalDate getDataDevolvido() {
        return dataDevolvido;
    }

    public void setDataDevolvido(LocalDate dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    public void cadastrar(){

    }

    public void carregar(){
        
    }

    public void devolver(){
        
    }

    public void listar(){
        
    }
    

}
