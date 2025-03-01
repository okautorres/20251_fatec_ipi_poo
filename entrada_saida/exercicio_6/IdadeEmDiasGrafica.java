import javax.swing.JOptionPane;
public  class IdadeEmDiasGrafica{
    public static void main(String[] args){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem ?"));
        int idadeDias = idade*365;
        JOptionPane.showMessageDialog(null, "Sua idade em dias é: "+idadeDias);
    }

}