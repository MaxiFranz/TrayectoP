/*
Crear la clase cuentaBancaria que tenga como atributo nombreTitular, }
tipoDeCuenta y saldo. Elegir el tipo de dato adecuado para cada uno de ellos. 
Además hacer el método extraer() que permita extraer dinero, si se puede. 
Crear un objeto de esta clase y comprobar el funcionamiento

Comenzamos con una lista de clientes. 
Ojo, una vez cerrada la aplicacion saldo queda en 0!

*/
package banco;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Banco {

    
    public static void main(String[] args) {
        
    //*************************************************************************
    //*************************************************************************
    //*************************************************************************
    //simulamos la DB de clientes al inicio del programa
    int cantClientes = 3;
    //vector de clientes. Tomamos posicion de cada valor como ID cliente
    String [] clienteN = new String [cantClientes];
        clienteN[0] = "Lionel Messi";
        clienteN[1] = "Emiliano Martinez";
        clienteN[2] = "Papu Gomez";
    
    int [] clienteDNI = new int [cantClientes];
        clienteDNI[0] = 123;
        clienteDNI[1] = 456;
        clienteDNI[2] = 789;
        
    int [] claveCliente = new int [cantClientes];
        claveCliente[0] = 999;
        claveCliente[1] = 888;
        claveCliente[2] = 777;
    
    int [] tipodecuenta = new int [cantClientes];
    //donde 1 = caja de ahorro en pesos; 2 = cuenta corriente en pesos
        tipodecuenta[0] = 1;
        tipodecuenta[1] = 2;
        tipodecuenta[2] = 1;
        
    //el vector de saldos comienza con 0 cuando empieza la aplicacion
    int [] saldoCliente = new int [cantClientes];
        saldoCliente[0] = 0;
        saldoCliente[1] = 0;
        saldoCliente[2] = 0;
    
    //*************************************************************************
    //*************************************************************************
    //*************************************************************************
    
    
    //variables de uso temporal
    int estado = 0; //Donde 0 es no logueado, 1 es logueado, 2 es casi logueado!!
    int dniClienteP = 0;
    int claveClienteP = 0;
    int nrodecliente = 0;
    int seleccion = 0;//para capturar respuestas de los popup
    
            
    //cargamos clase cuentaBancaria!
    cuentaBancaria c1 = new cuentaBancaria();
    
    //generamos el loop para que el programa no pare
    do {
        if (estado == 0){
        //mensaje de bienvenida
        ImageIcon imag = new ImageIcon("src/img/bienvenida.jpg");
        JOptionPane.showMessageDialog(null,"", 
                "Bienvenido!",
                JOptionPane.INFORMATION_MESSAGE,imag);
        
        //*********************************************************************
        
        //comenzamos el login
        c1.label = "Ingrese su DNI";//le pasamos el valor
        c1.form();//ejecutamos el metodo
        dniClienteP = c1.valorTI;//recuperamos el valor
        
            //lo buscamos en la base
             for(int i=0; i<clienteDNI.length; i++){
                if (clienteDNI[i] == dniClienteP){
                    JOptionPane.showMessageDialog(null,
                            "El DNI ingresado existe", 
                            "Bienvenido!",
                            JOptionPane.INFORMATION_MESSAGE);
                    nrodecliente = i;
                    estado = 2;
                    break;
                }
             }
             
        } else if (estado == 2){
        //hacemos que aparezca el nombre del cliente
             for(int i=0; i<cantClientes; i++){
                    if (i == nrodecliente){
                    JOptionPane.showMessageDialog(null,
                            "Bienvenido " +clienteN[i]+ "!", 
                            "",JOptionPane.INFORMATION_MESSAGE);
                 }        
            }
             
        c1.label = "Ingrese su Clave";//le pasamos el valor
        c1.form();//ejecutamos el metodo
        claveClienteP = c1.valorTI;//recuperamos el valor
        
        
            for(int i=0; i<cantClientes; i++){
                if (claveCliente[i] == claveClienteP && i == nrodecliente){
                    ImageIcon cliente = new ImageIcon("src/img/"+nrodecliente+".jpg");
                    JOptionPane.showMessageDialog(null,
                            "Ya puedes operar en nuestro banco\n"
                                    +"Nro de cliente: " +nrodecliente
                                    + "\nCliente: "+clienteN[nrodecliente] 
                                    + "\nSaldo en cuenta: "+saldoCliente[nrodecliente]          
                                    + "\nTipo de cuenta: "+tipodecuenta[nrodecliente],
                            "Bienvenido!",
                            JOptionPane.INFORMATION_MESSAGE,cliente);
                    estado = 1;
                    break;
                } 
             }
        //**********************************************************************
        //**********************************************************************
        //**********************************************************************
        } else {
        
           
    //por aca pasa si el saldo esta en 0
    while (saldoCliente[nrodecliente] == 0){
                
            seleccion = JOptionPane.showOptionDialog(
            null,
            "Parece que no tiene fondos en su cuenta!\n Que desea hacer?", 
            "Menu",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, 
            new Object[] { "Depositar", "Ver cuenta", "Salir" },  
            "opcion 1");
            
            if (seleccion != -1)
            //System.out.println("" +(seleccion + 1));
                    if (+ (seleccion + 1) == 3){
                   JOptionPane.showMessageDialog(null,
                            "Muchas gracias por usar nuestros servicios", 
                            "Logout",
                            JOptionPane.INFORMATION_MESSAGE);
                    estado = 0;
                    break;
                    } else if (+ (seleccion + 1) == 2){
                     System.out.println("Ver cuenta");  
                     ImageIcon cliente = new ImageIcon("src/img/"+nrodecliente+".jpg");
                        JOptionPane.showMessageDialog(null,
                            "Usted es nuestro mejor cliente:\n"
                                    +"Nro de cliente: " +nrodecliente
                                    + "\nCliente: "+clienteN[nrodecliente] 
                                    + "\nSaldo en cuenta: "+saldoCliente[nrodecliente]          
                                    + "\nTipo de cuenta: "+tipodecuenta[nrodecliente],
                            "Ficha de cliente",
                            JOptionPane.INFORMATION_MESSAGE,cliente);
                    } else {
                   
                        c1.tipoOperacion = 1;//deposito
                        //le pasamos el saldo de cuenta
                        c1.saldoinicio = +saldoCliente[nrodecliente];
                        c1.operaciones();
                        //devuelve el saldo nuevo
                        saldoCliente[nrodecliente] = c1.saldofinal;
                      
                    }
            
    }
    
    //si tiene fondos, viene para aca...
    while (saldoCliente[nrodecliente] > 0){
            seleccion = JOptionPane.showOptionDialog(
            null,
            "Su cuenta tiene fondos, puede operar con ella!.\nSu saldo es de: "+saldoCliente[nrodecliente]+ " pesos", 
            "Menu",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, 
            new Object[] { "Depositar", "Extraer", "Salir" },  
            "opcion 1");
            
            if (seleccion != -1)
            //System.out.println("" +(seleccion + 1));
                    if (+ (seleccion + 1) == 3){
                   JOptionPane.showMessageDialog(null,
                            "Muchas gracias por usar nuestros servicios", 
                            "Logout",
                            JOptionPane.INFORMATION_MESSAGE);
                    estado = 0;
                    break;
                    } else if (+ (seleccion + 1) == 2){
                    
                     System.out.println("Extraer"); 
                        
                        c1.tipocuenta = +tipodecuenta[nrodecliente];
                        c1.tipoOperacion = 2;//extraccion
                        c1.saldoinicio= +saldoCliente[nrodecliente];
                        c1.operaciones();
                        saldoCliente[nrodecliente] = c1.saldofinal;
                    } else {
                        
                    System.out.println("Depositar"); 
                        
                        c1.tipoOperacion = 1;//deposito
                        //le pasamos el saldo de cuenta
                        c1.saldoinicio = +saldoCliente[nrodecliente];
                        c1.operaciones();
                        //devuelve el saldo nuevo
                        saldoCliente[nrodecliente] = c1.saldofinal;
                      
                    }
        
    }       
                
           


        //**********************************************************************
        }
        
    } while (estado <= 2);
     
                    
    
}
    
}
