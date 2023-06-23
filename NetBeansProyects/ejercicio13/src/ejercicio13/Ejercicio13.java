
package ejercicio13;


public class Ejercicio13 {

  
    public static void main(String[] args) {
        
        operaciones_padre MSJ1 = new suma();
        MSJ1.intro();
        MSJ1.pedir_datos();
        MSJ1.Operaciones();
        MSJ1.mostrar();
        operaciones_padre MSJ2 = new resta();
        MSJ2.intro();
        MSJ2.pedir_datos();
        MSJ2.Operaciones();
        MSJ2.mostrar();
    }
    
}
