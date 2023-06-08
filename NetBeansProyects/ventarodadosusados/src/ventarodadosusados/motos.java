
package ventarodadosusados;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class motos {
    public void confirmaopcion(){
            ImageIcon moto = new ImageIcon("src/img/moto.jpg");
            JOptionPane.showMessageDialog(null,
                                     "Usted eligio motos", "Verificar", 
                                     JOptionPane.INFORMATION_MESSAGE,moto);
        }
}
