
package ejercicio13;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public abstract class operaciones_padre {
     protected int valor1,valor2,valor3,resultados;
     
      ImageIcon intro = new ImageIcon("src/imagen/intro.png");
     
      public void intro(){
        
            //Metodo para pedir valores
            JOptionPane.showMessageDialog(null,
                "Podra realizar las operaciones de suma y resta con Polimorfismo",
                "Bienvenidos a Calculin",
                JOptionPane.INFORMATION_MESSAGE,intro);
              }
      
      public void pedir_datos(){
             String v1 = (String) JOptionPane.showInputDialog(null, 
                    "Ingrese el primer valor",
                    "Calculin suma y resta",
                    JOptionPane.QUESTION_MESSAGE,
                    intro,
                    null,
                    "");
      
             String v2 = (String) JOptionPane.showInputDialog(null, 
                    "Ingrese el segundo valor",
                    "Calculin suma y resta",
                    JOptionPane.QUESTION_MESSAGE,
                    intro,
                    null,
                    "");
             
             valor1 = Integer.parseInt(v1);
             valor2 = Integer.parseInt(v2);
       }
    
      public abstract void Operaciones();
      public abstract void mostrar();
      
      
    
}
