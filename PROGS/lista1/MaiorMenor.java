import javax.swing.JOptionPane;



public class MaiorMenor {

    public static void main(String[] args) {
         JOptionPane sim = new JOptionPane();

         String idadeString = sim.showInputDialog(null, "Quantos anos vc tem lek?");

         int idadeInt = Integer.parseInt(idadeString);

         if (-1 < idadeInt & idadeInt <= 120 ) {
                sim.showMessageDialog(null, "Parabens, vc esta vivendo agora =)");


         }
         else {
            sim.showMessageDialog(null, " Vc nao existe seu tosco, volta pra tumba =0");
         }

         if (17 <idadeInt) {
             sim.showMessageDialog(null, "Olha, a principesa tambem pode dirigir ja");

         }

         else {
            sim.showMessageDialog(null, "e fio, vc ta vivo ou nao e so pode andar no lado do passageiro");
         }

    }

    
    
}