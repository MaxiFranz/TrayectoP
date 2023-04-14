package franzoni13.pkg04ej1;

    import java.util.Scanner;

public class Franzoni1304ej1 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
       
        String nOmbre;
        int aRea = 0, aNtiguedad= 0;
        
        
        System.out.println("-----------------------------------------------");
        System.out.println("----LIQUIDACION DE VACACIONES Tatooine S.A ----");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.print("INGRESE SU NOMBRE EL NOMBRE DEL TRABAJADOR : ");
        nOmbre = entrada.nextLine();
        
        System.out.print("INGRESE CANTIDAD DE AÑOS DE SERVICIO  : ");
        aNtiguedad = entrada.nextInt();
        
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("--- 01 - Departamento de Atencion al cliente --");
        System.out.println("--- 02 - Departamento de logistica-------------");
        System.out.println("--- 03 - Gerencia------------------------------");
        
        System.out.print("INGRESE un numero de area de trabajo: ");
        aRea = entrada.nextInt();
        

            if (aRea == 1){
                if (aNtiguedad == 1){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 6 días de vacaciones");
                
                } else if (aNtiguedad >= 2 && aNtiguedad <= 6){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 14 días de vacaciones");
                
                } else if (aNtiguedad >= 7){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 20 días de vacaciones");  
                }    
            } else if (aRea == 2){
                if (aNtiguedad == 1){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 7 días de vacaciones");      
                
                } else if (aNtiguedad >= 2 && aNtiguedad <= 6){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 15 días de vacaciones");  
                } else if (aNtiguedad >= 7){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 22 días de vacaciones");  
                }   
            } else if (aRea == 3){
                if (aNtiguedad == 1){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 10 días de vacaciones");      
                } else if (aNtiguedad >= 2 && aNtiguedad <= 6){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 20 días de vacaciones");      
                } else if (aNtiguedad >= 7){
                System.out.println("El trabajador: " +nOmbre+ " Antiguedad " +aNtiguedad);
                System.out.println("Del area Atencion al cliente");
                System.out.println("Tiene 30 días de vacaciones");  
                }   
                
            }
       
    }
    
}
