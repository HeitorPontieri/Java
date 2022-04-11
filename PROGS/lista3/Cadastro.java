import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.print("\nCrie um Login : ");
        String nome = ler.nextLine();
        System.out.print("Crie uma senha : ");
        String senha = ler.nextLine();

        for(int i = 1; i<=3; i++) {
            System.out.print("\nLogin :");
            String nomeLogin = ler.nextLine();
            System.out.print("Senha :");
            String nomeSenha = ler.nextLine();
            
            if (nome.equals(nomeLogin)&& senha.equals(nomeSenha)) {
                System.out.println("Seja bem vindo "  + nomeLogin);
                System.exit(0);
            }
            else {
                if(i >=4 ){
                    System.out.println("Tu tentou demais e o sistema bloqueou o teu login irmaozinho");
                    System.exit(0);
                }
                else{
                    System.out.println("Irmaozinho, alguma coisa ai ta errada, tente novamente");
                }
            }
    
        }


    }
    
}