
package operaciones;

//televisores

import javax.swing.JOptionPane;

public class v3 extends operaciones{

    public void tipotv() {
   //vector para tipo de red
            String [] tipotv = new String [4];
            tipotv[0] = "Full HD";
            tipotv[1] = "QHD";
            tipotv[2] = "UHD";
            tipotv[3] = "Tv Analogica";
            
        do {
        diferencial = (String) JOptionPane.showInputDialog(null,
                    "Seleccione Tipo de TV", 
                    "Ficha de ingreso",
                    JOptionPane.QUESTION_MESSAGE,
                    null,tipotv,tipotv[0]);
        } while (diferencial == null);  
        
       //System.out.println("Detalle : " +diferencial);
    }

}