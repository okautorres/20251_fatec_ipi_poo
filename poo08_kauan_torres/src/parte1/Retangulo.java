package parte1;
public class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calculoArea() {
        double result = largura * altura;
        System.out.println("A area do retangulo é: "+result);
    }
}
