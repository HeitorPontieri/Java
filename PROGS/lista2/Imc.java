package lista2;

import java.util.Scanner;

public class Imc {
        public static void main(String[] args) {
            
        }

		public static void main(String[] args) {
		    Scanner ler = new Scanner (System.in);
		
		    while (true) {
		        System.out.println("Informe um numero positivo");
		            int n = ler.nextInt();
		
		        for (int i = 1; n>=1; i++){
		            long e = (i + i/n)^ n;
		            
		            System.out.println(e);
		        
		        }
		        break;
		    
		    }
		
		}    
}