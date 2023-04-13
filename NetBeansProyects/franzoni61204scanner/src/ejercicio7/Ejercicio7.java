
package ejercicio7;
    import java.util.Scanner;

public class Ejercicio7 {

    
    public static void main(String[] args) {
    //crea variables para entrada
    String nombre;
    String apellido;    
    int dni;
    int nac;

    //variable de resultado
    int Edad;
    
    //constante (deberia consultar por sistema año actual)
    int Actual = 2023;
    
    //**2 - creamos el objeto lector asociado a lo que importamos
    Scanner lector = new Scanner(System.in);

    //pedimos nombre y apellido
    System.out.print("Ingrese Nombre: ");

    /** 3 - Le asignamos el valor a la variable de acuerdo a lo que ingresa
     por Scanner puede ser (int,Long,Line,Float, Etc 
    (varia segun tipo de variable / dato que queremos)
    **/
    nombre = lector.nextLine();
    //*******
    
    //repetimos...
    System.out.print("Ingrese Apellido: ");
    apellido = lector.nextLine();
    
    System.out.print("Ingrese A#o de nacimiento: ");
    nac = lector.nextInt();
    
    System.out.print("Ingrese numero de DNI : ");
    dni = lector.nextInt();
    
    //aca calcula la edad
    Edad = +Actual - +nac;
 
    //aca imprime resultados
    System.out.println("********************************");
    System.out.println("Bienvenido " +nombre+ " " +apellido);
    System.out.println("Usted tiene " +Edad+ " a#os");
    System.out.println("Su DNI es " +dni);
    System.out.println("********************************");
    }
    
}
