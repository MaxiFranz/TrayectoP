
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class archivo_cambiomoneda {
    public static void archivo_crear(cambiomoneda cambiomoneda){
          //declaramos cual es el archivo txt
        File directorio = new File(".\\src\\dbs\\");
        File archivo = new File(directorio,"operaciones.txt");
        
        //aca preguntamos si existe
        if (archivo.exists()== true)   {
            //JOptionPane.showMessageDialog(null, "El archivo existe!!"); 
        } else {
            //sino existe lo creamos
            try {
                archivo = new File (".\\src\\dbs\\operaciones.txt");
                if(archivo.createNewFile()){
                    //JOptionPane.showMessageDialog(null, "El archivo se ha creado con exito");
                }
                
            } catch (IOException e){
                System.out.println(e);
            }
            
        }
        
        
}

   
    public static void archivo_escribir(String linea){
            
        File directorio = new File(".\\src\\dbs\\");
        File archivo = new File(directorio,"operaciones.txt");
        
            //aca recuperamos los valores que estan en el string
        String texto = (linea);
         
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
       
        try {
            
            w = new FileWriter(archivo,true);
            bw = new BufferedWriter (w);
            wr = new PrintWriter (bw);
            
           
            wr.write(""+texto+"\n");
            wr.close();
            bw.close();
            JOptionPane.showMessageDialog(null, "El pedido se grabo correctamente");
        } catch (IOException e){
            System.out.println(e);
        }
                
               
}

   
}
