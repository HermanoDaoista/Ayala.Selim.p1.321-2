
package parcialrogelioselim;

import java.util.Objects;

public abstract class Especie {
    private final String nombre;
    private final String tanque;
    private final TipoAgua tipoagua;

    public Especie(String nombre, String tanque, TipoAgua tipoagua) {
        this.nombre = nombre;
        this.tanque = tanque;
        this.tipoagua = tipoagua;
    }
    
    public abstract void reproducirse();
    
    public abstract void respirar();
    
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
            return nombre.equals(e.nombre) && tanque.equals(e.tanque);
        }
        
        return false;
        
    }
    
    public int hashcode() {
        return Objects.hash(nombre, tanque);
    }
}
