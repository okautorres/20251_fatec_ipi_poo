import java.util.Date;

public class Pagamento {
    private static int contadorId = 1;
    private int id;
    private Date data;
    private float valor;
    private String status;
    private Matricula matricula;

    public Pagamento(float valor, Matricula matricula) {
        setId(contadorId++);
        setData(new Date());
        setValor(valor);
        setStatus("Pago");
        setMatricula(matricula);
    }

    public String verificarStatus() {
        return status;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Pagamento.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}