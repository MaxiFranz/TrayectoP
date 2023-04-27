
package maxi.ejercicio11;


public class MaxiEjercicio11 {

   
    public static void main(String[] args) {
    
        int valorInicio = 1;
        //limitamos el valor del primer conteo
        int valorLimite1 = 33;
        //limitamos el valor al segundo conteo
        int valorLimite2 = 67;
        //limitamos el valor al tercer conteo
        int valorLimite3 = 100;
        
        //necesitamos el valor que varia
        int valorVariable=1;
        
        //contar con for
        //cuenta desde valorinicio hasta valorlimite1
        System.out.println("Conteo usando for -----------------------");
        for(int i = valorInicio; i <=valorLimite1; i++)  {
            System.out.println("" +i);
            //aca suma 1 cada vez que pasa
            valorVariable = +i;
            
        }
        //finalizado el conteo, termina for y tomamos valor 
        //System.out.println("Valor Variable : " +valorVariable);
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        //contador While. mientras valorvariable sea igual o menor a 67 cuenta
        //tomamos el valor final del primer conteo que es valorVariable + 1
        //de esa forma el conteo inicia en el numero posterior
        valorVariable = +valorVariable +1;
        //luego, suma 1 cada vez que pasa hasta que se cumple la funcion
        
        System.out.println("Conteo usando While -----------------------");
        while (valorVariable <=valorLimite2 ){
            System.out.println("" +valorVariable);
            //aca suma 1 cada vez que pasa
            valorVariable = +valorVariable +1;
        }
        
        //finalizado el conteo, termina while y tomamos valor 
        //System.out.println("Valor Variable : " +valorVariable);
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        //aca contamos usando do wile
        System.out.println("Conteo usando do Wile -----------------------");
        //contador do While. cuenta hasta que llegue a 100
        do {
             System.out.println("" +valorVariable);
            //aca suma 1 cada vez que pasa
            valorVariable = +valorVariable +1;
        } while (valorVariable <= valorLimite3);
        
     System.out.println("Me canse de contar!!!");   
}

}