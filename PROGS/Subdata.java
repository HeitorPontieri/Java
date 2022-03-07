import javax.swing.JOptionPane;


public class Subdata {
    public static void main(String args[]) {
      
        JOptionPane jp = new JOptionPane();

        String anoNascStr = jp.showInputDialog(null, " Qual seu ano de nascimento ");

        int anoNascInt = Integer.parseInt(anoNascStr);

        int anoNascSub = 2022 - anoNascInt;

        jp.showMessageDialog(null, "Voce tem" + anoNascSub + " anos");
    }
    
}