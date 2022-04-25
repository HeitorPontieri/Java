import javax.swing.JOptionPane;

public class PotJp {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        String numeroString = jp.showInputDialog(null, "Informe um numero");

        String numero2String = jp.showInputDialog(null, "Informe outro numero");

        double num1 = Double.parseDouble(numeroString);
        double num2 = Double.parseDouble(numero2String);

        double pow1 =  Math.pow (num1, 5);
        double pow2 =  Math.pow (num2, 5);

       

        jp.showMessageDialog (null,"O resultado do potenciacao do primeiro numero escolhido foi : " + Math.pow(num1,5));
        jp.showMessageDialog (null, "O resultado da potenciacao do segundo numero escolhido foi : " + Math.pow(num2, 5));



        
        
    }
    
}