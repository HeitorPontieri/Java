# Estrutura de Decisão

    * Precisa decidir algo, como uma catraca de ônibus, se tiver dinheiro suficiente no cartão, a catraca libera já se não tiver dinheiro no bilhete único, a catraca não abre e mostra a mensagem "crédito insuficiente"

[Desvio condicional]

    -> Simples : algo vai acontecer só a ação se for verdadeiro, se ação for falsa, não acontecerá nada, só tem o if

    -> Composta : algo vai acontecer independente da opção escolhida, sendo ela verdadeira ou falsa, tem o if e o else

    -> Aninhada [encadeada] : São varias estruturas de decisão dentro de uma só, são como se fossem um arvore genealógica, onde um pai e uma mãe geram mais filhos e assim vai indo, gerando mais estruturas de decisão. 

        Exemplo :

            Ação financeira -> Cliente 

                Se a conta do cliente estiver positiva -> crédito [positiva] Acima de R$10.000,00 -> tentativa do banco ganhar esse dinheiro
                
                Se a conta do cliente estiver zerada  -> não faz nada, alias essa pessoa não tem nada e nem deve nada
                
                Se a conta do cliente estiver negativa -> débito [negativa] Cobrar maior R$1.000,00 -> o banco vai atras do dinheiro dele, que o cliente está lhe devendo

# Operadores Relacionais [comparação]

    * Eles relacionam variáveis, são como a os operadores matemáticos, mas tem a ver com a comparação entre variavéis ou classes
      
      > -  maior que
      < - menor que
      >= - maior ou igual
      <= - menor ou igual

      == - igualdade
      != - desigualdade [diferença]

# Java

    -> bloco do if {} -> para executar as instruções caso a informação que foi inserida seja VERDADEIRO, pode ser usado sem o else

    -> bloco do else {} -> serve para executar as instruções caso o teste lógico seja FALSO, ele não pode ser usado sem o if, já que o else depende do if 

# Qual a delimitação para idades válidas

    1 ... 120

    * Teste lógico para o limite inferior (1)

    idade >= 1

    * Teste lógico para o limite superior (120)
    idade =< 120

# Para expressões lógicas [Unir dois testes lógicos]

    * Operadores lógicos

        E [and] = & &
        Ou [or] = ||                              | -> pipe
        Não [not] = !!