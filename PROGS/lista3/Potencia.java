import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base = 0;
        int expoente =0;

        while(true){
            System.out.println("\nDigite o valor de uma base maior que 0");
            base =ler.nextInt();
            System.out.println("\nDigite o valor do expoente maior que 0");
            expoente = ler.nextInt();
            if (base  >=0 && expoente >=0 ) {
                break; 
            }
        }

        long pot = base;

        if (expoente == 0) {
            System.out.println(base + "^" + expoente + "= 1");
            System.exit(0);            
        }

        for(int i=1 ; i<expoente ; i++){
            //pot = pot * base
            pot*=base;
        }
        
        System.out.println(base +"^ " + expoente + "="+ pot);
        
    }

    
}