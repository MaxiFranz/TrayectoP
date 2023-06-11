
package vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class autos {
    
    //Variables / atributos
    String variable1 = "";
    String variable2 = "";
    int kilometraje = 0;
       
    //variable para uso temporal. 
    String label = "";//etiquetas varias
    String valorTS = "";//recupera valores por input
    String rutaimag = "";//imagen segun estado auto
    
    //cargamos tools
    tools c2 = new tools();
    
    //metodo para completar ficha auto
    public void completaficha(){
            //generamos un loop para el ingreso de datos 
        
                for(int i=0; i<3; i++){
                    switch (i){
                        case 0:
                        label = "Marca";
                        break;
                        case 1:
                        label = "Modelo";
                        break;
                        case 2:
                        label = "Kilometraje";
                        break;
                        default:
                        break;
                    } 
                
            //aca pedimos que el tipito complete los datos    
            
            do {
            valorTS = JOptionPane.showInputDialog(null, 
                        "Ingrese " +label, "", 
                        JOptionPane.QUESTION_MESSAGE); 
            } while (valorTS == null || valorTS.isEmpty());
            //aca grabamos los valores en el vector    
                
                if (i == 2){//si el dato es kilometraje llama al validador
                    c2.valorTS = valorTS;//pasamos el valor a tools
                    c2.stringtoint();//ejecutamos el metodo
                    kilometraje = c2.valorTI;//recuperamos el valor de tools
                    
                } else if (i == 0) {
                    variable1 = valorTS; 
                } else {
                    variable2 = valorTS;
                }
            
            
            }        
            
        
    }
    
    
    //metodo para comprobar estado auto
    public void estadoAuto(){
        //System.out.println(kilometraje);
        if (kilometraje == 0){
        label = "nuevo";
        rutaimag = "src/img/nuevo.jpg";
    
        } else if (kilometraje <10000){
        label = "poco usado";
        rutaimag = "src/img/pocouso.jpg";
        
        } else if (kilometraje <100000){
        label = "usado";   
        rutaimag = "src/img/usado.jpg";
    
        } else {
        label = "bastante usado"; 
        rutaimag = "src/img/usadisimo.jpg";
        }  
        
    }    
    
}
