//este archivo pasa los datos de ID usuario y nivel a todas las internal
public class sesionainternal {

 
    private String codigoLnI;
    private String nivelLnI;
    
    public sesionainternal(String sesion_id, String sesion_nivel) {
        this.codigoLnI = sesion_id;
        this.nivelLnI = sesion_nivel;
    }

    public String getCodigoLnI() {
        return codigoLnI;
    }

    public String getNivelLnI() {
        return nivelLnI;
    }

   
    
}
