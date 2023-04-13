package ejercicio8;
    //importamos metodo
    import java.util.Scanner;

public class Ejercicio8 {

    
    public static void main(String[] args) {
        //Creamos variables
        String name;
        double temp;
        
        //creamos el objeto termometro asociado al metodo
        Scanner termometro = new Scanner(System.in);
        
        //usamos el objeto para asociar valor a variables
        System.out.print("Bienvenido, ingrese su nombre : ");
        name = termometro.nextLine();
        
        System.out.print("Ingrese la temperatura : ");
        temp = termometro.nextDouble();
        
        //Imprimimos resultados 
        System.out.println(""+name+ " la temperatura actual es " +temp+ " grados");
  
        //condicional
                if (temp >= 30.0){
                System.out.println("Puede ir a la playa");
                }else if (temp <30.0 && temp >= 25.0){
                System.out.println("Puede andar en bicicleta");      
                }else if (temp < 25.0 && temp >= 10.0){
                System.out.println("Puede ir a caminar");   
                }else {
                System.out.println("Abriguese que esta fresco");
                }
   
    }
    
}
