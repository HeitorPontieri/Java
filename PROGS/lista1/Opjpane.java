import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
 class Opjpane {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        String numerosString = jp.showInputDialog(null, "Digite um numero, se for colocar decimal, não coloque virgula =)");
        
        String numerosString2 = jp.showInputDialog(null, "Digite um numero se for colocar decimal, não coloque virgula =)P");

       
        double num1 = Double.parseDouble(numerosString);
        double num2 = Double.parseDouble(numerosString2);

        double soma = num1 + num2;
        double sub = num1 - num2;
        double multi = num1 * num2;
        double div = num1 / num2;

        jp.showMessageDialog(null, "O resultado da soma dos dois numeros foi " + soma);
        
        jp.showMessageDialog(null, "O resultado da subtracao dos dois numeros foi " + sub);
        
        jp.showMessageDialog(null, "O resultado da multiplicacao dos dois numeros foi " + multi);
        
        jp.showMessageDialog(null, "O resultado da divisao dos dois numeros foi " + div);


    }
    
}