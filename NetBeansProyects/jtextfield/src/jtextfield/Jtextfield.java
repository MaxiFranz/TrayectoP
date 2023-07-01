
package jtextfield;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Jtextfield extends JFrame implements ActionListener{
    
    public JButton saludar,salida;
    public JLabel etiqueta,respuesta;
    public JTextField textbox;
    
    //aca va el constructor. Tiene que llamarse igual que la clase main
    public Jtextfield(){
        setLayout(null);
        
        //creamos una etiqueta
        etiqueta = new JLabel("Ingrese su nombre");//este es el constructor
        etiqueta.setBounds(10, 10, 600, 400);//atributos ubicacion y tamaño
        add(etiqueta);//lo agrega
        
        //creamos una segunda etiqueta
        respuesta = new JLabel("");
        respuesta.setBounds(10, 150, 600, 400);
        add(respuesta);
        
        //input box
        textbox = new JTextField();
        textbox.setBounds(120, 17, 150, 30);
        add(textbox);
        
        //creamos botones
        saludar = new JButton("Saludar");
        saludar.setBounds(10, 100, 90, 30);
        add(saludar);
        saludar.addActionListener(this);//vincula el objeto a la accion listener
        
        salida = new JButton("Salir");
        salida.setBounds(210, 200,90, 30);
        add(salida);
       salida.addActionListener(this);
        
    }   
    
    //************************************************************************* 
    //*************************************************************************
    
        //aca recibimos cuando apreta los botones
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == saludar){
            respuesta.setText("Hola " +textbox.getText());
        }else if (e.getSource()== salida){
            System.exit(0);
        }
                
}               
                
                
//*************************************************************************  
//*************************************************************************    
    public static void main(String[] args) {
        
      Jtextfield ventana1 = new Jtextfield();
      ventana1.setBounds(0, 0, 600, 400);
      ventana1.setVisible(true);
      ventana1.setLocationRelativeTo(null);
      ventana1.setResizable(false);
      ventana1.setTitle("Saludar");
      
    }
    
}
