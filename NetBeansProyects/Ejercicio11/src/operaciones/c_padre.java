
package operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class c_padre {
    //pide valores
    //imprime resultados
    
    //creamos atributos
    int resultado = 0;
    int valor1 = 0;
    int valor2 = 0;
    
    //cargamos imagenes
    ImageIcon logo = new ImageIcon("src/imagenes/calculin.jpg");
    ImageIcon icon = new ImageIcon("src/imagenes/icono.jpg");
    
    //metodo para pedir los valores
    public void pedirdatos(){
        
    JOptionPane.showMessageDialog(null, 
            "Podra realizar las operaciones con Herencia", 
            "Bienvenidos a calculin",
            JOptionPane.INFORMATION_MESSAGE,logo);   
    
    
    String v1 = (String) JOptionPane.showInputDialog(null,
            "Ingrese el valor 1",
            "",
            JOptionPane.QUESTION_MESSAGE,
            icon,
            null,
            "");
    
    String v2 = (String) JOptionPane.showInputDialog(null,
            "Ingrese el valor 2",
            "",
            JOptionPane.QUESTION_MESSAGE,
            icon,
            null,
            "");
   
    
    valor1 = Integer.parseInt(v1);
    valor2 = Integer.parseInt(v2);
    }
    
    //metodo para mostrar datos
    public void mostrardatos(){
         JOptionPane.showMessageDialog(null,
                "El resultado de la operacion fue : " + resultado,
                "Resultado de la Operacion",
                JOptionPane.INFORMATION_MESSAGE,logo);
    }
}
