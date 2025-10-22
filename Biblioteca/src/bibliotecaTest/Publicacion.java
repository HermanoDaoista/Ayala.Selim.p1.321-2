
package bibliotecaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public abstract class Publicacion {
    private String titulo;
    private int anioPubliacion;
   

    public Publicacion(String titulo, int anioPubliacion) {
        this.titulo = titulo;
        this.anioPubliacion = anioPubliacion;
        
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || o.getClass() != getClass()) {
            return false;
        }
        
        Publicacion other = (Publicacion) o;
        
        return titulo.equals(other.titulo) && anioPubliacion == (other.anioPubliacion);
    }

    @Override
    public int hashCode() {
       return Objects.hash(titulo, anioPubliacion);
    }
  
        
        
    
    
    
}
