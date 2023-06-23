
package operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class operaciones {
    
    //creamos una variable para set y get. Dispositivo porq eso determina el resto
    public int dispositivo;
    public String ncliente,marca, modelo,bateria,desperfecto,diferencial;
    
    ImageIcon logo = new ImageIcon("src/imagenes/logo.jpg");
    ImageIcon cliente = new ImageIcon("src/imagenes/cliente.jpg");
    ImageIcon marcas = new ImageIcon("src/imagenes/marcas.jpg");
    ImageIcon aparatos = new ImageIcon("src/imagenes/aparatos.jpg");
    ImageIcon baterias = new ImageIcon("src/imagenes/baterias.jpg");
    ImageIcon herramientas = new ImageIcon("src/imagenes/herramientas.jpg");
    
    public void setdispositivo(int dispositivo){
        this.dispositivo = dispositivo;
    }    

    public int getdispositivo(){
    return dispositivo;
    }      
    
    //ejecutamos la consulta por los puntos que todos los elementos tienen en comun
    
    public void formulario(){
    
  
        ncliente = (String) JOptionPane.showInputDialog(null,
            "Ingrese nro del cliente :",
            "Ficha de ingreso",
            JOptionPane.QUESTION_MESSAGE, 
            cliente,
            null,
            "");
        
        //System.out.println("Nro de cliente : " +ncliente);
        
    //*************************************************************************   
          //vector para marcas
            String [] marcass = new String [6];
            marcass[0] = "Philco";
            marcass[1] = "Motorola";
            marcass[2] = "Noblex";
            marcass[3] = "Samsung";
            marcass[4] = "Asus";
            marcass[5] = "Toshiba";
            
        //preguntamos por las marcas
        
        do {
        marca = (String) JOptionPane.showInputDialog(null,
                    "Seleccione la marca del producto", 
                    "Ficha de ingreso",
                    JOptionPane.QUESTION_MESSAGE,
                    marcas,marcass,marcass[0]);
        } while (marca == null);  
        
        //System.out.println("Marca : " +marca);
        
    //*************************************************************************
    
        do {
        modelo = (String) JOptionPane.showInputDialog(null,
            "Ingrese el Modelo",
            "Ficha de ingreso",
            JOptionPane.QUESTION_MESSAGE, aparatos,
            null,
            "");
        } while (modelo == null); 
        
        //System.out.println("Modelo : " +modelo);
    
    //*************************************************************************
    
    //vector para tipo de baterias
            String [] bateriass = new String [4];
            bateriass[0] = "3000ma - 5hs";
            bateriass[1] = "4000ma - 9hs";
            bateriass[2] = "7000ma - 12hs";
            bateriass[3] = "Otra";
           
        do {
        bateria = (String) JOptionPane.showInputDialog(null,
                    "Seleccione tipo de bateria", 
                    "Ficha de ingreso",
                    JOptionPane.QUESTION_MESSAGE,
                    baterias,bateriass,bateriass[0]);
        } while (bateria == null);  
        
        //System.out.println("Bateria : " +bateria);
    
    //*************************************************************************
    
        do {
        desperfecto = (String) JOptionPane.showInputDialog(null,
            "Desperfecto",
            "Ficha de ingreso",
            JOptionPane.QUESTION_MESSAGE, 
            herramientas,
            null,
            "");
        
        } while (desperfecto == null); 
    
        //System.out.println("Desperfecto : " +desperfecto);
        
    
    }
    
     //*************************************************************************
    public void mostrarficha(){
      System.out.println("************ ESTE ES EL REGISTRO ****************" );
      System.out.println("Nro de cliente : " +ncliente);
      System.out.println("Marca : " +marca);
      System.out.println("Modelo : " +modelo);
      System.out.println("Detalle : " +diferencial);
      System.out.println("Bateria : " +bateria);
      System.out.println("Desperfecto : " +desperfecto);
      
    }
}
    
    
    
    
    

