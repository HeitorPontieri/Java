
package com.mycompany.mavenproject1;

public class Conta {
     /* DECRARAÇÃO DOS ATRUBTOS
        
        1 - Vidibilidade
            1.1 - Public
            1.2 - Protected
            1.3 - Private
        2- tipo do dado
        3- Nome
        4 - Valor(Opcional)
  
    */
    
    private String agencia = "ag-123";
    private String conta = "1234-5678";
    private double saldo = 10000;
    
    /*DECLARAÇÃO DOS MÉTODOS DE GET: */
    
    /*Método getAgencia*/
    
    public String getAgencia(){
     return agencia;   
    }
    
    /*Método getConta*/
    public String getConta(){
        return conta;
    }
    /*Método getSaldo*/
    public double getSaldo(){
        return saldo; 
    }
    /*DECLARAÇÃO DOS MÉTODOS DE SET:*/
    
    /*Método setAgencia*/
    public void setAgencia(String agencia){
       this.agencia = agencia;
    }
    /* Método setConta*/
   public void setConta(String conta){
       this.conta = conta;
   }
   /*Método setSaldo*/
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   
}
