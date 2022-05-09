public class Estatistica {
    public static void main(String[] args) {
        
    	double vet[]= new double [args.length];
        
        for (int i=0; i<args.length; i++) {
        	vet[i] = Double.parseDouble(args[i]);
        }
        
        
        System.out.println("Media " + media(vet));
        System.out.println("Menor numero " + menor(vet));
        System.out.println("Maior numero " + maior(vet));
    }

    public static double media(double vet[]) {
        double total = 0;
        for(int i=0;i<vet.length ; i++ ){
            total += vet[i];
        }
        return total / vet.length ;
    }
    public static double menor(double vetor[]) {
    	double menorNumero = vetor[0];
    	for (int i=1; i<vetor.length; i++) {
    		if(menorNumero > vetor[i]) {
    			menorNumero =  vetor[i];
    		}
    	}
    	return menorNumero;
    }
    public static double maior(double vetor[]) {
    	double maiorNumero = vetor[0];
    	for (int i=1; i<vetor.length; i++) {
    		if(maiorNumero > vetor[i]) {
    			maiorNumero =  vetor[i];
    		}
    	}
    	return maiorNumero;
    }	
    
}