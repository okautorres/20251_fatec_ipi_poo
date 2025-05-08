package parte1;
public class Quadrado implements FormaGeometrica{
    private double altura;

    public Quadrado(double altura) {
        this.altura = altura;
    }

    @Override
    public void calculoArea(){
        double result = altura * altura;
        System.out.println("A area do quadrado é: "+result);
    }
}
