
package seguroscfp010923;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class archivo {
    File archivo;
    gestor s = new gestor();
    
    public void crearArchivo(){
        try {
            archivo = new File ("Seguros.txt");
                if (archivo.createNewFile()){
                JOptionPane.showMessageDialog(null, "El archivo fue creado con exito");
                 } 
        } catch (IOException e){
            System.out.println(e);
        }
    }
    
    public void escribirArchivo(Persona persona){
        String linea1 = (persona.getFecha()+","+persona.getCuil()+",");
        String linea2 = (persona.getNombre()+"," +persona.getTelefono()+","+persona.getEmail()+",");
        
        String lineaH1 = (persona.getMv1()+","+persona.getMv4()+","+persona.getMv2()+","+persona.getMv5()+",");
        String lineaH2 = (persona.getMv3()+","+persona.getMv6()+","+persona.getMv7()+","+persona.getMv8()+",");
        String lineaH3 = (persona.getMv9()+","+persona.getMv10()+","+persona.getMv11()+"\n");
        
        String lineaR1 = (persona.getMv12()+","+persona.getMv13()+","+persona.getMv14()+","+persona.getMv15()+",") ;
        String lineaR2 = (persona.getMv16()+","+persona.getMv17()+","+persona.getMv18()+","+persona.getMv19()+",") ;
        String lineaR3 = (persona.getMv20()+","+persona.getMv21()+"\n") ;
        
        String lineaV1 = (persona.getMv22()+","+persona.getMv23()+","+persona.getMv24()+","+persona.getMv25());
        String lineaV2 = (persona.getMv26()+","+persona.getMv27()+","+persona.getMv28()+","+persona.getMv29());
        String lineaV3 = (persona.getMv30()+","+persona.getMv31()+","+persona.getMv32()+","+persona.getMv33()+","+persona.getMv34());
        
        try {
            FileWriter escribir = new FileWriter(archivo,true);
                switch (persona.getTipodeseguro()){
                    case "Hogar":
                        escribir.write(linea1);
                        escribir.write(linea2);
                        
                        escribir.write(lineaH1);
                        escribir.write(lineaH2);
                        escribir.write(lineaH3);
                        JOptionPane.showMessageDialog(null, "La poliza de Hogar fue creada con exito");
                        break;
                     case "Vehiculos":
                        escribir.write(linea1);
                        escribir.write(linea2);
                        
                        escribir.write(lineaR1);
                        escribir.write(lineaR2);
                        escribir.write(lineaR3);
                         JOptionPane.showMessageDialog(null, "La poliza de Vehiculos fue creada con exito");
                         break;
                     case "Vida":
                        escribir.write(linea1);
                        escribir.write(linea2);
                        
                        escribir.write(lineaV1);
                        escribir.write(lineaV2);
                        escribir.write(lineaV3);
                        JOptionPane.showMessageDialog(null, "La poliza por Seguro de Vida fue creada con exito");
                       
                    break;
                }
            escribir.close();
        } catch (IOException e){
            System.out.println(e);
        }
        
    }
}
