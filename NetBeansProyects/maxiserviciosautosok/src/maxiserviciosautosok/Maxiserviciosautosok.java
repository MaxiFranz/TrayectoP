
package maxiserviciosautosok;

import java.util.Random;
import java.util.Scanner;


public class Maxiserviciosautosok {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        
        
        /*
        Ejercicio 13
        Crear un programa para un totem en una  empresa de servicio automotores, 
        el cual el cliente debe completar y finalizado imprime un ticket de espera. 
        Para lo cual debe solicitar:
            -Nombre del cliente
            -DNI
            -Teléfono
            -Dominio del vehículo
        
        -Debe seleccionar la marca de su vehículo 
        (traída de un vector de marcas)
        
        -Debe seleccionar el servicio que desea hacer 
        (traído de un vector de servicios)
                - Alineación
                - Balanceo (indicar cantidad)
                - Cambio de aceite 
                - Cambio de cubiertas (indicar cantidad)
        
        - Debe cargar un vector con los servicios que se seleccionaron 
        para mostrarlos luego en el ticket
        
        - Finalizado la carga debe imprimir un ticket para que el cliente 
        lo tenga con un numero aleatorio de espera
        */
    
        //creamos vectoriales necesarias con la info para el tipito
        String [] marcas = new String [5];
        //definimos valores de vector marcas
        marcas[0] = "FORD";
        marcas[1] = "RENAULT";
        marcas[2] = "FIAT";
        marcas[3] = "CITROEN";
        marcas[4] = "OTRO";
        
        String [] servicios = new String [4];
        servicios [0] = "Alineacion";
        servicios [1] = "Balanceo";//no olvidar pedir cantidad
        servicios [2] = "Cambio de aceite";
        servicios [3] = "Cambio de cubiertas";//no olvidar pedir cantidad
        
        //creamos 1 vector mas para cargar la info del tipito
        //nombre(0), dni(1), dominio(2), marca(3)
        String [] dataC = new String [4];
         /*
        Necesitamos un vector mas para indicar el servicio y la cantidad solicitada
        Alineacion, balanceo, cambio aceite, cambio cubiertas
        */
        String [] serviciosC = new String [4];
        //vector para las cantidades de cada servicio
        int serviciosCA = 0;
         
        //variables para ir recuperando los datos que elija el tipito e ir chequeando
        String data = "";
        String dataM = "";
        int marcaI = 0;
        String cantiS = "";
        String cantiSP = "";
        
        //variable para turno
        int turno = 0;
        
        /////////////////////////////////////////////////////////////////
        
       
       do { 
            System.out.println("-------------------------------------------------");
            System.out.println("--------- Centro de Servicios Automotor ---------");
            System.out.println("--------- Zavaleta 204, C1437EYF, CABA ----------");
            System.out.println("-------------------------------------------------");
            System.out.println("---------------- BIENVENIDO !! ------------------");
            System.out.println("- No dejar espacios en la informacion ingresada -");
            System.out.println("-------------------------------------------------");
            
            //pedimos los datos y vamos completando el vector dataC
            //nombre(0), dni(1), dominio(2), marca(3)
            System.out.print("Ingresa tu nombre: ");
            dataC[0] = teclado.next();
            
            System.out.print("Ingresa tu DNI: "); 
            dataC[1] = teclado.next();
            
            System.out.print("Ingresa el dominio de tu vehiculo: ");
            dataC[2] = teclado.next();
            System.out.print("\n");
            
            //listamos las marcas disponibles 
            System.out.println("------------- MARCAS DE AUTOS ------------------");
            System.out.println("------------------------------------------------");
                for(int i=0; i<marcas.length; i++){
                System.out.println(+i+ "-" +marcas[i]);    
                }
            System.out.println("------------------------------------------------");   
            
                do {    
                System.out.print("Indica la marca de tu rodado: ");
                    //recuperamos el valor ingresado
                    data = teclado.next();
                    dataM = data.toUpperCase();
                    System.out.println("La marca ingresada es : " +dataM);
                    for(int i=0; i<marcas.length; i++){
                        if(dataM.equals(marcas[i])){
                        marcaI = 1;   
                            if (marcaI == 1){
                            System.out.println("La marca esta en el listado");
                            System.out.println("------------------------------------------------");
                            break;
                            }
                            
                        } else {
                        marcaI = 0;   
                        //System.out.print("" +marcaI);
                        }
                    
                    }

                    } while (marcaI == 0);
            //hasta que no selecciona la marca queda esperando
             //una vez que pasamos el validador de marca, guardamos el valor en vector
            dataC[3] = dataM;
            
            ///////////////////////////////////////////////////////////////////
            
           System.out.println("------------ SERVICIOS DISPONIBLES -------------");
           System.out.println("------------------------------------------------");
           
           //listamos los servicios
            for(int i=0; i<servicios.length; i++){
                System.out.println(+i+ "-" +servicios[i]);    
                }
            System.out.println("------------------------------------------------");  
            
            
            
            //ahora le vamos preguntando opcion por opcion..
            for(int i=0; i<servicios.length; i++){
                //creamos variable para campo de opcion. El tipito tiene que elegir
                //0 no varia hasta que responde algo. Ademas validamos que responda otra cosa
                int input = 0;
                    do {
                    System.out.println("Desea agregar " +servicios[i]+ " ?. "); 
                    System.out.print("Escriba 1 para si, 2 para no : "); 
                    data = teclado.next();
                    
                    //si tipea 1, agrega el servicio
                        switch (data){
                            case "1":
                                //agregamos el servicio al vector serviciosC
                                serviciosC[i] = servicios[i]; 
                                System.out.println("El servicio " +servicios[i]+ " fue agregado"); 
                                //vamos a agregar la cantidad
                                    if (i == 1){
                                      System.out.println("Indique cantidad : ");
                                      cantiSP = teclado.next();
                                            
                                            switch (cantiSP){
                                                case "1":
                                                serviciosC[i] = ("" +servicios[i]+ " x 1");    
                                                break;
                                                case "2":
                                                serviciosC[i] = ("" +servicios[i]+ " x 2");
                                                break;
                                                case "3":
                                                serviciosC[i] = ("" +servicios[i]+ " x 3");
                                                break;
                                                case "4":
                                                serviciosC[i] = ("" +servicios[i]+ " x 4"); 
                                                break;
                                                default:
                                                System.out.println("No es una opcion valida!");    
                                                break;
                                            }
                                            
                                      
                                    } else if (i == 3){
                                        System.out.println("Indique cantidad : ");
                                      cantiSP = teclado.next();
                                            
                                            switch (cantiSP){
                                                case "1":
                                                serviciosC[i] = ("" +servicios[i]+ " x 1"); 
                                                break;
                                                case "2":
                                                serviciosC[i] = ("" +servicios[i]+ " x 2");    
                                                break;
                                                case "3":
                                                serviciosC[i] = ("" +servicios[i]+ " x 3");  
                                                break;
                                                case "4":
                                                serviciosC[i] = ("" +servicios[i]+ " x 4");   
                                                break;
                                                default:
                                                System.out.println("No es una opcion valida!");    
                                                break;
                                            }
                                            
                                    }else {
                                    serviciosC[i] = ("" +servicios[i]+ " x 1");
                                    }
                                        
                                        
                                System.out.println("------------------------------------------------"); 
                                input = 1;//con esta linea salimos del do
                            break;
                            
                            //si tipea 2, no agrega el servicio
                            case "2":
                            System.out.println("El servicio no se agrega");
                            
                            input = 2;
                            System.out.println("------------------------------------------------"); 
                            break;
                            //si tipea otra cosa...repregunta
                            default:
                            System.out.println("No es una opcion valida. ");
                            input = 0;
                            break;
                        }
                            
                            
                    } while (input == 0);
                }
           
            System.out.println("***********************************************"); 
            System.out.println("***********************************************"); 
            ///////////////////////////////////////////////////////////////////
            //imprimimos tiket     
            
            //asignamos turno al cliente
            turno = rand.nextInt(100)+1;
            System.out.println("SU TURNO ES EL " +turno+ "  ESTE ATENTO!!!");
            
            //completado todo, necesitamos mostrar la info de los dos vectores
            //dataC y serviciosC
            for(int i=0; i<dataC.length; i++){
                    if (i == 0){
                    System.out.println("Nombre del cliente: " +dataC[i]);
                    } else if (i == 1){
                    System.out.println("DNI del cliente: " +dataC[i]);
                    } else if (i == 2){
                    System.out.println("Dominio del vehiculo: " +dataC[i]);
                    }else if (i == 3){
                    System.out.println("Marca del vehiculo: " +dataC[i]);
                    }
                        
            }
            System.out.println("-------------------------------------------------");
            
            //listamos el vector servicios elegidos
            for(int i=0; i<serviciosC.length; i++){
                    if (serviciosC[i] == null){   
                    } else {
                    System.out.println(serviciosC[i]);    
                    }
                   
            }

            //cerramos el ticket
            System.out.println("------------------------------------------------");
            System.out.println("------ AGUARDE, EN MINUTOS LO ATENDEMOS ---------"); 
            System.out.println("-------------------------------------------------");
            System.out.println("\n");
       
        
    //vaciamos valor de ticket para que reinicie el totem para nuevo cliente
            turno = 0;
       } while (turno == 0);
        
        
    }
    
}
