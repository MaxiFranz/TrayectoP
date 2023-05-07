
package maxi.agenda;

import java.util.Scanner;


public class MaxiAgenda {

    
    public static void main(String[] args) {
        /*
        Agenda
        Crear vector Nombre,Apellido y teléfono
        Pedir al usuario que cargue su agenda de 5 espacios de memoria
        buscar por apellido en el vector
        mostrar dato completo  si existe en el vector
        
        */
        
        // 1 - creamos metodo para ingreso de datos del tipito
        Scanner teclado = new Scanner(System.in);
        
        // 2 - definimos la cantidad de posiciones de los vectores en un solo lugar
        //se podria definir por teclado la cantidad antes de comenzar...
        //lo hago asi porque para probar todo el codigo es mas facil variar un solo numero
        int c = 2;
        
        // 3 - creamos vectoriales
         String [] nombres = new String [c];
         String [] apellidos = new String [c];
         String [] telefonos = new String [c];
         
         // 4 - Creamos variables para carga temporal
         String nomT = "";
         String apellT = "";
         String teleT = "";
         
         // 5 - Creamos variables para mayusculas
         String nomM = "";
         String apellM = "";
         
        //////////////////////////////////////////////////////////////////////
        
        
        System.out.println("***********************************************"); 
        System.out.println("************* AGEGNDA PERSONAL ****************");   
        System.out.println("***********************************************");
        System.out.println("\n");
        System.out.println("------- Ingresar datos de contactos -----------"); 
         System.out.println("-----------------------------------------------");
        /*
            Importante: las posiciones de un vector son null hasta que se llenan
            Generamos un do para que ingresen los datos, considerando
            que el ultimo registro que se va a completar es telefonos posicion 4.
            Como esa posicion sera nula hasta que se llene, va a  pedir ingresar
            los contactos hasta llegar a la cantidad definida en variable c .
            */         
            do {
            
               
               for (int i=0; i<nombres.length; i++){
                   /*
                   Tormamos el valor que tiene i en esta instanciia para ver
                   si funciona el for. El for asigna a los registros la posicion
                   o indice / id en cada vector
                    */  
                   System.out.println("Id Contacto: " +i);
                   System.out.print("Ingrese el nombre del contacto: ");
                   nomM = teclado.next();
                   nombres[i]= nomM.toUpperCase();
                   
                   System.out.print("Ingrese el apellido del contacto: ");
                   apellM = teclado.next();
                   apellidos[i]= apellM.toUpperCase();
                   System.out.print("Ingrese el numero de telefono: ");
                   telefonos[i]= teclado.next();
                   
                   //vamos a mostrarle al tipito los valores ingresados
                    System.out.println("-----------------------------------------------");
                    System.out.println("En hora buena! has creado un nuevo contacto!!!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Id Contacto: " +i);
                    
                    System.out.println("Nombre y Apellido: " +nombres[i]+ " " +apellidos[i]);
                    System.out.println("Telefono: " +telefonos[i]);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Que bueno es tener amigos!!");
                    System.out.println("-----------------------------------------------");
            
               }
               
               
            } while (telefonos[c-1] == null);
         
            //si se completo el ultimo posicion 4 de telefonos es que esta todo ok
        if (telefonos[c-1] != null){
                System.out.println("-----------------------------------------------");
                System.out.println("---------- Estos son tus contactos ------------");
                System.out.println("-----------------------------------------------");
                /*
                Recorremos los 3 vectores para hacer lista de contactos.
                Para ver que este todo ok
                */ 
                for (int i=0; i<nombres.length; i++){
                System.out.println("Id Contacto: " +i);
                System.out.println("Nombre y apellido: " +nombres[i]+ " "+apellidos[i]);
                System.out.println("Telefono: " +telefonos[i]);
                System.out.println("-----------------------------------------------");
                }  
                
            //vamos con el buscador
            System.out.print("Buscar contacto: ");
            nomT = teclado.next();
            nomM = nomT.toUpperCase();
            //System.out.println("" +nomM);
            System.out.println("-----------------------------------------------");
            
             //con el for recorremos el vector....
                for (int i=0; i<nombres.length; i++){
                 
                    //con el if comparamos cada posicion...
                    if (nomM.equals(nombres[i])){
                    System.out.println("Hay coincidencias!!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Id Contacto: " +i);
                    System.out.println("Nombre y apellido: " +nombres[i]+ " "+apellidos[i]);
                    System.out.println("Telefono: " +telefonos[i]);
                    System.out.println("-----------------------------------------------");
                    break;
                    } else if (!nomM.equals(nombres[i])){
                    System.out.println("No Hay coincidencias!");   
                    break;
                    }

                    
                }  
         
        }
             
         
    }
}    
