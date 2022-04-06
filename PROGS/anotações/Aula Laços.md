
==> Continuar com laço for


Exercício:

1. Elaborar um programa em Java que exibe na tela 
a tabuada de um número e dos dois números posteriores.


2. Elaborar um programa que exibe na tela o fatorial 
de um número.

n! = n * n-1 * n-2 * ... 1

5! = 5 * 4 * 3 * 2 * 1


Obs.: Testar com o valor 15



5 x 0 = 0
5 x 1 = 5
...
5 x 10 = 50

0, 1, 2 ... 10


*********************************
Laços aninhados/encadeado

for (int i=0 ;;) {

  for(int j=0 ;;) {
  }

}

Fatorial

int n = 5;

n! = 5 * 4 * 3 * 2 * 1

4 , 3, 2 , 1

1, 2, 3, 4


10!

**********************************************

Próxima aula 30/03/2022

-Corrigir exercício fatorial
-Entrar com laço while
-Comando break

Fatorial

5! = 5 x 4 x 3 x 2

int n = 5;

4 x 3 x 2

for ( int i=n-1 ; i >= 2; i-- )


int n = 5;
long fat = n;

for ( int i=2 ; i<n ; i++ ) {
    fat = fat * i;
}

Operadores aritméticos de atribuição
+=  -->  fat = fat + i --> fat += i
-=  -->  fat = fat - i --> fat -= i
*=  -->  fat = fat * i --> fat *= i
/=  -->  fat = fat / i --> fat /= i
%=  -->  fat = fat % i --> fat %= i


** Laços
- for
Quando sabemos previamente a quanti-
dade de repetições.

- while
Quando nãio sabemos previamente 
a quantidade de repetições.

int i=1;

while (i <= 10) {
   System.out.println(i);
}


-5! = ?
 0! = 1
import java.util.Scanner;

class Fatorial {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    while (true) {
        System.out.print("Informe um nº positivo);
    	int n = ler.nextInt();
    	long fat = n;
    
    	if (n >= 0) {        
            for ( int i=2 ; i<n ; i++ ) {
              fat *= i;
            }
            System.out.println(n + "! = " + fat);
            break;  
    	}
    }
  }
}


**********************************************

Próxima aula 04/04/2022

-Corrigir exercício fatorial com Laço while

==> Nesse exercício, o usuário informa se deseja ou não continuar a calcular o fatorial de um novo número.

-Variável do tipo char e método da classe String charAt(0)

-Comparação entre Strings com equals()

* Lista de exercícios de Laços

***********************************************************

Deseja continuar? [s/n]:

Tipo char

char letra = 's';

String ==>  " " aspas		==>	aspas dupla		

char   ==>  ' ' apóstrofo	==>	aspas simples

Deseja continuar? [s/n]:

char op = ler.next();


** Métodos da classe String

- charAt(n) --> retorna o caracter da posição especificada

- equals()  --> fazer a comparação de igualdade entre strings


String nome = "maria";

// char letra = nome.chatAt(2);
 
if (!nome.equals("maria")) {

}


Operadores lógicos

&&	and	e
||	or	ou
!	not	não

Booleano ==>  George Boole

int n = 10;

if (!(n == 1))	==> V



Operadores relacionais 
[Comparação somente entre tipos primitivos]

>
>=
<
<=
==
!=


** Tipos primitivos
boolean
char
byte
short
int
long
float
double

String






** Simulação de autenticação

Usuário: Mickey
Senha:   abc123

String nomeCadastrado = "Mickey"
String senhaCadastrada = "123"


** Série de Fibonacci

1 1 2 3 5 8 13 ...

Número aureo: 1,618

















