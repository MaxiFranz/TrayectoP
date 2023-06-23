
package poo.ejercicio12;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import operaciones.operaciones;

import operaciones.v1;
import operaciones.v2;
import operaciones.v3;


public class POOEjercicio12 {

    public static void main(String[] args) {
        
        operaciones oper = new operaciones();
        
        
        ImageIcon logo = new ImageIcon("src/imagenes/logo.jpg");
        
        String valorTS = "null";
        int valorTI = 0;
      
        //Lista de elementos que se pueden recepcionar
        
        String [] artefactos = new String [3];
        artefactos[0] = "1 - Celulares";
        artefactos[1] = "2 - Tablets";
        artefactos[2] = "3 - Televisores";
        
        //1 - bienvenida
        JOptionPane.showMessageDialog(null, 
            "Bienvenido al registro de reparaciones", 
            "Tecnolab - Servicio Tecnico",
            JOptionPane.INFORMATION_MESSAGE,logo); 
    
        //2 - Tiene que elegir que aparato va a ingresar
        do {
            valorTS = (String) JOptionPane.showInputDialog(null,
                    "Seleccione el articulo a ingresar", 
                    "",
                    JOptionPane.QUESTION_MESSAGE,
                    null,artefactos,artefactos[0]);
        } while (valorTS == null);  
        //grabamos el aparato ingresado en la ficha
  
        String sCadena = valorTS;
        //seleccionamos los primeros tres caracteres del string
        String sSubCadena = sCadena.substring(0,1);
        //lo convertimos en entero. listaprecios tiene valores enteros
        valorTI = Integer.parseInt(sSubCadena);
        
        //3 - seteamos atributo dispositivo
        oper.setdispositivo(valorTI);
        //4 - recuperamos el valor que se paso prueba. Comentar linea
        System.out.println("Dispositivo elegido es: " +oper.getdispositivo());
        
        
        if (oper.getdispositivo() == 1){
        v1 msj1 = new v1();   
        msj1.formulario();
        msj1.bandared();
        msj1.mostrarficha();
        } else if (oper.getdispositivo() == 2){
        v2 msj2 = new v2(); 
        msj2.formulario();
        msj2.conecdispositivos();
        msj2.mostrarficha();
        } else {
        v3 msj3 = new v3();
        msj3.formulario();
        msj3.tipotv();
        msj3.mostrarficha();
       }
       
    }

   
}
