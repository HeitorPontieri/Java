import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        while (true) {
            
        
        System.out.println("\n Informe um numero positivo\n");

        int n = ler.nextInt();
        long fat = n;
        
        if (n>=1) {
            for(int i=2 ; i<n ; i++){
                    fat *= i;
            }
            System.out.println(n +"! = " + fat);
            System.exit(0);
        }  

        System.out.println("Somente numeros positivos sao aceitos");
    }
  }
}   

 

