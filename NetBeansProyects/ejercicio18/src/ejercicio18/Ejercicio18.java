
package ejercicio18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejercicio18 extends JFrame implements ActionListener{
 //formulario con dos campos input, un boton "comparar" y dos etiquetas consigna y resultado   
    
    //declaramos los objetos
    public JLabel labelt1, labelt2,respuesta;
    public JButton comparar;
    public JTextField textbox1, textbox2;
   
    int valor1 = 0;
    int valor2 = 0;
    
    //**************************************************************************
    //creamos los elementos del formulario
    public Ejercicio18(){
        setLayout(null);

    //etiqueta labelt1
        labelt1 = new JLabel("Ingrese el Valor 1");
        labelt1.setBounds(10, 10, 150, 30);
        add(labelt1);
        
    //etiqueta labelt2
        labelt2 = new JLabel("Ingrese el Valor 2");
        labelt2.setBounds(10, 50, 150, 30);
        add(labelt2);
    
    //creamos botones
        comparar = new JButton("Comparar");
        comparar.setBounds(10, 100, 90, 30);
        add(comparar);
        comparar.addActionListener(this);//vincula el objeto a la accion listener 
        
    //etiqueta respuesta. Queda vacia porque la seteamos despues
        respuesta = new JLabel("");
        respuesta.setBounds(10, 150, 200, 30);
        add(respuesta);
        
     //input para valor 1
        textbox1 = new JTextField();
        textbox1.setBounds(160, 10, 150, 30);
        add(textbox1);
        
    //input para valor 2
        textbox2 = new JTextField();
        textbox2.setBounds(160, 50, 150, 30);
        add(textbox2);
        
       
    }
    //**************************************************************************
    //**************************************************************************
    //
     //aca recibimos cuando apreta los botones
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == comparar){
            //chequeamos si toma los valores. Comentar despues
            //System.out.println(textbox1.getText());
            //System.out.println(textbox2.getText());
            
            //cargamos variables para hacer la operacion de comparacion
            valor1 = Integer.parseInt(textbox1.getText());
            valor2 = Integer.parseInt(textbox2.getText());    
                if (valor1 > valor2){
                    respuesta.setText("El valor 1 es mayor que el valor 2");
                } else {
                   respuesta.setText("El valor 2 es mayor que el valor 1"); 
                }
        }
                
}          
    
    
    public static void main(String[] args) {
       Ejercicio18 ventana = new Ejercicio18();
        
        ventana.setBounds(0, 0, 600, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Doble texfield");
    }
    
}
