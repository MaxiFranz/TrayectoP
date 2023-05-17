
package maxi.ejercicio16.pkg2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MaxiEjercicio162 {

    
    public static void main(String[] args) {
        
        String nombreQ = "Complete su Ficha personal";
        //creamos las variables solicitadas
        String nombre;
        String apellido;
        String edad;
        String telefono;
        
        //pedimos nombre
        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre", nombreQ, JOptionPane.QUESTION_MESSAGE);
        //pedimos clave
        apellido = JOptionPane.showInputDialog(null, "Ingrese apellido", nombreQ, JOptionPane.QUESTION_MESSAGE);
        //pedimos edad
        edad = JOptionPane.showInputDialog(null, "Ingrese edad", nombreQ, JOptionPane.QUESTION_MESSAGE);
        //pedimos clave
        telefono = JOptionPane.showInputDialog(null, "Ingrese telefono", nombreQ, JOptionPane.QUESTION_MESSAGE);
        
        //mostramos todo
        ImageIcon bien = new ImageIcon("src/imagenes/perfil.jpg");
        JOptionPane.showMessageDialog(null,"Nombre: " +nombre+ "\nApellido: " +apellido+ "\nEdad: " +edad+ 
                "\nTelefono: " +telefono, "Muy bien! su perfil esta completo",JOptionPane.INFORMATION_MESSAGE,bien);
        
        
        
    }
    
}
