

package com.mycompany.ejercicio22;

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


public class Ejercicio22 extends JFrame implements ActionListener{
    
    
    public JLabel label,listado;
    public JTextField textbox;
    public JButton cambiacolor;
    
    String color_s = "";
    int color_i = 0;
    
    public Ejercicio22(){
        
        listado = new JLabel("Lista de colores:\n1- Rojo\n2 - Azul "
                + "\n3 - Verde\n4 - Amarillo\n5 - Gris");
            listado.setBounds(10, 10, 100, 300);       
            add(listado); 
            
        label = new JLabel("Ingrese el color");
            label.setBounds(150, 10, 100, 30);       
            add(label); 

        textbox = new JTextField();
            textbox.setBounds(380, 10, 150, 30);
            add(textbox);
            
        cambiacolor = new JButton("Cambiar el color");
            cambiacolor.setBounds(160, 130, 150, 30);
            add(cambiacolor);
            cambiacolor.addActionListener(this);//vincula el objeto a la accion listener 
            
    Container panel = getContentPane();
    panel.setLayout(null);           
    panel.setBackground(blue);
    
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == cambiacolor){
            
            color_s = textbox.getText();
            
            System.out.println(color_s);
            
            //color_s = Integer.parseInt(textbox.getText());

            
        }    
         
 }  
    public static void main(String[] args) {
        Ejercicio22 ventana = new Ejercicio22();
        
        ventana.setBounds(0, 0, 600, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Paleta de colores");
    }
}
