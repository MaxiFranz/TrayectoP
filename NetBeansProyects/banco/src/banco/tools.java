
package banco;

import javax.swing.JOptionPane;


public class tools {
    //atributos para metodo stringtoint
    String valorTS = "";//dato de entrada
    int valorTI = 0;//datos de salida
    
    public void stringtoint(){
        boolean isNumeric = (valorTS.matches("[0-9]+"));
            if (isNumeric != true ){
            JOptionPane.showMessageDialog(null,
                "El dato ingresado no es un numero", 
                "Atencion!",
                JOptionPane.WARNING_MESSAGE); 
                valorTS = null;
            } else {
            String sCadena = valorTS;
            valorTI = Integer.parseInt(sCadena);
                
            JOptionPane.showMessageDialog(null,
                "El dato ingresado es " +valorTI, "Verificar!",
                JOptionPane.INFORMATION_MESSAGE);
            }
       
    }
}
