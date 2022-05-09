public class SomaMatriz {
    public static void main(String[] args) {
        int numero = 10;
        int vetor[]={3,7};
        int matriz [][]={{1,7},{-3,8}};
        

        System.out.println(numero);

        for(int i=0; i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        for(int linha=0; linha <matriz.length; linha++){
            for(int coluna=0;coluna<matriz[0].length; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
        }
    }
    
}