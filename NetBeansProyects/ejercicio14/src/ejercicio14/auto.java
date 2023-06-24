
package ejercicio14;


public class auto extends padre{
    
    @Override
    public void estacionar() {
        System.out.println("Como estacionar un auto. Siga estos pasos!");
        System.out.println("*************************************************");
        System.out.println("1 - Controle que el espacio para estacionar"
                + " mida como minimo un metro mas que su auto"); 
        System.out.println("2 - Alinear el eje trasero del vehiculo con el "
                + "paragolpes trasero");
        System.out.println("3 - Gire el volante a la derecha y retroceda "
                + "hasta que la rueda delantera coincida con el paragolpes"); 
        System.out.println("4 - Gire el volante hacia la izquierda y "
                + "continue retrocediendo hasta que el auto quede paralelo "
                + "al cordon");
    }

    public void arrancar(){
        System.out.println("Como arrancar un auto. Siga estos pasos!");
        System.out.println("*************************************************");
        System.out.println("1 - Abra la puerta del rodado");
        System.out.println("2 - Tome aciento en la posicion del conductor");
        System.out.println("3 - Coloque la palanca de cambio en punto muerto.");
        System.out.println("4 - Introduzca la llave, gire el tambor y arranque");
    }
}


