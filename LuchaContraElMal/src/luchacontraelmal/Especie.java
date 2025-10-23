
package luchacontraelmal;

import java.util.Objects;

public abstract class Especie {
    private String nombre;
    private String tanque;
    private TipoAgua tipoagua;

    public Especie(String nombre, String tanque, TipoAgua tipoagua) {
        this.nombre = nombre;
        this.tanque = tanque;
        this.tipoagua = tipoagua;
    }
    
    public TipoAgua getTipo() {
        return tipoagua;
    }
    
    @Override
    public String toString() {
        return " Nombre: " + nombre+" Tanque: " + tanque + " Tipo De Agua: " + tipoagua;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null) {
            return false;
        }
        
        if(o instanceof Especie e) {
            return nombre.equals(e.nombre);
        }
        
        return false;
        
    }
    
    public int hashcode() {
        return Objects.hash(nombre);
    }
}
