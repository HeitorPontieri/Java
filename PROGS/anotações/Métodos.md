# Métodos
    |> Os Métodos desempenham uma só ação, sem poder fazer outras 

    - main()  [principal] --> Serve para iniciar a execução do código
                |>- é o único método que é obrigado a ter no código 

    - print() -> Mostrar na tela

    - pow() ->  Potenciação

    - sqrt() -> Raiz quadrada

    - next() -> Ler o que foi recebido pela variavel

# ==>Criação de métodos

    *É para uma melhor organização no código, além de que nem todos os métodos que vamos precisar durante nossa vida de dev existem dentro do java
     
    Ex: método main
    |> public static void main (String args[])

    public - > Modificador de acesso [visibilidade] -> é a primeira coisa que precisa ser especificada na criação de um método
                |> tipos de modificador de acesso
                    |> public -> [público] -> todos podem usar
                    |> private -> [privado] -> ninguém pode usar
                    |> default -> [padrão] -> é o padrão, quando não se coloca nada
                    |> protected -> [protegido] -> é um método protegido
                
    static [estático] -> não é obrigatório no método, além de ser também outro modificador de acesso

    void -> Tipo de retorno -> o que retorna pelo método, como algum dado 
            |> tipos de retorno
                |> void -> [vazio] -> todo tipo de retorno que não retorna nada é tipo void, 
                |> int -> retorna como int
                |> double -> retorna como double
                |> Objeto [classe] 

    main -> O nome do argumento  
    
    (String args[]) -> String -> tipo da váriavel
                        args -> onde vai ser guardada essa váriavel


    *Exemplo :
    class Calculadora {
        public static void main(String args[]) {
            
            double n1 = 10
            double n2 = 5.5
            somar()

        }
    }

    public static double somar (double n1, double n2){
        return (n1+n2);
    }

    
    
    **Exercício : Implementem uma calculadora em Java que efetua as quatro operações algébricas usando método para cada operação,
                  sendo que cada um deste métodos recebem e retornam um double
