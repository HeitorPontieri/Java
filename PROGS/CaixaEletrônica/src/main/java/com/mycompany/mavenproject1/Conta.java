
package com.mycompany.mavenproject1;

import static java.lang.reflect.Array.get;

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
    /**MÉTODOS FUNCIONAIS DA CLASSE CONTA**/
    
    /*MÉTODO DE VERIFICAR SALDO*/
    public double verificarSaldo(){
        return getSaldo();
    }
    /*MÉTODO DE RELIZAR DEPÓSITO*/
    public void realizarDeposito(double valorDeposito){
      /* 1º FORMA DE ATUALIZAR O SALDO */ 
      // this.saldo = this.saldo + valorDeposito;
      
      /* 2º FORMA DE ATUALIZAR O SALDO */ 
      // this.saldo += valorDeposito;
      
      /* 3º FORMA DE ATUALIZAR O SALDO */ 
      setSaldo(valorDeposito + getSaldo());
    }
    
    /*MÉTODO DE REALIZAR SAQUE*/
    public void realizarSaque(double valorSaque){
        setSaldo(getSaldo()- valorSaque);
        
    }
    
    
    /*MÉTODOS DE GET E SET DA CLASSE CONTA*/
    
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
