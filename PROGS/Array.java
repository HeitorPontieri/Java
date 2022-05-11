import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>();

        cidades.add("Tegucigalpa");
        cidades.add("Brasilia");
        cidades.add("Cidade da Guatemala");
        cidades.add("Roma");

      //  System.out.println(cidades.get(0));
        //System.out.println(cidades.get(1));
        //System.out.println(cidades.get(2));
        //System.out.println(cidades.get(3));

      //  for(int i=0; i<cidades.size(); i++){
        //   System.out.println(cidades.get(i));
       //faltamelissavictorialacerdaaraujo }
        System.out.println(cidades.get(cidades.size()-1));
        cidades.remove("Brasilia");
        System.out.println(cidades.get(2));
    }
    
}