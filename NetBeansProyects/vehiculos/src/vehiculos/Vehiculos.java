
package vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vehiculos {

    public static void main(String[] args) {
        //declaramos variables necesarias
        String marca = "";
        String modelo = "";
        String estado = "";
        String rutaimag = "";

        int kilometraje = 0; 
        
        //comienza el programa
        ImageIcon bienvenida = new ImageIcon("src/img/cuentakilometros.jpg");
        JOptionPane.showMessageDialog(null,"", "Bienvenido!",JOptionPane.INFORMATION_MESSAGE,bienvenida);
    
        autos c1 = new autos();
        
        //ejecutamos primer metodo
        c1.completaficha();//ejecutamos el metodo
        //recuperamos valores y cargamos variables
        marca = c1.variable1;
        modelo = c1.variable2;
        
        kilometraje = c1.kilometraje;

        // ejecutamos segundo metodo
        c1.kilometraje = kilometraje;//le pasamos el valor
        c1.estadoAuto(); //ejecutamos metodo
        //recuperamos valores
        estado = c1.label;
        rutaimag = c1.rutaimag;
        
        //mostramos todo en un pop up!
        ImageIcon imagen = new ImageIcon(""+rutaimag);
        JOptionPane.showMessageDialog(null,"El auto "+marca+ " modelo " +modelo+ " esta "+estado, "",JOptionPane.INFORMATION_MESSAGE,imagen);
    
    }
    
}
