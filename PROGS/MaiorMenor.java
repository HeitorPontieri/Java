import javax.swing.JOptionPane;



public class MaiorMenor {

    public static void main(String[] args) {
         JOptionPane sim = new JOptionPane();

         String idadeString = sim.showInputDialog(null, "Quantos anos vc tem lek?");

         int idadeInt = Integer.parseInt(idadeString);

         if (1 =< idadeInt & idadeInt > 13 ) {
                sim.showMessageDialog(null, "Ih ala, para pf, vc nao tem mais idade pra ficar jogando esse fortnite mano");


         }
         else {
            sim.showMessageDialog(null, " Dessa vez vc passou, mas ja vai tomando jeito e vai saindo desse mundo de fortnite ein");
         }

    }

    
    
}