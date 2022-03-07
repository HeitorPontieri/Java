import javax.swing.JOptionPane;

public class Dolar {
    public static void main(String[] args) {
        JOptionPane eu = new JOptionPane();

        String dolarzito = eu.showInputDialog(null, "Quantos dolares deseja converter em reais?");

        double real = Double.parseDouble(dolarzito);

        double conv = real * 5.04;

        eu.showMessageDialog(null, "Voce tera "+ conv +" reais convertendo do dolar");
    }
    
}