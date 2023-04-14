
package franzoni14.pkg4ej2;

    import java.util.Scanner;

public class Franzoni144ej2 {

    public static void main(String[] args) {
    
    //creamos objeto
    Scanner entrada = new Scanner (System.in);
    
    //creamos variables
    int oPeracion;
    int Num1;
    int Num2;
    int Resultado;
    
     //mensaje de bienvenida y menu de operaciones
    System.out.println("-----------------------------------------------");
    System.out.println("-----------------------------------------------");
    System.out.println("--- Bienvenio a la calculadora CFP36---------");
    System.out.println("--- Estas son las operaciones disponibles-------");
    System.out.println("--- 1 - Suma-----------------------------------");
    System.out.println("--- 2 - Resta-----------------------------------");
    System.out.println("--- 3 - Multiplicacion--------------------------");
    System.out.println("--- 4 - Division--------------------------------");
    System.out.print("Elija la operacion a realizar : ");
    //Guardamos la operacion que elegida
    oPeracion = entrada.nextInt();
    System.out.print("Ingrese el numero 1 : ");
    Num1 = entrada.nextInt();
    
    System.out.print("Ingrese el numero 2 : ");
    Num2 = entrada.nextInt();
    
    System.out.println("-----------------------------------------------");
    System.out.println("-----------------------------------------------");
            if (oPeracion == 1){
                System.out.println("La operacion elegida es la suma");
                Resultado = Num1 + Num2;
                System.out.println("La operacion es " +Num1+ " + " +Num2+ " = " +Resultado);
            } else if (oPeracion == 2){
                System.out.println("La operacion elegida es la resta");
                Resultado = Num1 - Num2;
                System.out.println("La operacion es " +Num1+ " - " +Num2+ " = " +Resultado);
            } else if (oPeracion == 3){
                System.out.println("La operacion elegida es la multiplicacion");
                Resultado = Num1 * Num2;
                System.out.println("La operacion es " +Num1+ " * " +Num2+ " = " +Resultado);
            } else {
                System.out.println("La operacion elegida es la division");
                Resultado = Num1 / Num2;
                System.out.println("La operacion es " +Num1+ " / " +Num2+ " = " +Resultado);
            }
                
           
                    
        
    
    
    }
    
}
