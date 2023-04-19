
package franzoni.ejerciciovocales1904;

import java.util.Scanner;

public class FranzoniEjercicioVocales1904 {

    public static void main(String[] args) {
        
        //creamos metodo
        Scanner verletra = new Scanner(System.in);
        
        //creamos variable
        String letra;
        System.out.println("----------------------------");
        System.out.println("--- Escriba una letra : ----");    
        System.out.println("----------------------------");
        
        letra = verletra.nextLine();
        
        //System.out.println(""+letra);
        
            switch(letra){
                //vocales abiertas
                case "a":
                case "e":    
                case "o":
                    System.out.println("La letra elegida " +letra+  " es una vocal y es abierta");
                    break;
                //vocales cerradas
                case "i":
                case "u":
                    System.out.println("La letra elegida " +letra+ " es una vocal y es cerrada");
                    break;
                //no es una vocal  
                default:
                    System.out.println("La letra elegida " +letra+ " no es una vocal");
                    break;        
            }        

    }
    
}
