 import javax.swing.JOptionPane;

public class MathScan {
    public static void main(String[] args) {

        JOptionPane eu = new JOptionPane();

        String nume1 = eu.showInputDialog(null, "Informe um número para ser elevado a quinta potencia");

        String nume2 = eu.showInputDialog(null, "Infome outro número para ser elevado a quinta potencia");
        
        double num1 = Double.parseDouble(nume1);
        double num2 = Double.parseDouble(nume2);

        double pow1 = Math.pow(num1, 5);
        double pow2 = Math.pow(num2, 5);

        eu.showMessageDialog(null, "O resultado da potenciacao do primeiro numero foi :" + pow1);

        eu.showMessageDialog(null, "O resultado da potenciacao do segundo numero foi : " + pow2);
    
    }
    
}