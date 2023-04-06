
package ejercicio4;

/**
 *
 * @author Max
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declara variables
        int N;
        double A;
        char C;
        
    //Declaramos la variable tipo int para valor ASCII de C
        int Ascii;
    
    //Declaramos dos variables para resultados de operaciones
        double Rsuma;
        double Rresta;
    
    //*******************************************
    //*******************************************
    //Asignamos valor a variables
        N = 5;
        A = 4.56;
        C = 'a';
    //*******************************************
    //*******************************************
    
    //Asociamos valor variable Ascii con Variable C
        Ascii = (int) +C;
        
    //Mostrar valores asingados a variables
        System.out.println("---Valores asignados---");
        System.out.println("Variable N = " +N);
        System.out.println("Variable A = " +A);
        System.out.println("Variable C = " +C);
        System.out.println("-----------------------");
        
    //Operaciones con variables
        //Sumar N + A
        Rsuma = (N + A);
        //Diferencia A - N
        Rresta = (A - N);   

	
	//Muestra resultados
	System.out.println("--Resultados de operaciones--");
    	System.out.println("El resultado de la suma es = " +Rsuma);
    	System.out.println("El resultado de la resta es = " +Rresta);
    	System.out.println("El valor numerico de C es = " +Ascii);
    	System.out.println("-----------------------------");    
		
	}
    }
    

