
package matrices;

import java.util.Scanner;


public class Matrices {

    
    
    public static void main(String[] args) {
       
       //declaramos datos para lo que ingrese
       Scanner teclado = new Scanner(System.in);
       
       //aca ponemos datos del presupuesto. esto es dinamico
       String [] datos = new String [4];
       ////////////////////////////////////////////////////
       
       //variable para levantar data
        String data = "";
        int modeloI = 0;
        
        //variables para el tiket
        String modeloO ="";
        int gamaI = 0;
        int precioO = 0;
        
       //desde aca son vectores que cargamos a mano
        String [] modelos = new String [3];
        modelos[0] = "CRONOS";
        modelos[1] = "ARGO";
        modelos[2] = "MOBI";
        
        String [] gama = new String [9];
        gama[0] = "Baja";
        gama[1] = "Medio";
        gama[2] = "Alto";
        gama[3] = "Baja";
        gama[4] = "Medio";
        gama[5] = "Alto";
        gama[6] = "Baja";
        gama[7] = "Medio";
        gama[8] = "Alto";
        
        int [] precios = new int [9];
        precios[0] = 10;
        precios[1] = 100;
        precios[2] = 1000;
        precios[3] = 20;
        precios[4] = 200;
        precios[5] = 2000;
        precios[6] = 30;
        precios[7] = 300;
        precios[8] = 3000;
       
        /*
       for(int i=0; i<modelos.length; i++){
            System.out.println("" +modelos[i]);
       }
                 
        for(int i=0; i<gama.length; i++){
            System.out.println("" +gama[i]);
       }
        
        for(int i=0; i<precios.length; i++){
            System.out.println("" +precios[i]);
       }
       */
        
       //controlamos los vectores. comentar estas lineas////////////////
       
       //listamos los modelos disponibles
       System.out.println("Estos son los modelos disponibles");
       for(int i=0; i<modelos.length; i++){
            System.out.println(+i+ " - " +modelos[i]);
       }
       System.out.print("\n");
       
       do {
       System.out.print("Seleccione el modelo: ");
       data = teclado.next();
       
       
       switch (data){
            case "0":
                modeloO = "CRONOS";
                System.out.println("El modelo seleccionado es: " +modeloO);
                for(int i=0; i<3; i++){
                System.out.println(+i+ " - " +gama[i]);
                }  
                
                System.out.print("Seleccione gama: ");
                data = teclado.next();
                    switch (data){
                        case "1":
                        gamaI = 1;   
                        break;
                        case "2":
                        gamaI = 2;   
                        break;
                        case "3":
                        gamaI = 3;   
                        break;
                        default:
                        System.out.print("Seleccion erronea");
                        break;
                     }   
                        
                        
                        
                        modeloI = 1;
             
                
            break;
            case "1":
                modeloO = "ARGO";
                System.out.println("El modelo seleccionado es: " +modeloO);
                for(int i=3; i<6; i++){
                System.out.println(+i+ " - " +gama[i]);
                }  
                
            break;
            case "2":
                modeloO = "MOBI";
                System.out.println("El modelo seleccionado es: " +modeloO);
                for(int i=6; i<9; i++){
                System.out.println(+i+ " - " +gama[i]);
                }  
                //For gama 7 al 9
            break;       
            default:
            System.out.print("Seleccion erronea");
            break;
            }
       }while (modeloI == 0);
       
       System.out.println("Su modelos es: " +modeloO);
       System.out.println("Su gama es:" +gamaI);
       
    }
    
     
}
