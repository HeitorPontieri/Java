package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {
      
       
       
        /* DECLARAÇÃO DO OBJETO DE CONTA :*/
        Conta objConta = new Conta();
        
        /*DECLARAÇÃO DO OBJETO DE CONTA*/
        Scanner ler = new Scanner(System.in);
        
        /*MENU DE ACESSO*/
       
        int opcao = 0;
        
        
      
        while(opcao !=4){
        
         System.out.println("ESCOLHA UMA OPÇÃO (DIGITE O NUMERO)");
        System.out.println("1 - VERIFICAR SALDO");
        System.out.println("2 - REALIZAR DEPÓSITO");
        System.out.println("3 - REALIZAR SAQUE");
        System.out.println("4 - SAIR");
         opcao = ler.nextInt();
        switch(opcao){
            case 1 : 
                
                 System.out.println("SALDO ATUAL: " + objConta.verificarSaldo());
                break;
            case 2 : 
                 System.out.println("DIGITE O VALOR DO DEPÓSITO");
            double valor = ler.nextDouble();
                 objConta.realizarDeposito(valor);
                 System.out.println("SALDO ATUAL: " + objConta.verificarSaldo());
                break;

            case 3:
                System.out.println("DIGITE O VALOR DO SAQUE");
                valor = ler.nextDouble();
                objConta.realizarSaque(valor);
               System.out.println("SALDO ATUAL: " + objConta.verificarSaldo());
                break;
            
            case 4 :
                System.out.println("OBRIGADO POR ESCOLHER O NOSSO SISTEMA =) ");
                break;
            
            default :
                System.out.println("OPÇÃO INVÁLIDA!");
//           
            
        } // Fim do Switch
           
        } // Fim do While
         
        
               
        
        /*CHAMADA DE MÉTODO DE SALDO*/
        
        
        /*CHAMADA DE MÉTODO DE DEPÓSITO*/
       
        
        /*CHAMADA DE MÉTODO DE SAQUE*/
        
        

     
        
        
        /* EXIBIÇÃO DOS DADOS DE AGENCIA, CONTA E  SALDO*/
     
//        System.out.println("NUMERO DA AGENCIA: " + objConta.getAgencia());
//        objConta.setAgencia("ag-456");
//        System.out.println("NUMERO DA AGENCIA: " + objConta.getAgencia());
//        
//        System.out.println("NUMERO DA CONTA: " + objConta.getConta());
//        objConta.setConta("8765-4321");
//        System.out.println("NUMERO DA AGENCIA: " + objConta.getConta());
//        
//        System.out.println("SALD DISPONIVEL: " + objConta.getSaldo());
//        objConta.setSaldo(15000);
//        System.out.println("NUMERO DA AGENCIA: " + objConta.getSaldo());


    
    
    }  
}