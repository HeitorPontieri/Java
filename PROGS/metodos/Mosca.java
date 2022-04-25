import java.util.Scanner;

public class Mosca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero");
        double pot1 = ler.nextDouble();

        double potencia1 = Math.pow(pot1, 5);
        
        System.out.print(potencia1);
    
    }
}