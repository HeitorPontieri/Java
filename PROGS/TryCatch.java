import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro");

        try{
            int num = ler.nextInt();
            System.out.println("\n Voce digitou : " + num);
        }
        catch(Exception e){
            System.out.println("Oooops, isso nao me parece um numero inteiro");

        }
        
    }
    
}
