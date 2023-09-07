
package seguroscfp010923;


public class Persona {
//principales variables
String fecha;
String cuil;
String nombre;
String telefono;
String email;
String tipodeseguro;

//variables para hogar
    String mv1;  
    String mv2; 
    String mv3; 
    String mv4;  
    String mv5;  
    String mv6;  
    String mv7; 
    String mv8;  
    String mv9; 
    String mv10;
    String mv11;  
    
    String mv12; 
    String mv13; 
    String mv14;  
    String mv15;  
    String mv16;  
    String mv17; 
    String mv18;  
    String mv19; 
    String mv20; 
    String mv21;
    
    String mv22;  
    String mv23; 
    String mv24; 
    String mv25;  
    String mv26;  
    String mv27;  
    String mv28; 
    String mv29;  
    String mv30; 
    String mv31; 
    String mv32; 
    String mv33; 
    String mv34;

    



//constructor para seguro hogar

    public Persona(String f1tipodeseguro, String  f1fecha, String f1cuil, String f1nombre, String f1telefono, String f1email,String v1, String v4, String v2,String v5,String v3, String v6,String v7,String v8,String v9,String v10,String v11){
        this.fecha = f1fecha;
        this.cuil = f1cuil;
        this.nombre = f1nombre;
        this.telefono = f1telefono;
        this.email = f1email;
        this.tipodeseguro = f1tipodeseguro;
        //aca siguen las variables especificas del tipo de seguro
        this.mv1 = v1;
        this.mv2 = v2;
        this.mv3 = v3;
        this.mv4 = v4; 
        this.mv5 = v5;
        this.mv6 = v6;
        this.mv7 = v7;
        this.mv8 = v8; 
        this.mv9 = v9;
        this.mv10 = v10;
        this.mv11 = v11;
    }
    
    //constructor para seguro vehiculos
    public Persona (String f1tipodeseguro, String  f1fecha, String f1cuil, String f1nombre, String f1telefono, String f1email,String v12, String v13, String v14,String v15,String v16, String v17,String v18,String v19,String v20,String v21){
        this.fecha = f1fecha;
        this.cuil = f1cuil;
        this.nombre = f1nombre;
        this.telefono = f1telefono;
        this.email = f1email;
        this.tipodeseguro = f1tipodeseguro;
        //aca siguen las variables especificas del tipo de seguro
        this.mv12 = v12;
        this.mv13 = v13;
        this.mv14 = v14;
        this.mv15 = v15; 
        this.mv16 = v16; 
        this.mv17 = v17;
        this.mv18 = v18; 
        this.mv19 = v19;
        this.mv20 = v20;
        this.mv21 = v21;
    }
    
    //constructor para seguro de vida
    
     public Persona (String f1tipodeseguro, String  f1fecha, String f1cuil, String f1nombre, String f1telefono, String f1email,String v22, String v23, String v24,String v25,String v26, String v27,String v28,String v29,String v30,String v31,String v32,String v33,String v34){
        this.fecha = f1fecha;
        this.cuil = f1cuil;
        this.nombre = f1nombre;
        this.telefono = f1telefono;
        this.email = f1email;
        this.tipodeseguro = f1tipodeseguro;
        //aca siguen las variables especificas del tipo de seguro
        this.mv22 = v22;
        this.mv23 = v23;
        this.mv24 = v24;
        this.mv25 = v25; 
        this.mv26 = v26; 
        this.mv27 = v27;
        this.mv28 = v28; 
        this.mv29 = v29;
        this.mv30 = v30;
        this.mv31 = v31;
        this.mv32 = v32;
        this.mv33 = v33;
        this.mv34 = v34;
     }    
    //getter de todas las variables
    public String getCuil() {
        return cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTipodeseguro() {
        return tipodeseguro;
    }
    
     public String getFecha() {
        return tipodeseguro;
    }

    public String getMv1() {
        return mv1;
    }

    public String getMv2() {
        return mv2;
    }

    public String getMv3() {
        return mv3;
    }

    public String getMv4() {
        return mv4;
    }

    public String getMv5() {
        return mv5;
    }

    public String getMv6() {
        return mv6;
    }

    public String getMv7() {
        return mv7;
    }

    public String getMv8() {
        return mv8;
    }

    public String getMv9() {
        return mv9;
    }

    public String getMv10() {
        return mv10;
    }

    public String getMv11() {
        return mv11;
    }

    public String getMv12() {
        return mv12;
    }

    public String getMv13() {
        return mv13;
    }

    public String getMv14() {
        return mv14;
    }

    public String getMv15() {
        return mv15;
    }

    public String getMv16() {
        return mv16;
    }

    public String getMv17() {
        return mv17;
    }

    public String getMv18() {
        return mv18;
    }

    public String getMv19() {
        return mv19;
    }

    public String getMv20() {
        return mv20;
    }

    public String getMv21() {
        return mv21;
    }

    public String getMv22() {
        return mv22;
    }

    public String getMv23() {
        return mv23;
    }

    public String getMv24() {
        return mv24;
    }

    public String getMv25() {
        return mv25;
    }

    public String getMv26() {
        return mv26;
    }

    public String getMv27() {
        return mv27;
    }

    public String getMv28() {
        return mv28;
    }

    public String getMv29() {
        return mv29;
    }

    public String getMv30() {
        return mv30;
    }

    public String getMv31() {
        return mv31;
    }

    public String getMv32() {
        return mv32;
    }

    public String getMv33() {
        return mv33;
    }

    public String getMv34() {
        return mv34;
    }

    
    
}
