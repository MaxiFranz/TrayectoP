
package ejercicio11;
import operaciones.c_hijaresta;
import operaciones.c_hijasuma;
import operaciones.c_hijamultiplicacion;
        
public class Ejercicio11 {

    public static void main(String[] args) {
        c_hijasuma msjS = new c_hijasuma();
        msjS.pedirdatos();
        msjS.suma();
        msjS.mostrardatos();
        
        c_hijaresta msjR = new c_hijaresta();
        msjR.pedirdatos();
        msjR.resta();
        msjR.mostrardatos();
        
        c_hijamultiplicacion msjM = new c_hijamultiplicacion();
        msjM.pedirdatos();
        msjM.multiplica();
        msjM.mostrardatos();
        
    }
    
}
