import java.util.Scanner;
public class L {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		while(true) {
		System.out.println("Faz o L?");
		String decisao = ler.nextLine();
		if(decisao.equals("sim") || decisao.equals("L") || decisao.equals("s")) {
			System.out.println("Faz o L");
		}
		else {
			System.out.println("Seu estranho, torce pro Brasil nao?");
		}
		System.out.println("Deseja fazer o L novamente? [s/n] : ");
		String op = ler.next();
		if(!op.equals("s") && !op.equals("sim") ) {
			System.out.println("Seu esquisito, faca o L seu tanso");
		}
            else{
                System.out.println("Faz o L");  
            }
				System.out.println("to te dando outra chance pra fazer o L, pela terceira vez quer fazer o L? [s/n] : ");
				String op2 = ler.next();
					if(!op2.equals("s") && !op2.equals("sim")) {
							System.out.println("Seu esquisito, faca o L ");
							System.exit(0);	
				}
					else{
						System.out.println("L");
						System.exit(0);

				}
		    }
		
	}
}
