 import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Positivo {
    public static void main(String[] args) {

    JOptionPane eu = new JOptionPane();

    String numString = eu.showInputDialog(null, "Digite um numero");

    int numint = Integer.parseInt(numString);

    if (numint>0) {
            eu.showMessageDialog(null, "Esse numero bonitao ai e positivo viu");

            if ( numint = 0) {
                eu.showMessageDialog(null, "Esse numero que tu escolheu é um baita de um zero bem redondinho");

            }       
        
    }

    else {
        eu.showMessageDialog(null, "Ih fio, esse numero ai e negativo, da uma pegada viu");
    }

    }
    
}