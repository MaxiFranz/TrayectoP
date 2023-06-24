
package ejercicio14;

public class Ejercicio14 {


    public static void main(String[] args) {
        
        int vehiculo = 0;
        int metodo = 0;
        
        //generamos los constructores, uno por cada clase hija
        padre MSJ1 = new auto();
        padre MSJ2 = new moto();
        padre MSJ3 = new bus();
        
        //comenzamos con los pasos que tienen en comun
        MSJ1.intro();//la intro de la autoescuela
        MSJ1.seleccionevehiculo();//tiene que seleccionar el vehiculo
        MSJ1.seleccionmetodo();//tiene que seleccionar que quiere aprender
        
        //necesitamos recuperar los valores que selecciono para variar 
        vehiculo = MSJ1.vehiculo;
        metodo = MSJ1.metodo;
        //System.out.println("Vehiculo: " +vehiculo);
        //System.out.println("Metodo: " +metodo);
        
        //De acuerdo a las selecciones, elegimos la clase y el metodo
        
        if (vehiculo == 1 && metodo == 1){//auto estaciona
            MSJ1.estacionar();
        } else if (vehiculo == 1 && metodo == 2){//auto arranca
            MSJ1.arrancar();
        } else if (vehiculo == 2 && metodo == 1){//moto estaciona
            MSJ2.estacionar();
        } else if (vehiculo == 2 && metodo == 2){//moto arranca
            MSJ2.arrancar();
        } else if (vehiculo == 3 && metodo == 1){//bus estaciona
            MSJ3.estacionar();
        } else {//bus arranca
            MSJ3.arrancar();
        }
 
       
    }   
    
}
