
package ejercicio15;

import javax.swing.JFrame;
import javax.swing.JLabel;

//la clase principal hereda de Jframe. Va a solicitar se importe Swing
public class Ejercicio15 extends JFrame {
    private JLabel etiqueta = null;
    
        public Ejercicio15(){
        //COORDENADAS DE UBICACION DEL FORMULARIO
        setLayout(null);
        //Creamos la etiqueta llamando etiqueta
        etiqueta = new JLabel("Hola Mundo");
        //Establece la posición (x, y) y las dimensiones (ancho, alto) de la etiqueta
        etiqueta.setBounds(0, 0, 600, 300);
        //con los valores anteriores ubica el texto al medio
        
        // Establece la alineación horizontal del texto en el centro
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        // Agrega la etiqueta al formulario
        add(etiqueta);
        //con la siguiente linea, si cerramos la ventana se termina la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        }
        
    public static void main(String[] args) {
        
        Ejercicio15 formulario1 = new Ejercicio15();
        formulario1.setBounds(1, 1, 600, 300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
        formulario1.setTitle("Mi primer Formulario");
        
    }
    
}
