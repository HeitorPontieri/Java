import java.util.Scanner;
import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Quantidade de valores para Fibonacci");
            int num = ler.nextInt();
            if (num <2) {
                System.out.print("1");
                System.exit(0);
            }
            long num1 = 1;
            long num2 = 1;
            System.out.print("1\t1\t");

            for (long i=0; i<num-2; i++){
                long num3 = num1 + num2;
                System.out.print(num3 + "\t");
                System.out.print("**" + (double)num2/num1 + "\t");
                num1 = num2;
                num2 = num3;
            }
        }   
}