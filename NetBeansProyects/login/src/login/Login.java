/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import java.util.Scanner;


public class Login {

    
    public static void main(String[] args) {
        
        //iniciamos una variable para contar los intentos
       
        int iNtentos = 1;
        //variable para usuario
        String uSuario;
        
        //asociamos metodo a objeto para ingreso de datos
        Scanner teclado = new Scanner(System.in);
        
        //logica: mientras intentos <=3 sigue preguntando por el usuario
        //controla si el usuario es igual a pepe
        //sino es igual suma 1 a intentos
        do  {
                System.out.println("-------------------------");
                System.out.println("Intentos : " +iNtentos);   
                System.out.println("-------------------------");
                System.out.print("Ingrese un nombre : ");
                uSuario = teclado.nextLine();
                if (uSuario.equals("pepe")){
                System.out.println("Login correcto");
                break;
                //si usuario es igual, termina el codigo con el break
                } else  { 
                System.out.println(":(");   
                System.out.println("Login in correcto");
                iNtentos = iNtentos +1;
                }   
                    
                
    }   while (iNtentos <=3) ;
        
        //cuando intentos es igual a 3 o mayor, manda mensaje
        if (iNtentos >=3){
            System.out.println("No hay mas intentos disponibles");
            }
    }
    
}
