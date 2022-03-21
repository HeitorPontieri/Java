import javax.swing.JOptionPane;



public class MaiorIdade {
    public static void main(String[] args) {
        JOptionPane eu = new JOptionPane();
        String idadeS = eu.showInputDialog(null, "Informe sua idade");
        int idadeInt = Integer.parseInt(idadeS);

        if (1<idadeInt && idadeInt<120){
           
           
            if (idadeInt<18) {
               eu.showMessageDialog(null, "Voce e menor de idade, ja chegou no ensino medio?");
               
           }
           else {
               eu.showMessageDialog(null, "Parabens, voce já acabou a escola, tem mais de 18, ja pode fazer merda pela lei");
           }
        
        }
        else {
            eu.showMessageDialog(null, "Idade invalida");
        }

    }
}