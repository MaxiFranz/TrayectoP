
package ejercicio13;

import javax.swing.JOptionPane;

public class suma extends operaciones_padre {

    @Override
    public void Operaciones() {
       resultados = valor1 + valor2;
    }
    
    public void mostrar(){
         JOptionPane.showMessageDialog(null,
                "El resultado de la suma fue : " + resultados,
                "Resultados de la Operaciòn ",
                JOptionPane.INFORMATION_MESSAGE,intro);
       } 
}
