import java.util.Scanner;



public class Scanner {
    public static void main(String args[]) {
            Scanner ler = new Scanner(System.in);
            
            System.out.print("\nInforme seu ano de nascimento");

            int anoNasc = ler.nextInt();

            int idade = 2022 - anoNasc;

            System.out.println("\n\t\n Voce tem " + idade + " anos");
        
    }
    
}