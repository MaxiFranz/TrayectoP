/**
    CFP ASEGURA TU AUTO
Se necesita un programa que permita la emisión de una póliza de seguro para un vehículo. 
Con las siguientes características:
1) En la primera parte debe mostrar una JOption con el logo de la compañía
2) Solicitar datos del cliente:
a. Nombre y Apellido
b. Teléfono
c. EMAIL
En este caso podemos utilizar variables para cada uno de los puntos y solicitarlo por JOPTION

3) Datos del vehículo
a. Marca, utilizar un JOption combobox a un vector
b. Modelo , JOPtion input
c. Dominio, JOPtion input
d. Años de antigüedad, JOPtion input
* 

4) Tipo de Cobertura
Utilizar un Joption combo con las opciones 
* Terceros Completos, Todo Riesgo y Responsabilidad Civil

Los valores de cada cobertura son:
RC :1000
TC:2000
TR: 3000

5) Adicionales de la cobertura
Utilizar un Joption combo con las opciones:
a. Granizo
b. Llantas deportivas
c. Asistencia Mecánica
d. Localizador GPS

Puede seleccionar mas de un adicional. Por cada dos que selecciona se cobra uno el valor de cada adicional es 300

Calculo del importe segun la antiguedad
Luego que se solicita la antigüedad del automóvil se debe realizar el calculo para calcular la cuota. Este calculo se realiza de la siguiente manera:
Si el vehículo es menor igual a 5 años pagara u extra de 500
Si el vehículo es mayor a 5 años pero menor a 10 paga un extra de 1000
Si el vehículo tiene una edad mayor igual a 10 pero menor a 15 paga 1500
Si el vehículo tiene mas de 15 años y menor 20 paga 2000
Si el vehículo es mayor a 20 años no se asegura (mostrar cartel antes de seguir avanzando)

Cálculos del seguro: El cálculo de lo que el cliente va a abonar se calcula con:
Valor de la cuota = Tipo de cobertura (valor) + Adicionales (valor)+ antigüedad del vehículo

6) Impresión de póliza (opcional función)
Mostrar en un joption o en consola como lo prefieran, los datos que deben mostrarse son:
a. Datos del Usuario (datos cargados)
b. Datos del Vehículo (datos cargados)
c. Tipo de cobertura (detalle seleccionado)
d. Adicionales de la cobertura (detalles seleccionado)
e. Valor de la prima total
     */

package aseguradorq;

import java.util.Random;
import java.util.Date;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Aseguradorq {

    
    public static void main(String[] args) {
    
    //1.Vector para guardar datos del cliente
    //nombre, apellido, telefono, email
    String [] infocliente = new String [4];
    
    //2.Vector para guardar datos del vehiculo
    //marca, modelo, dominio, antiguedad
    String [] infoauto = new String [4];
   
    //3.Vector para las coberturas y adicionales
    //codigocobertura, cobertura/adicional
    
    String [] coberturas = new String [3];
        coberturas[0] = "771 - Terceros Completos";
        coberturas[1] = "772 - Todo Riesgo";
        coberturas[2] = "773 - Responsabilidad Civil";
    
    String [] adicionales = new String [4];
        adicionales[0] = "874 - Granizo";
        adicionales[1] = "875 - Llantas deportivas";
        adicionales[2] = "876 - Asistencia mecanica";
        adicionales[3] = "877 - Localizador GPS";
    
    //4.Matriz para precios de coberturas
    //codigocobertura, valor en pesos
    int [][] listaprecios = {{771,2000},{772,3000},{773,1000},{874,300},{875,300},{876,300},{877,300}};
    
    //5.Variables para uso temporal    
    String valorTS = "";
    int valorTI = 0;
    String texto = "";
    int resp = 0; 
    int posicion = 0;
    
    
    //6.Vector con marcas
    String [] marcas = new String [9];
        //definimos valores de vector marcas. Se pueden agregar mas
        marcas[0] = "FORD";
        marcas[1] = "RENAULT";
        marcas[2] = "FIAT";
        marcas[3] = "CITROEN";
        marcas[4] = "HONDA";
        marcas[5] = "BMW";
        marcas[6] = "PEUGEOT";
        marcas[7] = "SUZUKI";
        marcas[8] = "OTRO";
        
    //7.Vector para guardar selecciones de cobertura
    int [] items = new int [5];
    
    //8.Variables para calculos
    int antiguedad = 0;//diferencia entre el q%o actual y el del modelo
    int plusxantiguedad = 0;//valor a pagar segun antiguedad
    int valorcobertura = 0;//valor cobertura principal mas adicionales
    int valorcuota = 0;//valor cuota final
    
    //9. Variables de fecha y nro de poliza. Calculo y formateo
    Date fecha = new Date();
    String sfecha = fecha.toString();
    String fecha2 = sfecha.substring(0,10);
    
    Random rand = new Random();
    int npoliza = 0;
    npoliza = rand.nextInt(1000)+1;
    
    ////////////////////////////////////////////////////////////////////////////
    ///////////////////// INTERFAZ PARA INGRESO DE DATOS ///////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    
    do {
        //1a. Bienvenida
        ImageIcon bienvenida = new ImageIcon("src/img/bienvenida.png");
        JOptionPane.showMessageDialog(null,"", "",JOptionPane.INFORMATION_MESSAGE,bienvenida);
    
        //1b. - Verificacion de antiguedad
            do {
            valorTS = JOptionPane.showInputDialog(null, 
                        "Ingrese el modelo del rodado", "Comencemos!", 
                        JOptionPane.QUESTION_MESSAGE); 
            } while (valorTS == null || valorTS.isEmpty());
            
        //1 - comprobamos si es un numero
            
                    boolean isNumeric = (valorTS.matches("[0-9]+"));
                                if (isNumeric != true ){
                                    JOptionPane.showMessageDialog(null,
                                         "El dato ingresado no es un numero", 
                                         "Atencion!",
                                         JOptionPane.WARNING_MESSAGE); 
                                         infoauto[3] = "";
                                } else {
                                    ImageIcon auto = new ImageIcon("src/img/auto.png");
                                    JOptionPane.showMessageDialog(null,
                                     "El año ingresado es " +valorTS, "Verificar!",
                                     JOptionPane.INFORMATION_MESSAGE,auto);
                                    
        //2 - si es un numero, lo pasamos a entero
                                    String sCadena = valorTS;
                                    String sSubCadena = sCadena.substring(0,4);
                                    valorTI = Integer.parseInt(sSubCadena);
                                        
        //3 - calculamos la antiguedad
                                    antiguedad = 2023 - valorTI;
                                    
        //4 - Validamos la antiguedad
                                    if (antiguedad <= 20){
                                        //grabamos el valor en el vector y le avisamos
                                        infoauto[3] = valorTS;
            
                                        JOptionPane.showMessageDialog(null,
                                     "La antiguedad del rodado es de " +antiguedad+ " años", "Verificar", 
                                     JOptionPane.INFORMATION_MESSAGE,auto);
                                        
                                    } else {
                                        //sino, avisamos que no se puede seguir
                                    JOptionPane.showMessageDialog(null,
                                      "La antiguedad del rodado es de " +antiguedad+ " años\n No "
                                                 + "podemos asegurarlo!", 
                                         "Atencion!",
                                         JOptionPane.WARNING_MESSAGE); 
                                         infoauto[3] = "";    
                                    
                                    }
                                    
                             }
    } while (infoauto[3] == "");
   

    //2. Grabamos valores en vector infocliente ********************************
       
        for(int i=0; i<infocliente.length; i++){
                    switch (i){
                        case 0:
                        texto = "Nombre";
                        break;
                        case 1:
                        texto = "Apellido";
                        break;
                        case 2:
                        texto = "Telefono";
                        break;
                        case 3:
                        texto = "Email";
                        break;
                        default:
                        break;
                    }
            
            do {
                    do {
                    ImageIcon cliente = new ImageIcon("src/img/cliente.png");
                    valorTS = JOptionPane.showInputDialog(null, 
                        "Ingrese el " +texto, "Informacion del Cliente", 
                        JOptionPane.QUESTION_MESSAGE); 
                          
 
                        
                        
                    } while (valorTS == null || valorTS.isEmpty());
                infocliente[i] = valorTS;
                
            } while (infocliente[i] == "" );  
            
        }    
        
       
        //3. Grabamos valores en vector infoauto.  *****************************
        valorTS = null;
        
        //a - grababamos la marca
        while (valorTS == null){ 
            valorTS = (String) JOptionPane.showInputDialog(null,"Seleccione marca de su vehiculo ", "",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas[0]);
                if (valorTS != null){
                    infoauto[0] = valorTS;
                }           
        }
        
        
        //b - grabamos el resto de los valores. modelo, dominio, antiguedad
        
        for(int i=1; i<3; i++){
                    switch (i){
                        case 1:
                        texto = "Modelo - gama";
                        break;
                        case 2:
                        texto = "Dominio - patente";
                        break;
                        default:
                        break;
                    }
            
            do {
                    do {
                    valorTS = JOptionPane.showInputDialog(null, 
                        "Ingrese el " +texto, "Informacion del rodado", 
                        JOptionPane.QUESTION_MESSAGE); 
                          
                    } while (valorTS == null || valorTS.isEmpty());
                        
                        infoauto[i] = valorTS;    
                
            } while (infoauto[i] == "" );  
            
        }
            
 
        //4 - Grabamos cobertura
        valorTS = null;
        
        //a - grababamos la cobertura principal
        while (valorTS == null){ 
            valorTS = (String) JOptionPane.showInputDialog(null,"Seleccione cobertura principal ", "Cobertura",JOptionPane.QUESTION_MESSAGE,null,coberturas,coberturas[0]);
                if (valorTS != null){
                    String sCadena = valorTS;
                    //seleccionamos los primeros tres caracteres del string
                    String sSubCadena = sCadena.substring(0,3);
                    //lo convertimos en entero. listaprecios tiene valores enteros
                    valorTI = Integer.parseInt(sSubCadena);
                    //System.out.println(valorTI);
                    //gabamos codigo cobertura seleccionada
                    items[0] = valorTI;
                }           
        }
        
        
    
        //b - grababamos los adicionales
        //para los adicionales se toman estas condiciones: 
        //-que el tipito quiera agregar adicionales
        //-no puede repetir adicionales
        //-no puede agregar mas de las que tenemos disponibles

while(resp==0 || items[4]==0) {
            
            //el vector items funciona como una lista a la que se agregan
            //los servicios contratados, sea cobertura principal o adicionales
            
            //determinamos la posicion en el vector items para el adicional 
            for(int h=0; h<items.length; h++){   
                    if (items[h] == 0 ){
                        posicion = h;
                        //System.out.println(+posicion+ " Posicion vacia");
                        break;
                    }
                        
            }
            
            resp = JOptionPane.showConfirmDialog(null, 
   "Desea agregar adicionales?",null, JOptionPane.YES_NO_OPTION);
            
            //tomamos la respuesta 
            if (resp == 0){//dijo que si
            //combobox con adicionales
            valorTS = (String) JOptionPane.showInputDialog(null,
                    "Seleccione adicionales", "",
                    JOptionPane.QUESTION_MESSAGE,null,
                    adicionales,adicionales[0]);
            
                    //seleccionamos los primeros tres caracteres del string
                    String sCadena = valorTS;
                    String sSubCadena = sCadena.substring(0,3);
                    //lo convertimos en entero. listaprecios tiene valores enteros
                    valorTI = Integer.parseInt(sSubCadena);
                    //System.out.println("el adicional elegido es " +valorTI); 
                    
                    //chequeamos si el valor ya esta ingresado
                    for(int i=0; i<items.length; i++){
                        if (items[i] == valorTI){
                        JOptionPane.showMessageDialog(null, 
                                "No puede elegir un adicional ya incluido en la poliza", 
                                "Atencion!", JOptionPane.WARNING_MESSAGE);
                       
                        valorTI = 0;
                        break;
                        } else {
                        
                        
                        } 
                        
                    }  
                 
                items[posicion] = valorTI;
                    
            } else {
                JOptionPane.showMessageDialog(null, 
                                "No se agregaran mas adicionales", 
                                "Informacion", 
                                JOptionPane.INFORMATION_MESSAGE);
                items[4] = 1;//recordar ignorar valor!!!
            }       
        
            if (items[4] >0){
                resp = 1;
            }
                
} 
        

        ////////////////////////////////////////////////////////////////////////////
        //////////////////////  ACA HACEMOS LOS CALCULOS  //////////////////////////
        ////////////////////////////////////////////////////////////////////////////
        
  
        //Calculamos plus por antiguedad
        
        if (antiguedad <= 5){
            plusxantiguedad = 500;
        } else if (antiguedad > 5 && antiguedad < 10){
            plusxantiguedad = 1000;     
        }  else if (antiguedad >= 10 && antiguedad <= 15){
            plusxantiguedad = 1000;     
        }  else {
            plusxantiguedad = 2000;    
        }
        
        
        //Recorremos items para ver que codigos / servicios cargo
        //si las encuentra, tiene que sumar los valores en pesos
        for(int i=0; i<items.length; i++){   
                //recorremos la lista de precios buscando los items
                for(int filas=0;filas<listaprecios.length;filas++){
                    for(int columnas=0;columnas<listaprecios[filas].length;columnas++){
                    //cuando encuentra el codigo comun entre items y lista de precios..suma
                            if(listaprecios[filas][columnas]==(items[i])){
                            valorcobertura = valorcobertura + listaprecios[+filas][+columnas+1];
                            }
                    }
                }          
        }
        
        //ahora sumamos antiguedad mas valorcobertura
        valorcuota = plusxantiguedad + valorcobertura;
       
        
        
        ImageIcon print = new ImageIcon("src/img/print.png");
        JOptionPane.showMessageDialog(null,"Todos los datos se ingresaron con exito\n Precion ok para imprimir la poliza.", "Imprimir",JOptionPane.INFORMATION_MESSAGE,print);
    
        
        ////////////////////////////////////////////////////////////////////////////
        //////////////////////  ACA IMPRIMIMOS LA POLIZA  //////////////////////////
        ////////////////////////////////////////////////////////////////////////////
        
        System.out.println("=============== LE COMTE SEGUROS =================");
        System.out.println("*Los Patos 3650 - Ciudad Autonoma de Buenos Aires*");
        System.out.println("==================================================");
        System.out.println("================ POLIZA DE SEGUROS ===============");
        System.out.println("--------------------------------------------------");
        
        //Detalles datos cliente
        for(int i=0; i<infocliente.length; i++){   
                switch (i){
                        case 0:
                        texto = "Nombre";
                        break;
                        case 1:
                        texto = "Apellido";
                        break;
                        case 2:
                        texto = "Telefono";
                        break;
                        case 3:
                        texto = "Email";
                        break;
                        default:
                        break;
                    }
                System.out.println(""+texto+ ": " +infocliente[i]);
        }
        System.out.println("--------------------------------------------------");
        
        //Detalles datos auto cliente
        for(int i=0; i<infoauto.length; i++){   
                 switch (i){
                        case 0:
                        texto = "Marca";
                        break;
                        case 1:
                        texto = "Modelo";
                        break;
                        case 2:
                        texto = "Dominio";
                        break;
                        case 3:
                        texto = "Antiguedad";
                        break;
                        default:
                        break;
                    }
                System.out.println(""+texto+ ": " +infoauto[i]);
        }
        
        System.out.println("--------------------------------------------------");
        
        //Detalle de cobertura
        System.out.println("Antiguedad: " +antiguedad+ " años");
        
        for(int i=0; i<items.length; i++){   
            if (items[i] > 1){
                    if (i == 0){
                    System.out.println("Cobertua principal: "+items[i]);      
                    } else {
                    System.out.println("Adicional: "+items[i]);   
                    }       
                
            } else {
                
            }
                
            
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Valor cuota total: " +valorcuota+ " pesos");
        System.out.println("Fecha: " +fecha2);
        System.out.println("Poliza N°: " +npoliza);
        System.out.println("--------------------------------------------------"); 
        System.out.println("--------------------------------------------------");
  }     
    
}