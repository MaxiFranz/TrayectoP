 /**
  * Crear un formulario en el cual se solicite 3 notas y se realice un promedio 
  * de la nota de un alumno. Al presionar el botón debe decir si el alumno aprobo
  * indicando la nota final.
 */

package ejercicio20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio20 extends JFrame implements ActionListener{

//necesitamos 3 input y 4 variables: nota1, nota2, nota3, promedio
    
    //declaramos los objetos
    public JLabel l_nota1, l_nota2,l_nota3, l_promedio;
    public JButton promediar;
    public JTextField textbox1, textbox2, textbox3;
   
    //aca las variables para guardar los valores y el promedio
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    int promedio = 0;
    
    //**************************************************************************
    //creamos los elementos del formulario
    public Ejercicio20(){
        setLayout(null);

    //etiqueta 1
        l_nota1 = new JLabel("Nota 1");
        l_nota1.setBounds(10, 10, 150, 30);
        add(l_nota1);
        
    //etiqueta 2
        l_nota2 = new JLabel("Nota 2");
        l_nota2.setBounds(10, 50, 150, 30);
        add(l_nota2);
    
    //etiqueta 3
        l_nota3 = new JLabel("Nota 3");
        l_nota3.setBounds(10, 90, 150, 30);
        add(l_nota3);
        
    //etiqueta respuesta. Queda vacia porque la seteamos despues
        l_promedio = new JLabel("");
        l_promedio.setBounds(160, 180, 200, 30);
        add(l_promedio); 
        
    //**************************************************************************     
    
    //input para valor 1
        textbox1 = new JTextField();
        textbox1.setBounds(160, 10, 150, 30);
        add(textbox1);
        
    //input para valor 2
        textbox2 = new JTextField();
        textbox2.setBounds(160, 50, 150, 30);
        add(textbox2);
        
    //input para valor 3
        textbox3 = new JTextField();
        textbox3.setBounds(160, 90, 150, 30);
        add(textbox3);
    
    //**************************************************************************
    
    //creamos boton
        promediar = new JButton("Calcular promedio");
        promediar.setBounds(160, 130, 150, 30);
        add(promediar);
        promediar.addActionListener(this);//vincula el objeto a la accion listener
    
    }
    //**************************************************************************
    //**************************************************************************
    //
    //aca recibimos cuando apreta los botones
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == promediar){
            //chequeamos si toma los valores. Comentar despues
            //System.out.println(textbox1.getText());
            //System.out.println(textbox2.getText());
            
            //cargamos variables para hacer la operacion de comparacion
            nota1 = Integer.parseInt(textbox1.getText());
            nota2 = Integer.parseInt(textbox2.getText());   
            nota3 = Integer.parseInt(textbox3.getText());
            
            //chequeamos si toma los valores. Comentar despues
            //System.out.println(nota1);
            //System.out.println(nota2);
            //System.out.println(nota3);
            //calculamos el promedio
            promedio = (nota1+nota2+nota3)/3;
            l_promedio.setText("El promedio de notas es: " +promedio);
        }
                
}          
    public static void main(String[] args) {
         Ejercicio20 ventana = new Ejercicio20();
        
        ventana.setBounds(0, 0, 600, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Calculadora de promedios");
    }
    
}
