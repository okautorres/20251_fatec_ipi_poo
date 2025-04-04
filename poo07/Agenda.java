
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Agenda {
    private LocalDate data;
    private LocalTime hora;
    
    public Agenda() {
        this.data = LocalDate.now();
        this.hora = LocalTime.now().withNano(0);
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void consultar(){
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
    }

    
}
