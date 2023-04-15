
package ejercicio6;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        
        //creamos variables para todos los ejercicicios
        int tEmperatura;
        boolean hAcesol;
        boolean nEvado;
        
        //ejercicio 1
        tEmperatura = 27;
        if (tEmperatura > 25){
        System.out.println("A la playa!!!");
        }
        
        //ejercicio 2
        hAcesol = true;
        if (hAcesol){
        System.out.println("No te olvides la sombrilla");    
        }
        
        //ejercicio 3
        hAcesol = false;
        nEvado = true;
        if (nEvado || hAcesol){
        System.out.println("Que bien!");
        }
        
        //ejercicio 4
        nEvado = true;
        tEmperatura = 25;
        if (nEvado && tEmperatura >= 20 && tEmperatura<= 30){
        System.out.println("No me lo creo");    
        }
        
        //ejercicio 5
        tEmperatura = 32;
        hAcesol = true;
        if (tEmperatura > 0 || tEmperatura < 30 && hAcesol){
        System.out.println("Mejor me quedo en casa");    
        }
        
        //ejercicio 6
        tEmperatura = 32;
        if (tEmperatura > 25){
        System.out.println("A la playa!!!");
        }
        
        //ejercicio 7
        tEmperatura = 10;
        if (tEmperatura <= 25){
        System.out.println("Esperando el buen tiempo...");
        }
        
        //ejercicio 8
        tEmperatura = 10;
        if (tEmperatura > 25){
        System.out.println("A la playa!!!");
        }else {
        System.out.println("Esperando el buen tiempo...");    
        }
        
        //ejercicio 9
        tEmperatura = 10;
        nEvado = true;
        if (tEmperatura > 25){
        System.out.println("A la playa!!!");    
        } else if (tEmperatura > 15){
        System.out.println("A la montaña");    
        } else if (tEmperatura < 5 && nEvado){
        System.out.println("A esquiar!!!");
        } else {
        System.out.println("A dormir!!!");
        }
                  
            
    }
    
}
