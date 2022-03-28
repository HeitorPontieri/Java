import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.println("\n Informe um numero\n");

        int n = ler.nextInt();
        int Fat = 1;
        

        for(int i = 1; i<=n; i++){ 
            System.out.println (Fat = Fat * i);
        }
    }
}