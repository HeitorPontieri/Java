import java.util.Scanner;

class CalcArea {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        while (true) {
            
        

        System.out.println("Caso deseje a area do circulo, coloque 0 na altura e base");
        
        System.out.println("Digite a base: ");
        double n1 = ler.nextDouble();
        System.out.println("Digite a altura: ");
        double n2 = ler.nextDouble();
        System.out.println("Digite o raio: ");
        double n3 = ler.nextDouble();
        
        
        System.out.println("Qual operacao voce deseja? digite 1 para a area do quadrado, 2 para area do retangulo , 3 para area do circulo e 4 para area do triangulo "); 
        double d = ler.nextDouble();
        
        if (d == 1) {
            double resultadoQuad = quad(n1,n2);
            System.out.println("A area do quadrado e : "+resultadoQuad );
        }
        if (d == 2) {
                double resultadoRet = ret(n1,n2);
                System.out.println("A area do retangulo e : " + resultadoRet);
        }

        if (d == 3 ) {
                    double resultadoCirculo = circulo(n3);
                    System.out.println("O resultado da multiplicacao foi : " + resultadoCirculo);
        }
        if (d == 4 ) {
                        double resultadoTri = tri(n1,n2);
                        System.out.println("O resultado da divisao foi : " + resultadoTri);   
        }
    
    
        System.out.println("Deseja continuar? [sim/nao]");
        String decisao = ler.next();
        if (decisao.equalsIgnoreCase("sim")) {}
        else{
            System.exit(0);
        }
    }
    }
public static double quad (double n1, double n2){
    return n1*n1;
}
public static double ret( double n1, double n2) {
    return n1*n2;
}
public static double circulo (double n3){
    return 3.14 *(n3*n3);
}
public static double tri (double n1 , double n2){
    return (n1*n2)/2;
}

}