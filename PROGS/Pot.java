import javax.swing.JOptionPane;

public class Pot {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        String numeroString = jp.showInputDialog(null, "Informe um numero");

        String numero2String = jp.showInputDialog(null, "informe outro numero");

        int numero1 = Integer.parseInt(numeroString);
        int numero2 = Integer.parseInt(numero2String);

        int raiz1 = Math.pow(numero1, 5);
        int raiz2= Math.pow(numero2, 5);

        jp.showMessageDialog(null, "O resultado da potenciacao sera :" + raiz1 );
        jp.showMessageDialog(null, "O resultado da potenciacao do segundo numero sera :" +raiz2);


        
    }
    
}