package parte1;

public class Main {
    public static void main(String[] args) {
    FormaGeometrica triangulo = new Triangulo(3,8);
    FormaGeometrica quadrado = new Quadrado(5);
    FormaGeometrica circulo = new Circulo(3);
    FormaGeometrica retangulo = new Retangulo(3, 5);
    triangulo.calculoArea();
    quadrado.calculoArea();
    circulo.calculoArea();
    retangulo.calculoArea();
    }
}
