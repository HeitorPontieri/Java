
## Primitivos e Complexos

    * Primitivos são as váriaveis que foram criadas e implementadas juntas do java e são os únicos sendo váriaveis em si
    Ex : Int / Double

    * Complexos são as variaveis que foram criadas depois do java ser lançado e não são váriaveis, mas sim classes com métodos e tudo mais.

## Classe

    Toda classe por organização está guardadas em um pacotes, os pacotes agem como pastas para armazenar classe que não são primitivas ao Java

    Ex : import javax.swing.JOptionPane;


## Entrada de dados 

    * Forma gráfica
    É quando aparece um bloquinho para digitação para obter esses dados

    Classe : JOptionPane
    Métodos : showMessageDialog (Saída)
              showInputDialog (Entrada)

                ShowMessageDialog
                * show = Mostrar
                * Message = Mensagem
                * Dialog = Dialógo (Caixa de Dialógo)

                ShowInputDialog
                * show = Mostrar
                * Input = Entrada (Entrada de dados)
                * Dialógo = Dialógo (Caixa de Dialógo)

## Tipos de String (Texto)

    * String literal :  Uma string constituída por letras e caracteres especiais. ex : "Bom dia"
    * String numéricas : Uma string constituida por números, os unicos caracteres que entram nessa string são o ponto (.) e o menos para representar os números negativos (-) ex : "13"
    * String alphanúmerica : Uma string que aceita todo tipo de caractere. ex:"abc %$# 123".

    Códigos especiais para String

\   n --> pular uma linha                                    / --> barra
    \t --> tabulação (parágrafo, um espaço maior para escrever)                       \ --> barra invertida [contra-barra]

    Ex : System.out.println ("\n\n\n\Toca ai\n")



## Classes Associadas Primitvos Java

     Métodos parse -> método de conversão 
           |-> classes associadas (Wrapper)
                
    Dentro de uma classe associada terá um método parse que será usado pra converter os dados de uma variavel para outra
    
    int (inteiro) --> Integer --> parseInteger
    double - (decimal) --> Double --> parseDouble
    byte - (inteiro) -->  Byte --> parseByte
    short - (inteiro) --> Short --> parseShort
    long - (inteiro) --> Long --> parseLong
    float - (decimal) --> Float --> parseFloat 
    
    double = variavel
    Double = classe associada

    Ex : string variavel = "10";
        
        int nInt = Integer.parseInt (variavel);
 
    double = variavel
    Double = classe associada



