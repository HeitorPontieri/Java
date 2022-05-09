

public class Soma_de_Matriz {
    public static void main(String[] args) {
        double a[][]={{1,8},{2,0}};
        double b[][]={{-7,2},{4,8}};
        double c[][]= new double [2][2];
        somarMatriz(a,b,c);

        for(int linha=0; linha<c.length; linha++){
            for(int coluna=0; coluna<c[0].length; coluna++){
               System.out.print(c [linha][coluna]+ "\t");
            }
            System.out.println();

        }
    }
    public static void somarMatriz(double m1[][], double m2 [][], double soma [][]){
        for(int linha=0;linha<m1.length; linha++){
            for(int coluna=0; coluna<m1[0].length; coluna++){
                soma[linha][coluna]= m1[linha][coluna] + m2 [linha][coluna];
            }
        }
    }
}


// Primeira passagem dos laços                      c = [-6] [10]
//linha = 1
//coluna = 2
//c[0][1] = a[0][1]+ b[0][1]