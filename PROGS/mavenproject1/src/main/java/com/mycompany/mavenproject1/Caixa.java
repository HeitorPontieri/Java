package com.mycompany.mavenproject1;


public class Caixa {

    public static void main(String[] args) {
      
       
       //stem.out.println("TESTE");
        /* DECLARAÇÃO DO OBJETO DE CONTA :*/
        Conta objConta = new Conta();
                
     /* EXIBIÇÃO DOS DADOS DE AGENCIA, CONTA E  SALDO*/
     
        System.out.println("NUMERO DA AGENCIA: " + objConta.getAgencia());
        objConta.setAgencia("ag-321");
        System.out.println("NUMERO DA AGENCIA: " + objConta.getAgencia());
        
        System.out.println("NUMERO DA CONTA: " + objConta.getConta());
        objConta.setConta("9876-5432");
        System.out.println("NUMERO DA AGENCIA: " + objConta.getConta());
        
        System.out.println("SALD DISPONIVEL: " + objConta.getSaldo());
        objConta.setSaldo(15000);
        System.out.println("NUMERO DA AGENCIA: " + objConta.getSaldo());
    }
    
    
}