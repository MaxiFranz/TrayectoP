
package Libreria;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Funciones {
   
  //tiempo de llenado, tiempo de lavado, tiempo de vaciado, tiempo de centrifugado
   private int tiempoLlenadoS = 0, tiempoLavadoS = 0, 
           tiempoVaciadoS = 0, tiempoCentrifugadoS = 0, 
           llenadoOk = 0, lavadoOk = 0, vaciadoOk = 0, centrifugadoOk = 0;
  
   public Funciones(int tiempoLlenadoS, int tiempoLavadoS, int tiempoVaciadoS, int tiempoCentrifugadoS){
       this.tiempoLlenadoS = tiempoLlenadoS;
       this.tiempoLavadoS = tiempoLavadoS;
       this.tiempoVaciadoS = tiempoVaciadoS;
       this.tiempoCentrifugadoS = tiempoCentrifugadoS;
   }
           
   public void llenado(){
       System.out.println("************************************************");
       System.out.println("Llenado......");
       System.out.println("Llenado Completo");  
       llenadoOk = 1;
   }
   
   public void lavado(){
       llenado();
       if (llenadoOk == 1){
       System.out.println("************************************************");
       System.out.println("Lavando......");
       System.out.println("Lavado completo");  
       lavadoOk = 1;   
       }
       
   }
   
   public void vaciado(){
       lavado();
       if (lavadoOk == 1){
       System.out.println("************************************************");
       System.out.println("Vaciando......");
       System.out.println("Vaciado completo");  
       vaciadoOk = 1;   
       }
   }
   
   public void centrifugado(){
       vaciado();
       if (vaciadoOk == 1){
       System.out.println("************************************************");
       System.out.println("Centrifugando......");
       System.out.println("Centrifugado  completo");  
       centrifugadoOk = 1;   
       }
   }
   
   public void ciclofinalizado(){
       centrifugado();
       if (centrifugadoOk == 1){
       System.out.println("************************************************");
       System.out.println("Tu ropa esta lista para usar");
       }
   }
   
}        
   
    
        