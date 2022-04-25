import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        while (true) { 
            while (true) {
                System.out.println("Informe um numero positivo");
                int n = ler.nextInt();
            
                if (n== 0) {
                    System.out.println("0! = 1");
                    break;
                }
                long fat = n;

                if (n>=1) {
                    for (int i=2 ; i<n ; i++) {
                        fat*=i;
                    }
                    System.out.println(n + "! = " + fat);
                    break;
                }
                System.out.println("**" + n + " nao eh positivo *** " );
        
            }
                
                System.out.println("\nDeseja continuar? [s/n] : "); 
                String op = ler.next();
                if (!op.equals("sim") && !op.equals("Sim")&&!op.equals("s") && !op.equals("Yes") && !op.equals("yes")) {
                    System.exit(0);
                    
                }
        }
    

  }
}   

 


