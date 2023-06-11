
package banco;

import javax.swing.JOptionPane;


public class cuentaBancaria {

    //Variables / atributos de cuenta bancaria
     String label = "";
     int tipocuenta = 0;
     int tipoOperacion = 0;//1 es deposito, 2 es estraccion
     int saldoinicio = 0;
     int saldofinal = 0;
     
     //variables de uso temporal
     String valorTS = "";
     int valorTI = 0;
    
    //cargamos clase tools!
    tools c2 = new tools();
    
    public void form(){
        do {
            valorTS = JOptionPane.showInputDialog(null, 
                        "" +label, "Login de Clientes", 
                        JOptionPane.QUESTION_MESSAGE); 
        } while (valorTS == null || valorTS.isEmpty());   
            //tomamos el valor ingresado y lo validamos con tools
            c2.valorTS = valorTS;//pasamos el valor
            c2.stringtoint();//llamamos al metodo
            valorTI = c2.valorTI;//recuperamos el valor

    }
   
     public void operaciones(){
         do {
             if (tipoOperacion == 1){
                 label = "Deposito. Ingrese la suma en pesos";     
             } else {
                 label = "Extraccion. Ingrese la suma en pesos";     
             }    
                 
            valorTS = JOptionPane.showInputDialog(null, 
                        "" +label, "Operaciones en cuenta", 
                        JOptionPane.QUESTION_MESSAGE); 
            } while (valorTS == null || valorTS.isEmpty());   
            //tomamos el valor ingresado y lo validamos con tools
            c2.valorTS = valorTS;//pasamos el valor
            c2.stringtoint();//llamamos al metodo
            valorTI = c2.valorTI;//recuperamos el valor
            
            //calculamos el nuevo saldo    
            if (tipoOperacion == 1){
                 saldofinal = saldoinicio + valorTI;
                 JOptionPane.showMessageDialog(null,
                            "En hora buena!, el ahorro es la base de la fortuna", 
                            ""+label,
                            JOptionPane.INFORMATION_MESSAGE);
            } else {
                    if (tipocuenta == 1){
                    //si es caja de ahorro no puede sacar mas de lo que tiene
                        if (valorTI > saldoinicio){
                            JOptionPane.showMessageDialog(null,
                            "No puede extraer mas de lo que tiene!\n "
                                    + "Solicite una Cuenta Corriente", 
                            ""+label,
                            JOptionPane.WARNING_MESSAGE);      
                        } else {   
                        saldofinal = saldoinicio - valorTI;  
                        JOptionPane.showMessageDialog(null,
                            "Ojo con los gastos, controle sus finanzas!!", 
                            ""+label,
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                    }     
            
            }
 }    
    
}
