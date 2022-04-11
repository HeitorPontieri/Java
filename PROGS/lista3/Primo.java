import java.util.Scanner;
import java.util.Scanner;
public class Primo {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num = 0;
    while (true) {
        System.out.print("\nDigite um numero inteiro maior que 2 : ");
        //int num = ler.nextInt();  não consegue ser lida pelo resto do código, é destruída, precisa ser globa
        num = ler.nextInt();
        if (num>=2) {
            break;        
        }
    }
    for(int i=2 ; i<num/2+1; i++){
        if (num% i == 0) {
            System.out.println("\n" + num + " , esse numero nao eh primo amigo, escolha outro");
            System.exit(0);
        }
        else {
            System.out.println( " , Esse ai eh primo filhao, bela escolha");
            System.exit(0);
        }
    }  
    }
}
