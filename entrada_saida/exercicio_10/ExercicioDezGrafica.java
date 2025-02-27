import javax.swing.JOptionPane;
public class ExercicioDezGrafica{
    public static void main(String [] args){
        double custo, resultado;

        custo = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica:"));


        resultado = ((custo*28)/100)+((custo*45)/100)+custo;

        JOptionPane.showMessageDialog(null, "O Custo final ao consumidor é:"+resultado);
        
    }
}