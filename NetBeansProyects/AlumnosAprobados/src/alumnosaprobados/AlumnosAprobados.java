
package alumnosaprobados;

/**
 *
 * @author Max
 */
public class AlumnosAprobados {

    
    public static void main(String[] args) {
        //declaramos variables
        String NombreAlumno ;
        int NotaAlumno;
        
        //asignamos valor a variables
        NombreAlumno = ("Maximo Franzoni");
        NotaAlumno = 6;
        
        //arranca el programa
        System.out.println("Hola " +NombreAlumno);
        System.out.println("Tu nota es " +NotaAlumno);
        
        //chequeamos si aprobo o no
        if(NotaAlumno >= 6){
         System.out.println("Felicitaciones " +NombreAlumno);  
         System.out.println("Usted aprobo con un " +NotaAlumno);
         } else{
          System.out.println("Uy lo sentimos " +NombreAlumno);  
          System.out.println("Usted no aprobo. Intentelo nuevamente");
        }
            
    }
    
}
