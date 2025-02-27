import java.util.Scanner;
public class SomaDoisNumeros{
    static public void main(String [] abc){
        // Declaração de váriaveis 
        Scanner leitor = new Scanner(System.in);
        int a, b;
        int resultado;
        //Entrada de dados
        System.out.println("Digite o primeiro número:");
        a = leitor.nextInt();
        System.out.println("Digite o segundo número:");
        b = leitor.nextInt();
        //Processamento
        resultado = a + b;
        //Saída de dados
        System.out.printf("%d + %d = %d \n", a, b, resultado);
    }
}