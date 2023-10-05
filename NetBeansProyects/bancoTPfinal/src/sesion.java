//este archivo pasa los datos de ID usuario y nivel a main
public class sesion {
    private String codigoLn;
    private String nivelLn;

    public sesion(String codigoL, String nivelL) {
        
        this.codigoLn = codigoL;
        this.nivelLn = nivelL;
    }

    public String getCodigoLn() {
        return codigoLn;
    }

    public String getNivelLn() {
        return nivelLn;
    }

 
    
    
    
}
