/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Max
 */
public class Ejercicio3 {

    public static void main(String[] args) {
    //Creamos variables
        int numero1;
        int numero2;
        int suma;
        int edad;
        String nombre;
        
    //Creamos constante
        final int numero3 = 4;
    
    // Asignamos valor a variables
        numero1 = 30;
        numero2 = 40;
    
    // operación suma
        suma = (numero1 + numero2);
   
    // Muestro en pantalla las dos variables y el resultado de la suma
        System.out.println("---Estos son los valores de las variables----");
        System.out.println("Valor 1 = " +numero1);
        System.out.println("Valor 2 = " +numero2);
        System.out.println("El resultado de la suma es = " +suma);
        System.out.println("---------------------------------------------");
    

    // Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
        numero1=100;
        numero2=50;

    //operación suma
        suma = (numero1 + numero2);
        
    // Muestro en pantalla las dos variables y el resultado de la suma
        System.out.println("---Estos son los nuevos valores de las variables---");
        System.out.println("Valor 1 = " +numero1);
        System.out.println("Valor 2 = " +numero2);
        System.out.println("El resultado de la suma ahora es = " +suma);
        System.out.println("---------------------------------------------------");


    // Instancio y muestro en pantalla la variable nombre y su edad
        edad = 46;
        nombre = "Maxi";
    
        System.out.println("Nombre = " +nombre);
        System.out.println("edad = " +edad);

    // Muestro en pantalla la constante
        System.out.println("Constante = " +numero3);
        
        


    }
    
}
