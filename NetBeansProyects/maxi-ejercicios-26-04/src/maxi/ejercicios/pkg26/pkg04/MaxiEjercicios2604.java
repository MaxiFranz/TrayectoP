
package maxi.ejercicios.pkg26.pkg04;

import java.util.Scanner;


public class MaxiEjercicios2604 {

    
    public static void main(String[] args) {
     
    //variables!!   
    String nOmbre;
    String nOmbre2;
    String sEleccion;
    //variables para lenght y substring
    int lNombre, desde, hasta;
    
    //iniciamos metodo
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("------------------------------------");
    System.out.println("------------ Ejercicio 1 -----------");
    
    //preguntamos el nombre
    System.out.print("Por favor, ingresa una palabra : ");
    nOmbre = teclado.next();
    
    //contamos los caracteres
    lNombre = nOmbre.length();
    
    //mostramos la cantidad de caracteres
    System.out.println("Su la palabra " +lNombre+ " tiene caracteres");
    
    //consultamos que parte del nombre quiere seleccionar
    
    System.out.print("Indique inicio de la seleccion : ");
    desde = teclado.nextInt();
    
            //aca comprobamos el valor que metio
            while (desde >= lNombre-1){
            System.out.println("El valor ingresado no es valido!!!"); 
            //volvemos a preguntar  por el valor de inicio
            System.out.print("Indique inicio de la seleccion : ");
            desde = teclado.nextInt();
            }
            
    System.out.print("Indique hasta donde selecciona : ");
    hasta = teclado.nextInt();        
   
    //aca comprobamos el valor que metio. Si hasta es menor o igual que el inicio repregunta
            while (hasta <= desde){
            System.out.println("El valor ingresado no es valido!!!");   
            System.out.print("Indique hasta de la seleccion : ");
            hasta = teclado.nextInt();
            }
    
    //generamos la seleccion de acuerdo a los valores que dio
    sEleccion = nOmbre.substring(desde, hasta);
    
    //mostramos la seleccion
    System.out.println(sEleccion);
    
    System.out.println("------------------------------------");
    System.out.println("------------------------------------");
    System.out.println("------------ Ejercicio 2 -----------");
    
    //aca le pedimos que ingrese otra vez el nombre. pero lo vamos a validar
    System.out.print("Por favor ingresa nuevamente la misma palabra del primer ejercicio : ");
    nOmbre2 = teclado.next();
    
    //comparamos por la negativa. Hasta que no ingresa la palabra no sale del bucle
    //busque en internet como hacerlo por la negativa notequals
    while(!nOmbre.equals(nOmbre2)) {
    System.out.println("Algo esta mal!, las palabras son diferentes.");
    System.out.print("Intentalo nuevamente : ");
    nOmbre2 = teclado.next();
    } 
    //cuando ingresa la misma palabra muestra que coinciden
    System.out.println("Que memoria prodigiosa!. Las palabras son iguales");
    
    
    System.out.println("------------------------------------");
    System.out.println("------------------------------------");
    System.out.println("------------ Ejercicio 3 -----------");
    
    for (int contador =1; contador <=9; contador++){
        
        System.out.println("" +contador);
        
        contador++;
    }
  
    }
    
        
    } 
    
    
    

