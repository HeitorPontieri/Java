## Variável

    *É um espaço reservado [alocado] na memoria RAM para guardar uma informação de um tipo pré-estabelecido.

    *Tipos de váriaveis em Java

        - Numéricos para inteiros

            -byte  -> só pode guardar números de 8 bits
            -short -> só pode guardar números de 16 bits
            -int  -> só pode guardar números de 32 bits
            -long -> só pode guardar números de 64 bits

        - Númericas decimais

            -float -> só guarda números de 32 bits
            -double -> só guarda números de 64 bits

bit é a menor unidade de informação, pode ser usada por 0 ou 1, como um sim ou não
byte é um grupo de 8 bits

* byte [8 bits]

2 ^ 8 = 256 
256/ 2 = 128

-128...0...127

a variavel byte pode guardar numeros de -128 até 127 (não vai até o 128 positivo pq tem o 0 no meio)

* short [16 bits]

2 ^ 16 = 65536
65536 / 2 = 32768

-32768...0...32767

e assim vai indo, como todos os tipos de variável

## Estrutura de repetição

    laços/loop
    
    -> Em java
        |> - for [para]  ---> É mais adequado utlizar esse laço quando sabemos antecipadamente a quantidade de repetições

            sintaxe :
            for (; ;) {
                System.out.println("OI");
            }
            Entendendo melhor o laço for
            for (expressão de inicialização; expressão de teste; expressão de atualiazação;)
        
            Expressão de inicialização -> Serve para determinar o início da contagem

            Expressão de teste -> Determina o final da contagem

            Expressão de atualizaço -> Determina o passo [razão] da contagem, 

            Toda essa sequência é seguida especificamente nessa ordem

                ex : Progessão aritmética
                        1,4,7,10,13

                            for (int i=1; i <= 13 ;) {
                                System.out.println (i);
                            }
        
        |> - while [enquanto]  --->
        |> - do while
    
* sintaxe : [regras do idioma, as regras que devem ser seguidas na programação]


## Operador de Incremento
 
    ++
    |> Ele adiciona um
        ex : i++ = i+1

## Operador de Decremento
    
    --
    |> Ele subtrai um 
        ex : i-- = i-1
    
