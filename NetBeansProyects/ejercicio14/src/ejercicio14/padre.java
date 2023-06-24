
package ejercicio14;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public abstract class padre {
    
    //va a seleccionar el tipo de vehiculo, el metodo y finalmente las instrucciones
    protected int vehiculo,metodo,instrucciones;
    String valorTS = ""; 
    
    ImageIcon intro = new ImageIcon("src/imagenes/intro.jpg");
    ImageIcon menu1 = new ImageIcon("src/imagenes/menu1.jpg");
    ImageIcon menu2 = new ImageIcon("src/imagenes/menu2.jpg");
    
    public void intro(){
        JOptionPane.showMessageDialog(null,
                "",
                "Aprenda a manejar!!",
                JOptionPane.INFORMATION_MESSAGE,intro);
    }
    
    
    public void seleccionevehiculo(){
        
        String [] rodados = new String [3];
        rodados[0] = "1 - Auto";
        rodados[1] = "2 - Moto";
        rodados[2] = "3 - Bus";
        
        do {
            valorTS = (String) JOptionPane.showInputDialog(null,
                    "Seleccione el vehiculo", 
                    "",
                    JOptionPane.QUESTION_MESSAGE,
                    menu1,rodados,rodados[0]);
        } while (valorTS == null);
        
        String sCadena = valorTS;
        //seleccionamos los primeros tres caracteres del string
        String sSubCadena = sCadena.substring(0,1);
        //lo convertimos en entero. 
        vehiculo = Integer.parseInt(sSubCadena);
        //System.out.println("El vehiculo elegido es el: " +vehiculo);
    }
    
    public void seleccionmetodo(){
        
        String [] acciones = new String [2];
        acciones[0] = "1 - Como estacionar en 4 pasos";//estacionar
        acciones[1] = "2 - Como arrancar en 5 segundos";//arrancar

        
        do {
            valorTS = (String) JOptionPane.showInputDialog(null,
                    "Seleccione que desea aprender", 
                    "",
                    JOptionPane.QUESTION_MESSAGE,
                    menu2,acciones,acciones[0]);
        } while (valorTS == null);
        
        String sCadena = valorTS;
        //seleccionamos los primeros tres caracteres del string
        String sSubCadena = sCadena.substring(0,1);
        //lo convertimos en entero. 
        metodo = Integer.parseInt(sSubCadena);
        //System.out.println("Metodo elegido: " +metodo);
    }
    
      public abstract void estacionar();
      public abstract void arrancar();       
      
      
}
