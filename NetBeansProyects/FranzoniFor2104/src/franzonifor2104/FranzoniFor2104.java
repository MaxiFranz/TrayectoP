
package franzonifor2104;

import java.util.Scanner;

public class FranzoniFor2104 {

   
    public static void main(String[] args) {
        
        //las variables deben estar con valor 0 sino da error.
        int cAntpar = 0;
        int cAntimpar = 0;
        int nU = 0;
        int rEsultado=0;
        
        Scanner teclado = new Scanner(System.in);
        
    // 1 - ejercicio conteo, numeros pares e impares    
        //generamos el conteo de 0 hasta 100
        //el conteo comienza en 0 y llega hasta 100
        //i++ representa cada numero que cuenta..1..2..3..4..x
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("---------------- Ejercicio 1 --------------------");
        for (int i= 1; i <=100; i++){
            
            System.out.println("" +i);
        
            //para calcular para o impar dividimos el valor por 2
            if(i%2 == 0){
             cAntpar ++;   
            }else {
              cAntimpar ++;  
            }   
        }
        //finalizado el for y el if para asignar valor a variables, las mostramos
        System.out.println("------ Fin conteo de numeros del 1 al 100 -------");
        System.out.println("La cantidad de numeros pares es : " +cAntpar);
        System.out.println("La cantidad de numeros impares es : " +cAntimpar);
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("---------------- Ejercicio 2 --------------------");
    //2 - ejercicio multiplos de 3
    
        //Solicitamos ingrese un numero
        System.out.print("Ingrese un numero entero : ");
        //guardamos valor
        nU = teclado.nextInt();
        //el valor de nU es el valor limite.
        //todos los valores que encuentre for entre 1 y nU pasan por el if posteriormente
    
        for (int ii = 1; ii<=nU; ii++){
            //para calcular multiplo de 3 dividimos cada nU por 3
                if(ii%3 == 0){
                System.out.println("El numero " +ii+ " es multiplo de 3");
                }else {
                System.out.println("El numero " +ii+ " no es multiplo de 3");
                }   
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("---------------- Ejercicio 3 --------------------");
    //3 - ejercicio calculo factorial de un numero entero
        //Solicitamos ingrese un numero
        System.out.print("Ingrese un numero entero : ");
        //guardamos valor
        nU = teclado.nextInt();
        
        for(int iii = nU; iii >=1; iii--){
                if(rEsultado == 0){
                rEsultado = iii;    
                }else{
                rEsultado *=iii;    
                }
            
        }
        System.out.println("El factorial de " +nU+ " es " +rEsultado);
        
    
    }
    
}
