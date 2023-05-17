/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class Joptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
                
                String nombre;
                
                
                //JOptionPane.showMessageDialog(null, "Este es un mensaje de informacion", "Mensaje de informacion", JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(null, "Este es un mensaje de alerta", "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
                //JOptionPane.showMessageDialog(null, "Este es un mensaje de error", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showMessageDialog(null, "Este es un mensaje de pregunta", "Mensaje de pregunta", JOptionPane.QUESTION_MESSAGE);
                
                //inputde JOPTION
                //nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "INPUT", JOptionPane.QUESTION_MESSAGE);
                
                //JOptionPane.showMessageDialog(null, "El nombre del tipito es: " +nombre, "Mensaje de alerta", JOptionPane.WARNING_MESSAGE);
                
                
                //int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para multiplicar por 2"));
                //int resultado = numero *2;
                

                ImageIcon bien = new ImageIcon("src/imagenes/bien.png");
                JOptionPane.showMessageDialog(null,"Muy bien!!", "Su mensaje es positivo",JOptionPane.INFORMATION_MESSAGE,bien);
                
               
    }
    
}
