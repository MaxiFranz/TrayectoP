
package areaderectangulo;

import javax.swing.ImageIcon;


public class calculadora {
    
    ImageIcon resultado = new ImageIcon("src/img/inicio.jpg");
    
    int base = 0;
    int altura = 0;
    int area = 0;
    
    public void calculaarea(){
        area = base * altura;
         System.out.println("Area: " +area);
    }
}
