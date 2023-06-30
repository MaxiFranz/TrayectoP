
package pooejercicio17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Pooejercicio17 extends JFrame implements ActionListener{
    
    //creamos variable etiqueta
    public JLabel etiqueta = null;
    public JLabel respuesta = null;
    
    //creamos los botones como variables
    public JButton boton1,boton2;
    
    //creamos variables para el texto de los botones
    String tboton1 = "1";
    String tboton2 = "2";
    String tboton3 = "3";
    
    //creamos una variable para recuperar que boton apreto
    String botonr = "";
    
        public Pooejercicio17(){
        //anulamos lo que esta por defecto
        setLayout(null);
        
        //contruir la etiqueta
        etiqueta = new JLabel("Presiona un boton");
        etiqueta.setBounds(0, 0, 600, 400);
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        add(etiqueta);
        
        //construimos la respuesta
        respuesta = new JLabel("");
        respuesta.setBounds(235, 20, 600, 400);
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        add(respuesta);

        
        //creamos los botones
        JButton boton1 = new JButton(tboton1);
        //determinamos la ubicacion y dimensiones
        boton1.setBounds(170,100,90,30);
        //lo agregamos
        add(boton1);
        //tomamos el valor cuando lo apreta
        boton1.addActionListener(this);
        
        
        JButton boton2 = new JButton(tboton2);
        //determinamos la ubicacion y dimensiones
        boton2.setBounds(270, 100, 90, 30);
        //lo agregamos
        add(boton2);
        //tomamos el valor cuando lo apreta
        boton2.addActionListener(this);
        
        
        JButton boton3 = new JButton(tboton3);
        //determinamos la ubicacion y dimensiones
        boton3.setBounds(370, 100, 90, 30);
        //lo agregamos
        add(boton3);
        //tomamos el valor cuando lo apreta
        boton3.addActionListener(this);
        
        
        //con esta linea cuando cierra la ventana, finaliza la app
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        }
    
  
    //aca recibimos cuando apreta los botones
    public void actionPerformed(ActionEvent e) {
        //recuperamos que dato recibimos cuando apretamos el boton. Comentar linea
        System.out.println(e.getActionCommand ());
        //tomamos el valor y cargamos la variable
        botonr = e.getActionCommand ();
        
        switch (botonr){
            case "1":
                respuesta.setText("Usted apreto el boton 1");
            break;
            case "2":
                respuesta.setText("Usted apreto el boton 2");
            break;
            case "3":
               respuesta.setText("Usted apreto el boton 3");
            break;
             
        }
                
}

    public static void main(String[] args) {
        
        
        Pooejercicio17 ventana = new Pooejercicio17();
        //las dimensiones de la ventana y otros atributos
        ventana.setBounds(0, 0, 600, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Botonera");

    }

    
    
}
    
    
    
