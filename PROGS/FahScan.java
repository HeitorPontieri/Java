import javax.swing.JOptionPane;
public class FahScan {

    public static void main(String[] args) {
        
        JOptionPane jp = new JOptionPane();
        
        String Temp = jp.showInputDialog(null, "Qual temperatura voce deseja converter?");

        double num = Double.parseDouble(Temp);

        double conv = (9 * num +160)/5;

        jp.showMessageDialog(null,conv + " Graus Fahrenheit");
    }
    
}