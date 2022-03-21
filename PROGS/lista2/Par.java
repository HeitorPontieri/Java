import javax.swing.JOptionPane;

public class Par {
    public static void main(String[] args) {
        
    
    
    JOptionPane sim = new JOptionPane();
    String numString = sim.showInputDialog(null, "Informe um numero");
    
    int numInt = Integer.parseInt(numString);

    if (numInt % 2 == 0) {

        sim.showMessageDialog(null, "O numero informado e par");

    }

    else {
        sim.showMessageDialog(null, "O numero informado e impar");
    }


}
}