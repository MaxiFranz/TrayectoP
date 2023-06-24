
package ejercicio14;


public class moto extends padre{
    
    @Override
        public void estacionar() {
        System.out.println("Como estacionar una moto. Siga estos pasos!");
        System.out.println("*************************************************");
        System.out.println("1 - Asegurese que la superficie sea firme y plana"
                + "y no este contaminada con liquidos resbaladizos"); 
        System.out.println("2 - Extender el apoyo lateral sin bajar del rodado "
                + "y comprobar que la moto no se desplace en ningun sentido");
        System.out.println("3 - Una vez debajo de la motocicleta y apoyada "
                + "en el apoyo lateral, podemos elevar la rueda trasera "
                + "montando la unidad sobre el caballete"); 
        System.out.println("4 - La distribucion del peso al estacionar una "
                + "moto es clave. Por eso es vital tomar precauciones "
                + "respecto de la pendiente.");
            }

 
        public void arrancar() {
            System.out.println("Como arrancar una moto. Siga estos pasos!");
            System.out.println("*************************************************");
            System.out.println("1 - Subase a la moto y no olvide colocarse el casco");
            System.out.println("2 - Coloque la palanca de cambio en punto muerto.");
            System.out.println("3 - Introduzca la llave, gire el tambor y arranque");   
        }
}
