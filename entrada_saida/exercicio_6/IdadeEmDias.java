import java.util.Scanner;
public  class IdadeEmDias{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?"); 
        int idade = scanner.nextInt();
        int idadeDias = idade *365;
        System.out.printf("A idade em dias é: %d\n", idadeDias);

    }

}