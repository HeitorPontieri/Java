import java.util.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ExercicioArray {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("Digite um número inteiro [n > 1] : ");
            num = ler.nextInt();
            if (num>1) {
                break;
            } 
        }
        for(int i=2; i<num/2+1; i++){
            if(num%i == 0){
                lista.add(i);
            }
        }
        if (lista.size()>0) {
            System.out.println(num + "não é primo, pois é divisivel por :");
            for(int i =0 ; i<lista.size(): i++){
                
                System.out.println(lista.get(i) + "\t");
            } 
        
        }
        else{
            System.out.print(num + "é primo")
        }
    }     
}


