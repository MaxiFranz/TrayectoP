
package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
    
    double sUbtotal;
    int mPago;
    long nTarjeta;
    double rEcdesc;
    double tOtal;
    int cUotas;
    
    
    //pedimos el importe
    System.out.println("---------------------------------");
    System.out.println("---Al Uso Nostro - Facturacion---");
    System.out.println("---------------------------------");
    System.out.println("- Ingrese el total de la compra -");
    
    //guardamos seleccion
    sUbtotal = teclado.nextDouble();
    
    //mostramos opciones de pago
    System.out.println("---------------------------------");
    System.out.println("--- Seleccione medio de pago ----");
    System.out.println("--- 1 - Efectivo");
    System.out.println("--- 2 - Tarjeta de Credito");
    System.out.println("--- 3 - Tarjeta de debito");
    
    //guardamos seleccion
    mPago = teclado.nextInt();
    
    switch (mPago){
            
            case 1: 
                //pago efectivo
                //Calculamos descuento
                rEcdesc = 40* +sUbtotal / 100;
                tOtal = +sUbtotal - +rEcdesc;
                
                //mostramos total con recargos /descuentos y modo de pago
                System.out.println("Subtotal : " +sUbtotal);
                System.out.println("Descuento : " +rEcdesc);
                System.out.println("Total a pagar : " +tOtal);
                System.out.println("Medio de pago : Efectivo");
                break;
            
            case 2:
                //pago con tarjeta de credito
                //Calculamos recargo
                rEcdesc = 20* +sUbtotal / 100;
                tOtal = +sUbtotal + +rEcdesc;    
                
                //si paga con tarjeta pedir numeros 
                System.out.println("---------------------------------");
                System.out.println("----- Ingrese los 16 digitos ----");
                nTarjeta = teclado.nextLong();
                
                //si paga con tarjeta de credito, debe elegir plan de pagos
                System.out.println("---------------------------------");
                System.out.println("----- Seleccione plan de pagos ----");
                System.out.println("----- 1 cuota");
                System.out.println("----- 2 cuotas");
                System.out.println("----- 3 cuotas");
                cUotas = teclado.nextInt();
                
                //mostramos total con recargos /descuentos y modo de pago
                System.out.println("Subtotal : " +sUbtotal);
                System.out.println("Recargo : " +rEcdesc);
                System.out.println("Total a pagar : " +tOtal);
                System.out.println("Medio de pago : Tarjeta de credito");
                System.out.println("Nro de Tarjeta : " +nTarjeta);
                if (cUotas == 1){
                System.out.println("Plan de pago : " +cUotas+ " cuota");    
                }else{
                System.out.println("Plan de pago : " +cUotas+ " cuotas");   
                } 
                
                break;
                    
            default:
                //pago con tarjeta de debito
                //Calculamos recargo
                rEcdesc = 10* +sUbtotal / 100;
                tOtal = +sUbtotal + +rEcdesc;    
                
                //si paga con tarjeta pedir numeros
                System.out.println("---------------------------------");
                System.out.println("----- Ingrese los 16 digitos ----");
                nTarjeta = teclado.nextLong();
                
                //mostramos total con recargos /descuentos y modo de pago
                System.out.println("Subtotal : " +sUbtotal);
                System.out.println("Recargo : " +rEcdesc);
                System.out.println("Total a pagar : " +tOtal);
                System.out.println("Medio de pago : Tarjeta de debito");
                System.out.println("Nro de Tarjeta : " +nTarjeta);
                break;

    }   
    

    }
    
}
