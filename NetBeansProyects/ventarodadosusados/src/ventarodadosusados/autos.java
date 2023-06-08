
package ventarodadosusados;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class autos {
        
         //estos son los atributos
        String valorTS = "";
        String marca;
        
        //aca van los metodos
        public void confirmaopcion(){
            ImageIcon auto = new ImageIcon("src/img/auto.jpg");
            JOptionPane.showMessageDialog(null,
                                     "Usted eligio Autos", "Verificar", 
                                     JOptionPane.INFORMATION_MESSAGE,auto);
        }
        
        public void pedir(){
            do {
            valorTS = JOptionPane.showInputDialog(null, 
                        "Ingrese la marca del auto", "Comencemos!", 
                        JOptionPane.QUESTION_MESSAGE); 
            } while (valorTS == null || valorTS.isEmpty());
        }
        
        public void printmarca(){
            ImageIcon auto = new ImageIcon("src/img/auto.jpg");
            JOptionPane.showMessageDialog(null,
                                     "La marca ingresada es: " +valorTS, "Verificar", 
                                     JOptionPane.INFORMATION_MESSAGE,auto);
        }
}
