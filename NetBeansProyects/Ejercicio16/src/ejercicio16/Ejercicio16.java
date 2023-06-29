
package ejercicio16;

import javax.swing.JFrame;
import javax.swing.JLabel;

//la clase principal hereda de Jframe
public class Ejercicio16 extends JFrame {
    private JLabel etiqueta = null;
        
        //aca van todos los labels
        public Ejercicio16(){
        etiqueta=new JLabel("Maximo Luis Franzoni");
        //posicion, ancho y largo
        etiqueta.setBounds(0, 0, 600, 200);
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        add(etiqueta);
        
        etiqueta=new JLabel("Teléfono: 15-9876 5432");
        etiqueta.setBounds(0, 20, 600, 200);
        // Establece la alineación horizontal del texto en el centro
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        add(etiqueta);
        
        etiqueta=new JLabel("Mail: pirulo@gmail.com");
        etiqueta.setBounds(0, 40, 600, 200);
        // Establece la alineación horizontal del texto en el centro
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        add(etiqueta);
        
        etiqueta=new JLabel("Dni: 25.123.123");
        etiqueta.setBounds(0, 0, 600, 200);
        // Establece la alineación horizontal del texto en el centro
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        add(etiqueta);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
            
        }
    
    public static void main(String[] args) {
        //aca generamos la ventana
        Ejercicio16 ventana = new Ejercicio16();
        //las dimensiones de la ventana y otros atributos
        ventana.setBounds(0, 0, 600, 400);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Datos");
        
    }
    
}
