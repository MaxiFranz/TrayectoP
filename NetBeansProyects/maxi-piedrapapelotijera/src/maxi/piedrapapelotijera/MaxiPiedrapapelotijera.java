
package maxi.piedrapapelotijera;

import java.util.Random;
import java.util.Scanner;


public class MaxiPiedrapapelotijera {

   
    public static void main(String[] args) {
        
        /*
        //IMPORTANTE: 
        Asociamos cada opcion a un valor entero
        Piedra = 1; Papel = 2; Tijera = 3;
        h = humano
        m = maquina
        */
        
        /*
        Reglas del juego:
        Si las opciones de h y m son iguales, es empate, suma 1 punto a cada
        jugador
        Piedra (1) gana a tijera (3)
        Papel (2) gana a piedra (1)
        Tijera (3) gana a papel (2)
        
        */ 
        
        // 1 - iniciamos metodos
        Scanner teclado = new Scanner(System.in);
        Random rand =new Random();
        
        /*
        2 - Creamos 3 variables para las opciones de la maquina por cada 
        partida y las instanciamos con valores que obtenemos random. Estas 
        son las opciones de la maquina para cada jugada.
        */
        int oPcionp1m = rand.nextInt(3)+1;
        int oPcionp2m = rand.nextInt(3)+1;
        int oPcionp3m = rand.nextInt(3)+1;
        
        
        /*
        3 - creamos variables para opciones de cada partida para el humano
        */
        int oPcionp1h = 0;
        int oPcionp2h = 0;
        int oPcionp3h = 0;
        
        
        /*
        4 - Como el ser humano va a elegir una opcion que es una palabra 
        necesitamos guardarla momentaneamente. Creamos ademas una variable para
        que lo que haya escrito el tipito pase a minuscula. Luego tenemos 
        chequear si lo que puso es una palabra posible o no. Puede poner 
        cualquier cosa y va a romper el codigo.
        */
        String sEleccionh ="";
        String selec_minuscula="";
        
        /*
        5 - La opcion humana hay que convertirla en valor entero asique 
        necesitamos guardarla en una variable temporalmente para luego 
        pasarla como opcion a cada partida. Las opciones de la maquina son enteros
        asique para compararlos tienen que ser mismo tipo de valor.
        */
        int oPciontemp = 0;
        
        /*
        6 - Creamos variable para contar las partidas.
        */
        int pArtida = 1;
        
        /*
        7 - Creamos variables de nombres para maquina y humano
        */
        String n_maquina = "R2D -----------";
        String n_tipitoT = "";//variable para recuperar el valor que haya ingresado
        String n_tipito = "";//como finalmente lo vamos a mostrar
        
        //necesitamos el largo del nombre del tipito para que este prolijo al final
        int l_n_tipito = 0;
        
        /*
        8 - Creamos variables para almacenar los puntos obtenidos.
        Variables para los resultados de cada partida de cada jugador
        */
        int puntosp1h = 0;
        int puntosp1m = 0;
        int puntosp2h = 0;
        int puntosp2m = 0;
        int puntosp3h = 0;
        int puntosp3m = 0;
        //el puntaje total va en estas variables
        int puntosth = 0;
        int puntostm = 0;
        
        /*
        9 - Creamos variables para botones. Como tenemos mucho para mostrar
        terminadas las 3 partidas, vamos a ir avanzando en partes. 
        */
        String boton1 = "";//ver tablero con opciones
        String boton2 = "";//ver tablero de puntos
        String boton3 = "";//ver resultados finales y el ganador
        
        
        //***************************************************************
        //***************************************************************
        //***************************************************************
        
        //Comienza la interfaz de juego++++++++++++++++++++++++++++++++++++++
        System.out.println("******************************************");
        System.out.println("******** PIEDRA, PAPEL O TIJERA **********\n");
         
        /*
        Le pedimos el nombre al tipito. Para que quede prolijo en el tablero, 
        el nombre deberia tener por lo menos 4 caracteres de largo y no mas 
        de 15. Ademas, si tiene menos, hay que rellenar los espacios hasta
        completar. Sino se corre todo al final!!. Ademas lo ponemos todo en
        mayuscula asi queda igual que el nombre de la maquina.
        */
        do {
            System.out.print("Por favor ingresa tu nombre : ");
            n_tipitoT = teclado.nextLine();
            //lo pasamos a mayuscula
            n_tipito = n_tipitoT.toUpperCase();
            //aca contamos la cantidad de caracteres
            l_n_tipito = n_tipito.length();
            //aca calculamos la diferencia entre maximo y el largo del nombre
            int dif_n = 15 - l_n_tipito;
            //comentar siguiente linea
            //System.out.println(" Diferencia N : " +dif_n);
            
            //aca rellenamos segun la diferencia
            
            switch (dif_n){
                case 11:
                n_tipito = ""+n_tipito+ " ----------";
                break;
                case 10:
                n_tipito = ""+n_tipito+ " ---------";   
                break;
                case 9:
                n_tipito = ""+n_tipito+ " --------";    
                break;
                case 8:
                n_tipito = ""+n_tipito+ " -------";     
                break;
                case 7:
                n_tipito = ""+n_tipito+ " ------";  
                break;
                case 6:
                n_tipito = ""+n_tipito+ " -----";    
                break;
                case 5:
                n_tipito = ""+n_tipito+ " ----";   
                break;
                case 4:
                n_tipito = ""+n_tipito+ " ---";     
                break;
                case 3:
                n_tipito = ""+n_tipito+ " --";   
                break;
                case 2:
                n_tipito = ""+n_tipito+ " -";    
                break;
                case 1:
                n_tipito = ""+n_tipito+ " ";    
                break;
            }
            
        //mientras el nombre tenga menos de 4 caracteres o mas de 15, loopea    
        } while (l_n_tipito <4 || l_n_tipito >15);
            

        System.out.println("\n******************************************");
        System.out.println("*** " +n_tipito+  " VS " +n_maquina+ " ***");
        System.out.println("*********** A JUGAR!!. SUERTE!! **********");
        System.out.println("\n------------------------------------------");

       //loopeamos hasta que se completan las 3 partidas
        
        do  {
            //aca nos muestra el numero de partida
            System.out.println("PARTIDA : " +pArtida+ " ******************************");
            /*
            Le pedimos al tipito elegir entre piedra, papel o tijera. Como
            tiene que ingresar a mano el valor y puede escribir cualquier cosa
            tenemos que chequearlo. Lo loopeamos hasta que el valor sea alguno 
            de los posibles. Ademas, ya convertimos la palabra en entero.
            */
                
                    do {
                        System.out.print("Elegi: piedra, papel o tijera : ");
                        //recuperamos el valor ingresado por teclado
                        sEleccionh = teclado.nextLine();
                        //chequeamos que palabra puso. comentar la siguiente linea
                        //System.out.println("" +sEleccionh);
                        //pasamos a todo minuscula de lo que puso
                        selec_minuscula = sEleccionh.toLowerCase();
                        //chequeamos que funciona metodo. comentar la siguiente linea
                        //System.out.println("" +selec_minuscula );
                        
                        /*
                        Con equals chequeamos si coincide lo que puso el tipito 
                        con alguna de las opciones posibles. Cuando coincide,
                        se le asigna un valor a opcionTemp. Mientras no haya 
                        coincidencia, la variable OpcionTemp va a ser 0 y va 
                        a loopearse hasta que el tipito ponga una opcion posible.
                        */
                        
                            if (selec_minuscula.equals("piedra")){
                                oPciontemp = 1;   
                            } else if (selec_minuscula.equals("papel")){
                                oPciontemp = 2;
                            } else if (selec_minuscula.equals("tijera")){
                                oPciontemp = 3;
                            } else {
                                oPciontemp = 0;
                            }    
                    } while (oPciontemp == 0);
                    
                    //antes de que termine la partida.....
                    
                    //recuperamos el valor de opcionTemp.comentar siguiente linea
                    //System.out.println(" " +oPciontemp);
                    
                    
                        //grabamos la opcion elegida para la partida jugada
                        if (pArtida == 1){
                        oPcionp1h = +oPciontemp;
                        //como el tipito ya eligio, podemos tener los parciales
                        //comparamos opciones maquina vs humano
                        //ademas vamos sumando los puntos
                        if (oPcionp1h == oPcionp1m){
                        System.out.print("Hubo empate. Suma 1 punto cada uno");
                        puntosp1h = 1;
                        puntosp1m = 1;
                        } else if (oPcionp1h == 1 && oPcionp1m == 3){
                        System.out.print("Muy bien sumaste 1 punto");
                        puntosp1h = 1;  
                        } else if (oPcionp1h == 2 && oPcionp1m == 1){
                        System.out.print("Muy bien sumaste 1 punto");
                        puntosp1h = 1;    
                        } else if (oPcionp1h == 3 && oPcionp1m == 2){
                        System.out.print("Muy bien sumaste 1 punto");    
                        puntosp1h = 1;
                        //si no se dan estas opciones, gana la maquina!
                        } else {
                        System.out.print("Que pena no sumaste puntos");    
                        puntosp1m = 1;    
                        }
                        
                        System.out.println(" \n-----------------------------------------");
                        
                        } else if (pArtida == 2){
                        oPcionp2h = +oPciontemp; 
                        if (oPcionp2h == oPcionp2m){
                        System.out.print("Hubo empate. Suma 1 punto cada uno");
                        puntosp2h = 1;
                        puntosp2m = 1;
                        } else if (oPcionp2h == 1 && oPcionp2m == 3){
                        System.out.print("Muy bien sumaste 1 punto");
                        puntosp2h = 1;  
                        } else if (oPcionp2h == 2 && oPcionp2m == 1){
                        System.out.print("Muy bien sumaste 1 punto");
                        puntosp2h = 1;    
                        } else if (oPcionp2h == 3 && oPcionp2m == 2){
                        System.out.print("Muy bien sumaste 1 punto");    
                        puntosp2h = 1;
                        //si no se dan estas opciones, gana la maquina!
                        } else {
                        System.out.print("Que pena no sumaste puntos");    
                        puntosp2m = 1;    
                        }
            
                        System.out.println(" \n-----------------------------------------");
                        
                        } else {
                        oPcionp3h = +oPciontemp; 
                         if (oPcionp3h == oPcionp3m){
                            System.out.print("Hubo empate. Suma 1 punto cada uno");
                            puntosp3h = 1;
                            puntosp3m = 1;
                            } else if (oPcionp3h == 1 && oPcionp3m == 3){
                            System.out.print("Muy bien sumaste 1 punto");
                            puntosp3h = 1;  
                            } else if (oPcionp3h == 2 && oPcionp3m == 1){
                            System.out.print("Muy bien sumaste 1 punto");
                            puntosp3h = 1;    
                            } else if (oPcionp3h == 3 && oPcionp3m == 2){
                            System.out.print("Muy bien sumaste 1 punto");    
                            puntosp3h = 1;
                            //si no se dan estas opciones, gana la maquina!
                            } else {
                            System.out.print("Que pena no sumaste puntos");    
                            puntosp3m = 1;    
                            }
            
                            System.out.print(" \n");
                        }    
                        
            //****************************************************************
            //aca va contando las partidas
            pArtida = pArtida +1;    
        }while (pArtida <=3);
        
        /*
        Cuando jugo las 3 partidas, manda mensaje y muestra resultados!
        */
        if (pArtida >= 3){
          System.out.println("\n***********************************************");
          System.out.println("Final!! * Final!! * Final!! * Final!! * Final!!");   
          System.out.println("***********************************************\n");
    
        //***********************************************************************       
         
        //Paramos aca vamos a ir mostrando los resultados de apoco
          do {
          System.out.print("Para conocer las opciones elegidas, tipea 1 : "); 
          boton1 = teclado.nextLine();
                
          } while (!boton1.equals("1"));
          
          //una vez que elige verlo, cambia el valor de variable y se muestra
                if (boton1.equals("1")){
                //aca armamos el tablero de opciones
                System.out.println("--------------------------------------------");
                 System.out.println("-------- OPCIONES DE LOS JUGADORES ---------");
                 System.out.println("JUGADORES ------------- PARTIDAS -----------");
                 System.out.println("------------------- 1 ----- 2 ------ 3 -----"); 
          
                    //aca armamos la fila del tipito con los resultados
                    System.out.print("" +n_tipito+ "- ");
          
                //pasamos las opciones a palbras para el humano
                if (oPcionp1h == 1){
                    System.out.print("PIEDRA - ");
                } else if (oPcionp1h == 2){
                    System.out.print("PAPEL  - ");
                } else {
                    System.out.print("TIJERA - ");
                }
                
                if (oPcionp2h == 1){
                    System.out.print("PIEDRA - ");
                } else if (oPcionp2h == 2){
                    System.out.print("PAPEL  - ");
                } else {
                    System.out.print("TIJERA - ");
                }
                
                if (oPcionp3h == 1){
                    System.out.print("PIEDRA - ");
                } else if (oPcionp3h == 2){
                    System.out.print("PAPEL  - ");
                } else {
                    System.out.print("TIJERA - ");
                }
          
          //fin de fila resultados humano
          System.out.print(" \n");
          
           //aca armamos la fila de la maquina con sus opciones random
          System.out.print("" +n_maquina+ "- ");
          
           if (oPcionp1m == 1){
                    System.out.print("PIEDRA - ");
                } else if (oPcionp1m == 2){
                    System.out.print("PAPEL  - ");
                } else {
                    System.out.print("TIJERA - ");
                }
                
                if (oPcionp2m == 1){
                    System.out.print("PIEDRA - ");
                } else if (oPcionp2m == 2){
                    System.out.print("PAPEL  - ");
                } else {
                    System.out.print("TIJERA - ");
                }
                
                if (oPcionp3m == 1){
                    System.out.print("PIEDRA - ");
                } else if (oPcionp3m == 2){
                    System.out.print("PAPEL  - ");
                } else {
                    System.out.print("TIJERA - ");
                }
          
          //fin de fila resultados maquina
          System.out.print(" \n");
          //cierra tablero general
          System.out.println("--------------------------------------------\n");
          } else {
          //no muestra nada porque el tipito no pone 1    
          }
          
          //calculamos puntaje final final
          puntosth = puntosp1h + puntosp2h + puntosp3h;
          puntostm = puntosp1m + puntosp2m + puntosp3m;
        
          
        //*********************************************************************** 
        
        do {
          System.out.print("Para conocer la tabla de puntos, tipea 1 : "); 
          boton2 = teclado.nextLine();
                
          } while (!boton2.equals("1"));  
        
        
         if (boton2.equals("1")){
                //aca armamos el tablero de opciones
        System.out.println("--------------------------------------------");        
        System.out.println("------------------- PUNTOS  ----------------");
        System.out.println("JUGADORES -------- PARTIDAS -------- TOTALES");
        System.out.println("---------------- 1 --- 2 --- 3 -------------");
        //va la fila del tipito
        System.out.print("" +n_tipito+ "- ");
        System.out.print(""+ puntosp1h+ " ");
        System.out.print("--- "+ puntosp2h+ " ");
        System.out.print("--- "+ puntosp3h+ " -------- ");
        System.out.print(""+ puntosth+ " - ");
        System.out.print(" \n");
        //va la fila dela maquina
        System.out.print("" +n_maquina+ "- ");
        System.out.print(""+ puntosp1m+ " ");
        System.out.print("--- "+ puntosp2m+ " ");
        System.out.print("--- "+ puntosp3m+ " -------- ");
        System.out.print(""+ puntostm+ " - ");
        System.out.print(" \n");
        System.out.print("--------------------------------------------");
        System.out.print(" \n");
        } else {
          //no muestra nada porque el tipito no pone 1    
        }    
        
        //***********************************************************************  
        //vamos al ultimo cuadro de resultados
        do {
          System.out.print("Para conocer el resultado final, tipea 1 : "); 
          boton3 = teclado.nextLine();
                
          } while (!boton3.equals("1"));  
        
            if (boton2.equals("1")){
            //los mostramos!!!
            System.out.println("--------------------------------------------");
            System.out.println("------------ RESULTADOS FINALES  -----------");
            
            switch (puntosth){
                case 0:
                case 1:
                System.out.print("" +n_tipito+ " " +puntosth+ " punto");
                break;
                default:
                System.out.print("" +n_tipito+ " " +puntosth+ " puntos");
                break;
            }
            
            System.out.print(" \n");
            
            switch (puntostm){
                case 0:
                case 1:
                System.out.print(""+n_maquina+ " " +puntostm+ " punto");
                break;
                default:
                System.out.print(""+n_maquina+ " " +puntostm+ " puntos");    
                break;
            }
            
            System.out.print(" \n");
             
            System.out.println("--------------------------------------------\n");
            
            if (puntosth > puntostm){
            System.out.println("------------ Y EL GANADOR ES!!! ------------");
            System.out.println("--------------------- " +n_tipito+ "--------");    
            } else if (puntosth < puntostm){
            System.out.println("------------ Y EL GANADOR ES!!! ------------");
            System.out.println("--------------------- " +n_maquina+ "-------");  
            } else {
            System.out.println("----------- TENEMOS UN EMPATE!! ------------"); 
            }
         } else {
          //no muestra nada porque el tipito no pone 1    
        }      
           
            

            
    //*********************************************************************** 
    //***********************************************************************  
    System.out.print(" \n");//ponemos para que el texto final no quede pegado
    //no obrrar siguiente llave es del if (pArtida >= 3)       
    }
        
    }
    
}
