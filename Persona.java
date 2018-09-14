package backend;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String lugar;
   

    public Persona(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
       
        
    }
    
    public boolean empiezaPor(String inicio) {
        if(inicio.isEmpty() || inicio.length()>lugar.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if( inicio.charAt(i) != lugar.charAt(i) )
                return false;
        return true;
    }
    public boolean empieza(String inicio) {
        if(inicio.isEmpty() || inicio.length()>nombre.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if( inicio.charAt(i) != nombre.charAt(i) )
                return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Nombre : "+nombre+
               "\nlugar: "+lugar ;
        
    }
}
