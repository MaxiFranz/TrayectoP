/**
 * Tomar el ejercicio 20 y.. 
 * Agregar 3 imput con etiquetas (nombre,apellido y grado y división).
 * Calcular el promedio
 * si la nota mayor o igual a 6 Abrobo.
 * Indicar en un joption la información cargada y si aprobó con el resultado del promedio. 
 * Agregar pane con un color
 */
package ejercicio21;

import static java.awt.Color.blue;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Ejercicio21 extends JFrame implements ActionListener{

//**************************************************************************
        //declaramos los objetos
        public JLabel l_nota1, l_nota2,l_nota3, l_promedio,l_nombre,l_grado, l_division;
        public JTextField textbox1, textbox2, textbox3,textbox4,textbox5,textbox6;
        public JButton promediar;
    
        //aca las variables para guardar los valores y el promedio
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int promedio = 0;
        
        String s_nombre = "";
        String s_grado = "";
        String s_division = "";
        
//**************************************************************************
        
      public Ejercicio21(){ 
         
//*******************************************************etiquetas!!!!
        
//primer columna
        l_nombre = new JLabel("Alumno");
            l_nombre.setBounds(10, 10, 100, 30);       
            add(l_nombre); 
        
        l_grado = new JLabel("Grado");
            l_grado.setBounds(10, 50, 100, 30);
            add(l_grado); 
        
        l_division = new JLabel("Division");
            l_division.setBounds(10, 90, 100, 30);
            add(l_division);
            
//segunda columna
        l_nota1 = new JLabel("Nota 1");
            l_nota1.setBounds(280, 10, 150, 30);
            add(l_nota1);
        
        l_nota2 = new JLabel("Nota 2");
            l_nota2.setBounds(280, 50, 150, 30);
            add(l_nota2);
    
        l_nota3 = new JLabel("Nota 3");
            l_nota3.setBounds(280, 90, 150, 30);
            add(l_nota3);
        
        l_promedio = new JLabel("");
            l_promedio.setBounds(160, 180, 200, 30);
            add(l_promedio); 
    
//*******************************************************textfield!!!!!

        textbox1 = new JTextField();
            textbox1.setBounds(380, 10, 150, 30);
            add(textbox1);
        
        textbox2 = new JTextField();
            textbox2.setBounds(380, 50, 150, 30);
            add(textbox2);
        
        textbox3 = new JTextField();
            textbox3.setBounds(380, 90, 150, 30);
            add(textbox3);

            
        textbox4 = new JTextField();//nombre y apellido
            textbox4.setBounds(110, 10, 150, 30);
            add(textbox4);
        
        textbox5 = new JTextField();//grado
            textbox5.setBounds(110, 50, 150, 30);
            add(textbox5);
        
   
        textbox6 = new JTextField();//division
            textbox6.setBounds(110, 90, 150, 30);
            add(textbox6);
    
//creamos boton
        promediar = new JButton("Calcular promedio");
            promediar.setBounds(160, 130, 150, 30);
            add(promediar);
            promediar.addActionListener(this);//vincula el objeto a la accion listener  

//creamos Content Pane

 Container panel = getContentPane();
    panel.setLayout(null);           
    panel.setBackground(blue);
}   
      
public void actionPerformed(ActionEvent e) {
    
        ImageIcon aprobado = new ImageIcon("src/imagenes/aprobado.jpg");
        ImageIcon noaprobo = new ImageIcon("src/imagenes/noaprobo.jpg");
        
        if(e.getSource() == promediar){
            
            //cargamos variables para hacer la operacion de comparacion
            nota1 = Integer.parseInt(textbox1.getText());
            nota2 = Integer.parseInt(textbox2.getText());   
            nota3 = Integer.parseInt(textbox3.getText());
            
            s_nombre = textbox4.getText();
            s_grado = textbox5.getText();
            s_division = textbox6.getText();
            
            //chequeamos si toma los valores. Comentar despues
            //System.out.println(nota1);
            //System.out.println(nota2);
            //System.out.println(nota3);
            //System.out.println(s_nombre);
            //System.out.println(s_grado);
            //System.out.println(s_division);
            
            //calculamos el promedio
            promedio = (nota1+nota2+nota3)/3;
            //l_promedio.setText("El promedio de notas es: " +promedio);
            
            
            
            //mostramos todo de acuerdo a si aprobo o no
            if (promedio >= 6){
                   JOptionPane.showMessageDialog(null, 
                        "Alumno: " +s_nombre+ "\nGrado: " +s_grado+ 
                        "\nDivision: " +s_division+ "\nPromedio: " +promedio+
                        "\nMuy bien, el alumno aprobo la materia",
                        "CFP 36 - Resultado final",
                        JOptionPane.INFORMATION_MESSAGE,aprobado);  
                          
            } else {
                    JOptionPane.showMessageDialog(null, 
                        "Alumno: " +s_nombre+ "\nGrado: " +s_grado+ 
                        "\nDivision: " +s_division+ "\nPromedio: " +promedio+
                        "\nQue mal! el alumno debera recursar",
                        "CFP 36 - Resultado final",
                        JOptionPane.INFORMATION_MESSAGE,noaprobo); 
                     
            }
        }    
         
 }  

    public static void main(String[] args) {
        
        
        Ejercicio21 ventana = new Ejercicio21();
        
        ventana.setBounds(0, 0, 600, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Calculadora de promedios");
        
    }
    
}
