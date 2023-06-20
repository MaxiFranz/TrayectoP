
package areaderectangulo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class solicitadatos {
    

    String valorTS = "";
    int base = 0;
    int altura = 0;
    
    calculadora c2 = new calculadora();
    tools c3 = new tools(); 
    
    public void pedirdatos(){
            do {
            valorTS = (String) JOptionPane.showInputDialog(null,
                    "Ingresar la base del rectangulo", 
                    "Comencemos!",
                    JOptionPane.QUESTION_MESSAGE); 
            } while (valorTS == null || valorTS.isEmpty());
    //pasamos a tools lo que ingreso el tipito        
    c3.valorTS = valorTS;
    c3.stringtoint();
    //recuperamos el valor y cargamos la variable
    base = c3.valorTI;
    
    //cuando base ya no es 0, pide la altura
    if (base >= 0){
            do {
            valorTS = JOptionPane.showInputDialog(null, 
                        "Ingrese la altura del rectangulo", "Segundo paso", 
                        JOptionPane.QUESTION_MESSAGE); 
            } while (valorTS == null || valorTS.isEmpty());
            //pasamos a tools lo que ingreso el tipito        
            c3.valorTS = valorTS;
            c3.stringtoint();
            //recuperamos el valor y cargamos la variable
            altura = c3.valorTI;
        }
    //pasamos los valores a clase calculadora
    System.out.println("Base: " +base);
    System.out.println("Altura: " +altura);
        if (base >= 0 && altura >= 0){
            c2.base = base;
            c2.altura = altura;
            //ejecutamos el metodo que esta en clase calculadora
            c2.calculaarea();
        }
    
  
    }
   
    
}
