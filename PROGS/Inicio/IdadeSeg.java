class IdadeSeg {
	public static void main (String args[]){

	double idade = 15;
	
	double idadeDias = 365 * idade;
	
	double idadeHoras = 24 * idadeDias;

	double idadeMin = 60 * idadeHoras;

	double idadeSeg = 60 * idadeMin;

	System.out.print ("O resultado da sua idade em segundos sera :" + idadeSeg);
}
}
