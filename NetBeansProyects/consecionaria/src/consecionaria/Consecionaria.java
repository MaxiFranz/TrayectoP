
package consecionaria;

import java.util.Scanner;


public class Consecionaria {

    
    public static void main(String[] args) {
       
         //creamos metodo para ingreso de datos
         Scanner teclado = new Scanner(System.in);
         
        //creamos variables necesarias
        String data = "";//para recuperar los datos que ingrese
        String coordenadas = "";
        
        //variables de informacion para presupueto
         String n_vendedor = "";
         String n_cliente = "";
         String dni_cliente = "";
         String tel_cliente = "";
         int precio_final = 0;
         Date fecha = new Date();
        
        //variables para selecciones de tipito
        String id_modeloS = "";//grabamos el id del modelo seleccionado
        String id_producto = "";//grabamos el id de la gama seleccionada (producto especifico)
        int precioS = 0;//valor que sacamos de matriz lista de precios
        
        
        
        //creamos la matriz de modelos {id_modelo,nombre de modelo}
        String [][] modelos = {{"1","CRONOS"},{"2","ARGO"},{"3","MOBI"}};
        
        //creamos la matriz de gamas {id_modelo,codigoproducto, nombre de gama}
        String [][] gamas = {{"1","771","Like 1.3 MT"},{"1","772","Drive Plus 1.3 MT"},{"1","773","Precision 1.3 MT"},
                            {"2","801","Drive 1.8 MT "},{"2","802","Presicion AT 1.8 MT"},{"2","803","Presicion HGT 1.8 MT"},
                            {"3","910","Like 2.0"},{"3","915","Easy 2.0"},{"3","917","Way 2.0"}};
        
        //creamos la matriz de precios donde: {idgama,precio}
        int [][] listaP = {{771,10},{772,100},{773,1000},{801,20},{802,200},{803,2000},{910,30},{915,300},{917,3000}};
        
        
        //listamos los modelos disponibles
        System.out.println("------------- Lista de modelos ------------------");
        
        //listamos los modelos. Primer columna muestra ID y segunda nombre de modelo
        for (int x=0; x < modelos.length; x++) {
             
            for (int y=0; y < modelos[x].length; y++) {
            System.out.print (modelos[x][y]);
            System.out.print (" - ");
            }
            System.out.print ("\n");
        }
        
        System.out.println("-------------------------------------------------");
        
    do {
       System.out.print("Seleccione el modelo: ");
       data = teclado.next();
       
        //validamos el valor ingresado y cargamos la variable modelo
        switch (data){
            case "1":
               id_modeloS = "1";
            break;
            case "2":
                id_modeloS = "2";
            break;
            case "3":
                id_modeloS = "3";
            break;
            default:
            System.out.print("El dato ingresado no es una opcion valida!");   
            break;    
        }
       
    } while (id_modeloS == "0");//mientras el tipito no pone algo, queda aca
    
    System.out.println("El modelo seleccionado es: " +id_modeloS);
    System.out.println("-------------------------------------------------");
    
    
    /*
        Generamos lista para chequear. Comentar luego!
        System.out.println("Id Modelo - Id producto - Gama N / nombre producto");
        
        for (int x=0; x <gamas.length; x++) {
            for (int y=0; y <gamas[x].length; y++) {
                System.out.print (" - " +gamas[x][y]);
            }
            System.out.print ("\n");
        }
        */
        
        System.out.println("------ Opciones de gama para este modelo --------");
       
        //recorremos matriz gamas
        for(int filas=0;filas<gamas.length;filas++){
            for(int columnas=0;columnas<gamas[filas].length;columnas++){
                
                //filtramos por id_modelos
                if(gamas[filas][columnas].equals(id_modeloS)){
                //aca leemos id_modelo
                System.out.print (gamas[+filas][+columnas]);
                System.out.print (" - ");
                //aca leemos id_gama o codigo de producto
                System.out.print (gamas[+filas][+columnas+1]);
                System.out.print (" - ");
                //aca leemos el nombre del producto o gama
                System.out.print (gamas[+filas][+columnas+2]);
                //aca cerramos la fila
                System.out.print ("\n");
                }
            }
        }
    
        System.out.println("-------------------------------------------------");    
        
    do {
       System.out.print("Seleccione el producto / gama: ");
       data = teclado.next();
        
        for(int filas=0;filas<gamas.length;filas++){
            for(int columnas=0;columnas<gamas[filas].length;columnas++){
                if(gamas[filas][columnas].equals(data)){
                    coordenadas+="["+filas+","+columnas+"]"+"\n";
                }
            }
        }        
                
            if(coordenadas.equals("")){
            System.out.println("El codigo "+data+" no es valido");
            id_producto = "0";
            }else{
            System.out.println("El codigo "+data+" es valido!");
            id_producto = data;
            }
                
    } while (id_producto == "0");//mientras el tipito no pone algo, queda aca    
    
    
    //antes de seguir, hay que convertir el codigo del producto a entero porque
    //la matriz de precios es con enteros para que sea mas facil los calculos
    //de financiacion.
    
            int codigoP = Integer.parseInt(id_producto);
            //System.out.println(codigoP); 
    
    System.out.println("-------------------------------------------------"); 
    System.out.print("El valor del modelo / gama seleccionado es $"); 
    
    //recorremos la lista de precios
    for(int filas=0;filas<listaP.length;filas++){
            for(int columnas=0;columnas<listaP[filas].length;columnas++){
                
                //aca el filtro es codigo de producto o codigo de gama
               if(listaP[filas][columnas]==(codigoP)){
                System.out.print (listaP[+filas][+columnas+1]);
                System.out.print (" pesos");
                System.out.print ("\n");
                }
            }
        }    
        
    System.out.println("-------------------------------------------------");                
    //////////////////////////////////////////////////////////////////////////
     
    
    }
    
}
