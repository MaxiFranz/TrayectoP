
package ejercicio14;


public class bus extends padre{
    @Override
            public void estacionar() {
        System.out.println("Como estacionar un bus. Siga estos pasos!");
        System.out.println("*************************************************");
        System.out.println("1 - Observe la zona, las dimensiones del lugar."); 
        System.out.println("2 - Si va a estacionarlo en paralelo, mire por "
                + "los espejos retrovisores para ver que tan lejos "
                + "se esta de la zona");
        System.out.println("3 - Se retrocede poco a poco mientras se gira el "
                + "volante hacia la izquierda, eso hace que el vehiculo "
                + "vaya a la derecha y se acerque al cordon"); 
        System.out.println("4 - Luego se endereza el volante hacia la derecha "
                + "mientras se va hacia adelante hasta que el camion quede "
                + "todo derecho y este dentro del espacio "
                + "y alineado con el cordon.");
                  }

            
        public void arrancar() {
            System.out.println("Como arrancar un bus. Siga estos pasos!");
            System.out.println("*************************************************");
            System.out.println("1 - Ingrese al rodado");
            System.out.println("2 - Tome aciento en la posicion del conductor");
            System.out.println("3 - Coloque la palanca de cambio en punto muerto.");
            System.out.println("4 - Introduzca la llave, gire el tambor y arranque");
            }
    
}
