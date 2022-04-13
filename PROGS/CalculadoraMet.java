import java.util.Scanner;

class CalculadoraMet {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero ");
        double n1 = ler.nextDouble();
        System.out.println("Digite um numero ");
        double n2 = ler.nextDouble();
        
        System.out.println("Qual operacao você deseja que aconteca com esses dois ultimos números, digite 1 para soma, 2 para subtracao, 3 para multiplicacao e 4 para divisao "); 
        double d = ler.nextDouble();
        
        if (d == 1) {
            double resultadoSoma = somar(n1,n2);
            System.out.println("O resultado da soma foi : " +resultadoSoma);
            if (d == 2) {
                double resultadoSub = sub(n1,n2);
                System.out.println("O resultado da subtracao foi : " + resultadoSub);
                if (d == 3 ) {
                    double resultadoMulti = multi(n1,n2);
                    System.out.println("O resultado da multiplicacao foi : " + resultadoMulti);
                    if (d == 4 ) {
                        double resultadoDiv = dividir(n1,n2);
                        System.out.println("O resultado da divisao foi : " + resultadoDiv);   
                    }
                }
            }
            
        }
    }


public static double somar (double n1, double n2){
    
    return n1+n2;
}

public static double dividir( double n1, double n2) {
    return n1/n2;
}

public static double multi (double n1, double n2){
    return n1*n2;
}

public static double sub (double n1 , double n2){
    return n1-n2;
}

}