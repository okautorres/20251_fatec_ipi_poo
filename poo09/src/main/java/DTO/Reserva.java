package DTO;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private int codigo;
    private LocalDate dataReserva;
    private LocalDate dataPrevista;
    private String situação;
    private List<Obra> obras;
    private Leitor leitor;

    public Reserva(){}

    public Reserva(int codigo, LocalDate dataReserva, LocalDate dataPrevista, String situação, List<Obra> obras,
            Leitor leitor) {
        setCodigo(codigo);
        setDataReserva(dataReserva);
        setDataPrevista(dataPrevista);
        setObras(obras);
        setLeitor(leitor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void cadastrar(){

    }

    public void cancelar(){

    }
    
    public void retirar(){

    }

}
