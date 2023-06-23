
package operaciones;

//tablets

import javax.swing.JOptionPane;

public class v2 extends operaciones{
    
   public void conecdispositivos(){
       
        //vector para tipo de red
            String [] conectdisp = new String [4];
            conectdisp[0] = "Dispositivos por USB";
            conectdisp[1] = "Dispositivos por Bluethoot";
            conectdisp[2] = "Dispositivos por WIFI";
            conectdisp[3] = "Multiples conecciones";
            
        do {
        diferencial = (String) JOptionPane.showInputDialog(null,
                    "Seleccione modo coneccion de dispositivos", 
                    "Ficha de ingreso",
                    JOptionPane.QUESTION_MESSAGE,
                    null,conectdisp,conectdisp[0]);
        } while (diferencial == null);
        
        System.out.println("Detalle : " +diferencial);
        
        
    }
}
