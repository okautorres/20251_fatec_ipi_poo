package parte1;
public class Triangulo implements FormaGeometrica{
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void calculoArea(){
        double result = (altura*base)/2;
        System.out.println("A area do triangulo é: "+result);
    }
}
