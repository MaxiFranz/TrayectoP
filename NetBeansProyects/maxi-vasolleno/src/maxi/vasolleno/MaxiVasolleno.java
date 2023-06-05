
package maxi.vasolleno;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MaxiVasolleno {

   
    public static void main(String[] args) {
        String nombre1 = "";
        String nombre2 = "";
        int jugada = 0;
        int puntosj1 = 0;
        int puntosj2 = 0;
        int vasolleno = 0;
        int data = 0; 
        
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        
        //creamos vector para botones / vasos
        String [] botones = { "Vaso 1", "Vaso 2", "Vaso 3" };
        
        //mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "BIENVENIDO!", "Es hora de jugar!!", JOptionPane.INFORMATION_MESSAGE); 
       
        //preguntamos nombre de los jugadores
        nombre1 = JOptionPane.showInputDialog(null, "Ingresa el nombre del jugador 1", "INPUT", JOptionPane.QUESTION_MESSAGE);
        
        nombre2 = JOptionPane.showInputDialog(null, "Ingresa el nombre del jugador 2", "INPUT", JOptionPane.QUESTION_MESSAGE);
        
        //mensaje 
        JOptionPane.showMessageDialog(null, "A JUGAR!", "Mucha suerte" +nombre1+ " y "+nombre2, JOptionPane.INFORMATION_MESSAGE); 
       
         do {
        //vemos nro de jugada o ciclo
        System.out.println("Jugada N: " +jugada);
        System.out.print("*************************************");
        System.out.print("\n");
        
        //**************************************** JUGADOR 1
        vasolleno = rand.nextInt(3)+1;//determinamos vaso lleno
        //comentar siguiente linea
        System.out.println("Vaso lleno: " +vasolleno);
        
        System.out.print("Vamos a jugar! " +nombre1);
        int variable = JOptionPane.showOptionDialog (null, "Cual es el vaso lleno?", "Intento " +jugada+ "de" +nombre1+ "", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones, botones[0]);

        System.out.print("Cual es el vaso lleno?");
        data = teclado.nextInt();
            if (data == vasolleno){
                 System.out.print("Excelente!, adivinaste");
                 puntosj1 = puntosj1 +1;
            } else {
                System.out.print("uy que mal!!");
            }
        //**************************************** JUGADOR 2
        vasolleno = rand.nextInt(3)+1;//determinamos vaso lleno 
        //comentar siguiente linea
        System.out.println("Vaso lleno: " +vasolleno);
        System.out.print("Vamos a jugar! " +nombre2);
        System.out.print("Cual es el vaso lleno?");
        data = teclado.nextInt();
            if (data == vasolleno){
                 System.out.print("Excelente!, adivinaste");
                 puntosj2 = puntosj2 +1;
            } else {
                System.out.print("uy que mal!!");
            } 
         
         //**************************************** FIN TANDA  
        jugada = jugada + 1;
           
        } while (jugada <= 2);
    }
    
}
