
package maxi.ejercicio16;

import javax.swing.JOptionPane;


public class MaxiEjercicio16 {

  
    public static void main(String[] args) {
        
        String usuarioR = "maxi";
        String claveR = "curso";
        
        String usuarioD = "";
        String claveD = "";
        
        
        do {
        //pedimos usuario
        usuarioD = JOptionPane.showInputDialog(null, "Ingrese su usuario", "INPUT", JOptionPane.QUESTION_MESSAGE);
        //pedimos clave
        claveD = JOptionPane.showInputDialog(null, "Ingrese su clave", "INPUT", JOptionPane.QUESTION_MESSAGE);
        //chequeamos
        if (usuarioR.equals(usuarioD) && claveR.equals(claveD)){
        //si coincide sale del do while
        
        } else {
        //mensaje de que coinciden    
        JOptionPane.showMessageDialog(null, "Atencion", "El usuario y/o la clave no son validas!", JOptionPane.WARNING_MESSAGE);
        }
        
        } while (!usuarioR.equals(usuarioD) && !claveR.equals(claveD));
     
        JOptionPane.showMessageDialog(null, "EXITO!", "El login es correcto. Bienvenido", JOptionPane.INFORMATION_MESSAGE);    
    }
    
}
