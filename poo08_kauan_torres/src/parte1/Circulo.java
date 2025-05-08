package parte1;
public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calculoArea() {
        double result = Math.PI * raio * raio;
        System.out.println("A area do circulo é: "+result);
    }
}
