
package operaciones;

import javax.swing.JOptionPane;

public class v1 extends operaciones {
    
    //celulares

    public void bandared() {
        
        //vector para tipo de red
            String [] redss = new String [3];
            redss[0] = "Red de 5G";
            redss[1] = "Red de 4G";
            redss[2] = "Red de 3G";
           
        do {
        diferencial = (String) JOptionPane.showInputDialog(null,
                    "Seleccione la red telefonica", 
                    "Ficha de ingreso",
                    JOptionPane.QUESTION_MESSAGE,
                    null,redss,redss[0]);
        } while (diferencial == null);   
        
        //System.out.println("Detalle : " +diferencial);
    }

   
    
    
    
    
}
