
package ejercicio5;

/**
 *
 * @author Max
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Declaro variables
        int X;
        int Y;
        double N;
        double M;
    
    //Asignamos valores a variables
        X = 1;
        Y = 2;
        N = 4.7;
        M = 3.2;
        
    //Creamos variables y asignamos valor segun operaciones solicitadas
            int Suma_1 = (X + Y);
            int Diferencia_1 = (X - Y);
            int Producto_1 = (X * Y);
            int Cociente_1 = (X / Y);
            int Resto_1 = (X % Y);
    
            double Suma_2 = (N + M);
            double Diferencia_2 = (N - M);
            double Producto_2 = (N * M);
            double Cociente_2 = (N / M);
            double Resto_2 = (Y % M);
        
    //Calcula dobles de cada variable
            int D1 = (X * 2);
            int D2 = (Y * 2);
            double D3 = (N *2);
            double D4 = (M * 2);
    
    //Calcula suma de todas las variables
            double TotalS = (X + Y + N + M);
    
    //Calcula producto de todas las variables
            double TotalP = (X * Y * N * M);
        
    //Mostramos valor inicial de variables
        System.out.println( "Variable X = " +X);
        System.out.println( "Variable Y = " +Y);
        System.out.println( "Variable N = " +N);
        System.out.println( "Variable M = " +M);
    
    //Mostramos resultados de las operaciones
        System.out.println( +X+ "+" +Y+ " = " +Suma_1);
        System.out.println( +X+ "-" +Y+ " = " +Diferencia_1);
        System.out.println( +X+ "*" +Y+ " = " +Producto_1);
        System.out.println( +X+ "/" +Y+ " = " +Cociente_1);
        System.out.println( +X+ "%" +Y+ " = " +Resto_1);
        
        System.out.println( +N+ "+" +M+ " = " +Suma_2);
        System.out.println( +N+ "-" +M+ " = " +Diferencia_2);
        System.out.println( +N+ "*" +M+ " = " +Producto_2);
        System.out.println( +N+ "/" +M+ " = " +Cociente_2);
        System.out.println( +Y+ "%" +M+ " = " +Resto_2);
        
        System.out.println( "Variable X = "+X+ " el doble es " +D1);
        System.out.println( "Variable Y = "+Y+ " el doble es " +D2);
        System.out.println( "Variable N = "+N+ " el doble es " +D3);
        System.out.println( "Variable M = "+M+ " el doble es " +D4);
        
        System.out.println( +X+ "+" +Y+ "+" +N+ "+" +M+ " = " +TotalS);
        System.out.println( +X+ "*" +Y+ "*" +N+ "*" +M+ " = " +TotalP);
        
    }
    
}
