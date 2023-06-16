
package encapsulamiento;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Libreria.Funciones;

public class Encapsulamiento {
    
    public static void main(String[] args) {
    
    ImageIcon inicio = new ImageIcon("src/img/inicio.jpg");
    ImageIcon menu = new ImageIcon("src/img/menu.jpg");
    ImageIcon color = new ImageIcon ("src/img/color.jpg");
    ImageIcon peso = new ImageIcon ("src/img/peso.jpg");
    ImageIcon M1 = new ImageIcon("src/img/m1.jpg");
    ImageIcon M2 = new ImageIcon("src/img/m2.jpg");
    
    //variables de uso temporal
    int programaS = 0;
    int kilosIn = 0;
    int cargaOK = 0;
    String peso2 = "";
    int tipoderopa = 0;
    String valorTS = null;
    int modeloS = 0;
    
    //Creamos vectores necesarios para los modelos...
    int cantModelos = 2;
    
    String [] modelos = new String [cantModelos];
        modelos[0] = "1 - Carga Frontal Inverter 20kg";
        modelos[1] = "2 - Carga Superior Next 10kg";
        
    String [] programas = new String [4];//tipo de ropa
        programas[0] = "1 - Programa Normal";
        programas[1] = "2 - Economico";
        programas[2] = "3 - Ropa Sucia";//lavado dura el doble de programa normal
        programas[3] = "4 - Roba delicada";//menor tiempo de lavado
    
    //determinamos la carga maxima teniendo en cuenta programa y modelo
    int [] cargaMax = new int  [8];
    cargaMax[0]= 20;
    cargaMax[1]= 10;
    cargaMax[2]= 10;
    cargaMax[3]= 5;
    cargaMax[4]= 20;
    cargaMax[5]= 10;
    cargaMax[6]= 10;
    cargaMax[7]= 5;
    
    //determinamos el tiempo de los procesos teniendo en cuenta programa y modelo
    int [] tiemposP = new int  [32];
        tiemposP[0] = 15;
        tiemposP[1] = 7;
        tiemposP[2] = 30;   
        tiemposP[3] = 20;
        tiemposP[4] = 10;
        tiemposP[5] = 5; 
        tiemposP[6] = 7;
        tiemposP[7] = 4;
        tiemposP[8] = 7; 
        tiemposP[9] = 4;
        tiemposP[10] = 20;
        tiemposP[11] = 10; 
        tiemposP[12] = 10;
        tiemposP[13] = 3;
        tiemposP[14] = 5; 
        tiemposP[15] = 4;
        tiemposP[16] = 15;
        tiemposP[17] = 7;   
        tiemposP[18] = 60;
        tiemposP[19] = 30;
        tiemposP[20] = 10; 
        tiemposP[21] = 5;
        tiemposP[22] = 7;
        tiemposP[23] = 4; 
        tiemposP[24] = 7;
        tiemposP[25] = 4;
        tiemposP[26] = 20; 
        tiemposP[27] = 10;
        tiemposP[28] = 5;
        tiemposP[29] = 3; 
        tiemposP[30] = 5;
        tiemposP[31] = 4; 
     
    //variables para resultados
    int cargaMaximaS = 0;//la carga maxima que se determine
    int tiempoLlenadoS = 0;
    int tiempoLavadoS = 0;
    int tiempoVaciadoS = 0;
    int tiempoCentrifugadoS = 0;
    int tiempoTotalPrograma = 0;
    

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++ COMIENZA INTERFAZ DEL USUARIO +++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    //1 - Inicio - Elige modelo
    while (valorTS == null){ 
        valorTS = (String) JOptionPane.showInputDialog(null,
                    "Seleccione modelo de su lavarropas ", 
                    "Bienvenido a Drean!",
                    JOptionPane.QUESTION_MESSAGE,
                    inicio,
                    modelos,modelos[0]);
                    
                if (valorTS != null){
                        //seleccionamos solo el primer caracter..
                        String previa = valorTS.substring(0,1);
                        modeloS = Integer.parseInt( previa);
                            
                }
                                  
    }  
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    //2 - mensaje de bienvenida, cambia icono de acuerdo al modelo
    if (modeloS == 1){ 
       JOptionPane.showMessageDialog(null, 
            ""+valorTS,
            "Bienvenido a tu lavarropas",
            JOptionPane.INFORMATION_MESSAGE,
            M1); 
    }else {
        JOptionPane.showMessageDialog(null, 
            ""+valorTS,
            "Bienvenido a tu lavarropas",
            JOptionPane.INFORMATION_MESSAGE,
            M2); 
    }
    
    
    valorTS = null;
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //3 - Elige programa
    while (valorTS == null){ 
        valorTS = (String) JOptionPane.showInputDialog(null,
                    "", 
                    "Seleccione el programa",
                    JOptionPane.QUESTION_MESSAGE,
                    menu,
                    programas,programas[0]);
                    
                if (valorTS != null){
                        //seleccionamos solo el primer caracter..
                        String previa = valorTS.substring(0,1);
                        programaS = Integer.parseInt( previa);
                             
                }                           
    }    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //3 - Elige color o blanca
    tipoderopa = JOptionPane.showOptionDialog(null,
            "Por favor seleccionar el tipo de ropa", 
            "Tipo de ropa", 
            0, 
            JOptionPane.QUESTION_MESSAGE, 
            color, 
            new Object [] {"Color", "Blanca"}, 
            "color");
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    //System.out.println("El modelo seleccionado es: " +modeloS);
    //System.out.println("El programa seleccionado es: " +programaS);
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //4 - De acuerdo al programa elegido y al modelo, determinamos la carga maxima
    switch (programaS){
        case 1://programa normal
             if (modeloS == 1){//modelo 1
                cargaMaximaS = cargaMax[0];
            } else{//modelo 2
                cargaMaximaS = cargaMax[1];
            }
        break;
        case 2://programa economico
            if (modeloS == 1){//modelo 1
                cargaMaximaS = cargaMax[2];
            } else{//modelo 2
                cargaMaximaS = cargaMax[3];
            }
        break;
        case 3://programa Ropa sucia
            if (modeloS == 1){//modelo 1
                cargaMaximaS = cargaMax[4];
            } else{//modelo 2
                cargaMaximaS = cargaMax[5];
            }
        break;
        case 4://programa Ropa delicada
            if (modeloS == 1){//modelo 1
                cargaMaximaS = cargaMax[6];
            } else{//modelo 2
                cargaMaximaS = cargaMax[7];
            }
        break;
    }    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //5 - Sensamos el peso de la ropa ingresada. Ingresa valor por input
    //validamos el valor ingresado
    
    do{
        peso2 = (String) JOptionPane.showInputDialog(null,
            "La carga maxima segun tu modelo\n "
                + "y programa seleccionado es: "
                +cargaMaximaS+"kg\n"
                +"Ingrese los kilos de ropa", 
            "Peso de la ropa", 
            JOptionPane.QUESTION_MESSAGE,
            peso,
            null,
            "");
            
            //pasamos el valor ingresado a entero
            kilosIn = Integer.parseInt(peso2);
            
            //validamos si el peso es correcto
                if (kilosIn <= cargaMaximaS){
                 JOptionPane.showMessageDialog(null,
                                      "Los " +kilosIn+ " kilos"
                                                 +" pueden lavarse", 
                                         "Todo listo para comenzar!",
                                         JOptionPane.INFORMATION_MESSAGE); 
                    cargaOK = 1;
                }else {
                JOptionPane.showMessageDialog(null,
                                      "Los " +kilosIn+ " kilos"
                                                 + " exceden la carga", 
                                         "Exceso de carga!",
                                         JOptionPane.WARNING_MESSAGE); 
                cargaOK = 0;       
                }
            
   }while (cargaOK == 0);
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //6 - segun el modelo y el programa seleccionado determinamos los tiempos
    //de llenado, lavado, vaciado y centrifugado
    
    switch (programaS){
        case 1://programa normal
            if (modeloS == 1){//modelo 1
                tiempoLlenadoS = tiemposP[0];
                tiempoLavadoS = tiemposP[2];
                tiempoVaciadoS = tiemposP[4];
                tiempoCentrifugadoS = tiemposP[6];
            } else{//modelo 2
                tiempoLlenadoS = tiemposP[1];
                tiempoLavadoS = tiemposP[3];
                tiempoVaciadoS = tiemposP[5];
                tiempoCentrifugadoS = tiemposP[7];
            }
        break;  
        case 2://programa economico
            if (modeloS == 1){//modelo 1
                tiempoLlenadoS = tiemposP[8];
                tiempoLavadoS = tiemposP[10];
                tiempoVaciadoS = tiemposP[12];
                tiempoCentrifugadoS = tiemposP[14];
            } else{//modelo 2
                tiempoLlenadoS = tiemposP[9];
                tiempoLavadoS = tiemposP[11];
                tiempoVaciadoS = tiemposP[13];
                tiempoCentrifugadoS = tiemposP[15];
            }
        break;   
        case 3://Ropa sucia
            if (modeloS == 1){//modelo 1
                tiempoLlenadoS = tiemposP[16];
                tiempoLavadoS = tiemposP[18];
                tiempoVaciadoS = tiemposP[20];
                tiempoCentrifugadoS = tiemposP[22];
            } else{//modelo 2
                tiempoLlenadoS = tiemposP[17];
                tiempoLavadoS = tiemposP[19];
                tiempoVaciadoS = tiemposP[21];
                tiempoCentrifugadoS = tiemposP[23];
            }
        break; 
        case 4://Ropa delicada
            if (modeloS == 1){//modelo 1
                tiempoLlenadoS = tiemposP[24];
                tiempoLavadoS = tiemposP[26];
                tiempoVaciadoS = tiemposP[28];
                tiempoCentrifugadoS = tiemposP[30];
            } else{//modelo 2
                tiempoLlenadoS = tiemposP[25];
                tiempoLavadoS = tiemposP[27];
                tiempoVaciadoS = tiemposP[29];
                tiempoCentrifugadoS = tiemposP[31];
            }
        break; 
        default:
        break;    
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //7- Le mostramos al tipito todos los valores procesados y listo
    //para arrancar el lavado
    tiempoTotalPrograma = tiempoLlenadoS + tiempoLavadoS + tiempoVaciadoS + tiempoCentrifugadoS;
    
    JOptionPane.showMessageDialog(null,
                "Modelo: "+modeloS+ "\n"
                +"Carga de tambor: " +kilosIn+ " kilos\n"
                +"Programa elegido: "+ programaS+ "\n" 
                +"Llenado: "+tiempoLlenadoS+ " minutos\n"
                +"Lavado: "+tiempoLavadoS+ " minutos\n"
                +"Vaciado: "+tiempoVaciadoS+ " minutos\n"
                +"Centrifugado: "+tiempoCentrifugadoS+ " minutos\n\n"
                +"Tiempo total del programa: "+tiempoTotalPrograma+ " minutos",
               "Todo listo para comenzar!",
               JOptionPane.INFORMATION_MESSAGE); 
    
 
    Funciones MSG = new Funciones(tiempoLlenadoS,tiempoLavadoS,tiempoVaciadoS,tiempoCentrifugadoS);

    MSG.ciclofinalizado();
    
    }
    
    
}
