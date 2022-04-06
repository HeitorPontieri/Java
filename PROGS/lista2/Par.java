import javax.swing.JOptionPane;

public class Par {
    public static void main(String[] args) {
            
    JOptionPane sim = new JOptionPane();
    char op= 's';
    while(op == 's') {
    while (true) {

    String numString = sim.showInputDialog(null, "Informe um numero");
    
    int numInt = Integer.parseInt(numString);

    if (numInt % 2 == 0) {

        sim.showMessageDialog(null, "O numero informado eh par");

    }

    else {
        sim.showMessageDialog(null, "O numero informado eh impar");
    }

    String p = sim.showInputDialog(null, "Deseja continuar? [s/n]");
    if (!p.equals("s") && p.equals("sim")) {
        
    }
    else{
        break;
    }
}
}
}
}