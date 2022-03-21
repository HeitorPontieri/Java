import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe um numero");
        int numero1 = ler.nextInt();
        
        System.out.println ("Informe outro número"  );
        int numero2 = ler.nextInt();

        
        int soma = numero1 + numero2;
        int sub = numero1 - numero2;
        int multi = numero1 * numero2;
        int div = numero1/numero2;


        System.out.println("O resultado da soma dos dois numeros informados foi :" + soma);
        System.out.println("O resultado da subtração dos dois numeros informados foi :" + sub);
        System.out.println("O resultado da multiplicação dos dois numeros informados foi :" + sub);
        System.out.println("O resultado da divisão dos dois numeros informados foi :" + div);



    }
    
}