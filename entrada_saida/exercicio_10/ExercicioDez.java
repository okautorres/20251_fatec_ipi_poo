import java.util.Scanner;
public class ExercicioDez{
    public static void main(String [] args){
        double custo, resultado;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica:");

        custo = leitor.nextDouble();

        resultado = ((custo*28)/100)+((custo*45)/100)+custo;

        System.out.println("O Custo final ao consumidor é:"+resultado);
        
    }
}