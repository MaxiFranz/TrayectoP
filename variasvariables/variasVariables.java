/*Declare cuatro variables enteras A, B, C y D
Asígnale un valor a cada una. 

A continuación, realiza
las instrucciones necesarias para que:
B tome el valor de C
C tome el valor de A
A tome el valor de D
D tome el valor de B

Si por ejemplo A = 1, B = 2, C = 3 y D = 4 el programa
debe mostrar:
Valores iniciales
A = 1
B = 2
C = 3
D = 4

Valores finales
B toma el valor de C -> B = 3
C toma el valor de A -> C = 1
A toma el valor de D -> A = 4
D toma el valor de B -> D = 2
*/
public class variasVariables {
   public static void main(String arg[]){
       //declaramos las variables
       int NumA = 10;
       int NumB = 15;
       int NumC = 20;
       int NumD = 30;
       //mostramos los valores iniciales
       System.out.println("Los valores de las variables son:");
       System.out.println("A =" +NumA );
       System.out.println("B =" +NumB );
       System.out.println("C =" +NumC );
       System.out.println("D =" +NumD );
       
       //ahora cambian valores y los mostramos 
       
       NumB = NumC;
       System.out.println(" El nuevo valor de B =" +NumB );
       NumC = NumA;
       System.out.println(" El nuevo valor de C =" +NumC );
       NumA = NumD;
       System.out.println(" El nuevo valor de A =" +NumA );
       NumD = NumB;
       System.out.println(" El nuevo valor de D =" +NumD );
   } 
}
