import javax.swing.JOptionPane;
public class SomaDoisNumerosGrafica{
    static public void main(String [] abc){
        double a, b, resultado;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));

        resultado = a + b;

        JOptionPane.showMessageDialog(null, "O valor é: "+resultado);
    }
}