import javax.swing.JOptionPane;

public class Dez {
    
    public static void main(String[] args) {
        
    
    JOptionPane eu = new JOptionPane();

    String nString = (eu.showInputDialog(null, "Manda um numero ai fiote"));

    int numint = Integer.parseInt(nString);

    if (numint > 10 ){
        eu.showMessageDialog(null, "Esse numero ai e maior que 10 viu, toma cuidado");

    }
    else {
        eu.showMessageDialog(null, "Ih rapaiz, essa bomba ae e menor que 10");
    }

    if (numint == 0) {
            eu.showMessageDialog(null, "Essa budeguinha ai nao entra la nem ca, e um belo zero");            
        }
    


}
     

} 