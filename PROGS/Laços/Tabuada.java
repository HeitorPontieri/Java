
public class Tabuada {
public static void main(String[] args) {
    
    int num1 = 1;
    
    for (int num2=0; num2<=10; num2++){
        System.out.println(num1 + "X" + num2 + "=" + num1 * num2);
       
    }
    System.out.println("------------------//--------------");
    for (int num2=0; num2<=10; num2++){
        System.out.println((num1 + 1) + "X" + num2 + "=" + (num1 + 1) * num2);
       
    }
    System.out.println("------------------//--------------");
    for (int num2=0; num2<=10; num2++){
        System.out.println((num1+2) + "X" + num2 + "=" + (num1 + 2) * num2);
       
    }
    System.out.println("------------------//--------------");
    }


    
}