import java.time.LocalDate;

public abstract class Procedimento {
    private LocalDate data;
    private String descritivo;

    public Procedimento(String descritivo) {
        data = LocalDate.now();
        setDescritivo(descritivo);
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void consultar(){
        System.out.println("Data: "+ data +"\n"+
            "Procedimento: "+ descritivo);
    }

    
}


