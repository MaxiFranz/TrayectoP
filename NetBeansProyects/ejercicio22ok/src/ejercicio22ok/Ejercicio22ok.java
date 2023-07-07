

package ejercicio22ok;

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.gray;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejercicio22ok extends JFrame implements ActionListener{
    
    
    public JLabel label,listado;
    public JTextField textbox;
    public JButton cambiacolor;
    
            String color_s = "";
            String color_xs = "";
            int color_i;
    
    public Ejercicio22ok(){
         setLayout(null);
        listado = new JLabel("Lista de colores:\n 1- Rojo\n 2 - Azul "
                + "\n 3 - Verde\n 4 - Amarillo\n 5 - Gris");
            listado.setBounds(10, 10, 500, 30);       
            add(listado); 
            
        label = new JLabel("Ingrese el color");
            label.setBounds(10, 60, 100, 30);       
            add(label); 

        textbox = new JTextField();
            textbox.setBounds(120, 60, 150, 30);
            add(textbox);
            
        cambiacolor = new JButton("Cambiar el color");
            cambiacolor.setBounds(120, 120, 150, 30);
            add(cambiacolor);
            cambiacolor.addActionListener(this);//vincula el objeto a la accion listener 
    
    
    }
    
    public void actionPerformed(ActionEvent e) {
        
            
    
        if(e.getSource() == cambiacolor){
            
            //recuperamos el valor ingresado en el textbox
            color_s = textbox.getText();
            //System.out.println(color_s);
            //acortamos al primer valor
            color_xs = color_s.substring(0, 1);
            //System.out.println(color_xs);
            color_i =  Integer.parseInt(color_xs);
            
            Container panel = getContentPane();
            panel.setLayout(null);
            
            switch (color_i){
                case 1:
                    panel.setBackground(red);
                break;
                case 2:
                    panel.setBackground(blue);
                break;
                case 3:
                    panel.setBackground(green);
                break;
                case 4:
                    panel.setBackground(yellow);
                break;
                case 5:
                panel.setBackground(gray);
                break;

                default:
                break;
            }
            
            
        }    
         
 }  
    public static void main(String[] args) {
        Ejercicio22ok ventana = new Ejercicio22ok();
        
        ventana.setBounds(0, 0, 600, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Paleta de colores");
    }
}
