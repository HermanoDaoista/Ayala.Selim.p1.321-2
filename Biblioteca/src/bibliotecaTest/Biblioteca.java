
package bibliotecaTest;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
     private List<Publicacion> listapubliaciones;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listapubliaciones = new ArrayList<>();
    }
    
      
    private void vereficarRepetidas(Publicacion p) {
        if(listapubliaciones.contains(p)) {
            throw new ErrorRepetidas();
        }
    }
  
     public void mostrarPubliacaciones() {
         for(Publicacion p : listapubliaciones) {
             System.out.println(p.toString());
         }
     }   
    
    
    
    public void agregarPublicaciones(Publicacion p) {
       
        if(p== null) {
            throw new IllegalArgumentException("Publicacion nula");
        }
        vereficarRepetidas(p);
        listapubliaciones.add(p);
    }
    
    public void leerpublicaciones() {
        for(Publicacion p : listapubliaciones) {
            if((p instanceof Leible l)) {
                l.leer();
            }else {
                System.out.println("No puede ser leida una Ilustacion");
            }
            
            
            
        }
    }
    
    
     
     
}
