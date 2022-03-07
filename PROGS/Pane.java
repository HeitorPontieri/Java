import javax.swing.JOptionPane;

public class Pane {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

    String Pane= jp.showInputDialog(null, "Quantos % voce ama o Pou")  ;

    jp.showMessageDialog(null, "Voce ama" + Pane + "% o pou =)");
    }
}