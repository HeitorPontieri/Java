import javax.swing.JOptionPane;


public class MaiorJp {
    public static void main(String[] args) {
        JOptionPane eu = new JOptionPane();

        String numS1 = eu.showInputDialog(null, "Infome um numero para comparacao");
        String numS2 = eu.showInputDialog(null, "Informe outro numero para comparacao");

        int num1int = Integer.parseInt(numS1);
        int num2int = Integer.parseInt(numS2);

        if (num1int>num2int) {
            eu.showMessageDialog(null, "O numero informado primeiro é maior que o numero informado depois");
            
        }

        else {
            if (num2int>num1int) {
                eu.showMessageDialog(null, "O segundo numero informado é maior que o primeiro numero informado");    
            }

        }
    }



    
}